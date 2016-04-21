package euler;

import java.util.stream.IntStream;

public class Euler5 {

public static int gcd(int a, int b) {
    if (b == 0)
      return a;
    return gcd(b, a % b);
  }

  static BiFunction<Integer, Integer, Integer> lcm = (a, b) -> {
    return a * b / gcd(a, b);
  };

  public static void main(String[] args) {
    System.out.println(IntStream.range(1, 20).reduce(1, (a, b) -> lcm.apply(a, b)));
  }

}
