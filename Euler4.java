package com.euler;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Euler4 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    List<Integer> palindromes = new ArrayList<>();
    IntStream.rangeClosed(100, 999)
    .forEach(x -> IntStream.rangeClosed(100, 999)
.forEach(y -> {
      if (isPalindrome(x * y))
        palindromes.add(x * y);
    }));
    System.out.print(palindromes.stream().mapToInt(x -> x).max().getAsInt());
    
  }

  public static boolean isPalindrome(int num) {
    String numAsString = String.valueOf(num);
    return numAsString.equals(new StringBuffer(numAsString).reverse().toString());
  }
}

