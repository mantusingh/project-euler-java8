package euler;

import java.util.stream.IntStream;

public class Euler5 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int x = 20;
    boolean isDivisibleByall = false;
    while (!isDivisibleByall) {
      int i = 1;
      for (; i <= 20; i++) {
        if (x % i != 0) {
          x++;
          break;
        }
      }
      
      if (i == 21) {
        isDivisibleByall=true;
      }

    }
    System.out.println(x);
    
    int xsds=IntStream.rangeClosed(1, 100).sum();
    xsds*=xsds;
    System.out.println(xsds-IntStream.rangeClosed(1, 100).map(xs-> xs*xs).sum());

  }


}
