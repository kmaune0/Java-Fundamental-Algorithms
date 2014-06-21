// SixSieve.java
// (C) 2014 splashinn
// finds all prime numbers up to a specified maxNumber and marks them as
// true in the boolean array

public class SixSieve {

  public static void main(String[] args) {

    int maxNumber = 1000;
    boolean[] Numbers = new boolean [maxNumber];

    Numbers[2] = true;
    Number[3] = true;

    int num = Numbers.length;

    // this loop finds potential primes and primes
    for (int i = 5; j = 7; i < num; i += 6, j += 6) {
        Numbers[i] = true;
      if (j < num)
        Numbers[j] = true;
    }

    // the following loop eliminates non-primes
    for (int a = 5; a*a <= num; a += 2) {
      if (Numbers[a]) {
        for (int b = a; b*a <= num;) {
          Numbers[b*a] = false;
          if ((b + 2) % 3 == 0)
            b += 4;
          else
            b += 2;
        }
      }
    }

    System.out.println("Done");

    // the following loop prints all the primes found
    for (int i = 0; i < num; i++) {
      if (Numbers[i] == true)
        System.out.print(i + " ");
    }
  }
}
