package com.code;

import java.util.stream.IntStream;

public class Diamond {
  public static void main(String[] args) {
    int n = 5;
      IntStream.rangeClosed(1, n).forEach(i -> {
      IntStream.range(0, n - i).forEach(j -> System.out.print(" "));
      IntStream.rangeClosed(1, 2 * i - 1).forEach(j -> System.out.print("*"));
      System.out.println();
    });

      
    IntStream.range(1, n).forEach(i -> {
      IntStream.range(0, i).forEach(j -> System.out.print(" "));
      IntStream.rangeClosed(1, 2 * (n - i) - 1).forEach(j -> System.out.print("*"));
      System.out.println();
    });
  
  }
  
 
}

