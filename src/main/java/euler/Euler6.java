package com.euler;

import java.util.stream.LongStream;

public class Euler6 {
  public static void main(String... args) {
    long sumOfSquares = LongStream.rangeClosed(1, 100).map(x -> x * x).sum();

    long sums = LongStream.rangeClosed(1, 100).sum();
    long squareOfSums = sums * sums;

    System.out.println(squareOfSums - sumOfSquares);

  }
}
