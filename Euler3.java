package com.euler;

import java.util.HashSet;
import java.util.Set;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class Euler3 {

  public static IntPredicate isPrime = n -> n < 4
      || !(n % 2 == 0 || IntStream.range(2, (int) Math.sqrt(n) + 1).filter(x -> x % 2 != 0 && n % x == 0).findAny()
          .isPresent());

  public static void main(String[] args) {
    System.out.println(isPrime.test(5));
    // TODO Auto-generated method stub
    // primeFactor(20).stream().forEach(System.out::println);

    int n = 6;
    IntStream.range(2, (int) Math.sqrt(n) + 1).filter(x -> n % x == 0).filter(isPrime).forEach(System.out::println);
  }

  static Set<Long> primeFactor(long num) {

    Set<Long> factors = new HashSet<>();
    for (long i = 2; i <= num; i++) {
      while (num % i == 0) {
        factors.add(i);
        num /= i;
      }
    }
    return factors;
  }

}
