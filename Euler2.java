package com.euler;

import java.util.stream.BaseStream;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.StreamSupport;


public class Euler2 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    // System.out.println(IntStream.range(1, 500).map(x -> fibonacci(x)).filter(x -> x < 4000000 && x % 2 == 0).sum());
    System.out.println(IntStream.iterate(1, x -> fibonacci(x) + 1).filter(x -> x < 4000000 && x % 2 == 0).sum());
  }

  public static int fibonacci(int number) {
    if (number == 1 || number == 2) {
      return 1;
    }
    return fibonacci(number - 1) + fibonacci(number - 2); // tail recursion
  }


}
