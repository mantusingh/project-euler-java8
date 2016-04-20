package euler;

import java.util.HashSet;
import java.util.Set;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class Euler3 {

  public static LongPredicate isPrime = n -> n < 4
      || !(n % 2 == 0 || IntStream.range(2, (int) Math.sqrt(n) + 1).filter(x -> x % 2 != 0 && n % x == 0).findAny()
          .isPresent());

  public static void main(String[] args) {
    long n = 600851475143l;
    System.out.print(LongStream.range(2, Math.round(Math.sqrt(n))).filter(x -> n % x == 0).filter(isPrime).max()
        .getAsLong());
  }
}
