package com.euler;

import java.util.stream.IntStream;

public class Euler1 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    System.out.println(IntStream.range(1, 1000).filter(x -> x % 3 == 0 || x % 5 == 0).sum());
  }

}
