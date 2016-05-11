package com.euler;

import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Euler7 {

  public static Predicate<? super Integer> isPrime = n -> n < 4
      || !(n % 2 == 0 || IntStream.range(2, (int) Math.sqrt(n) + 1).filter(x -> x % 2 != 0 && n % x == 0).findAny()
          .isPresent());

  public static void main(String[] args) {
    int prime = Stream.iterate(3, n -> n + 2).filter(isPrime).limit(10000)
        .reduce(0, (a, b) -> b);
    System.out.println(prime);

  }

}
