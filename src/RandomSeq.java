// RandomSeq.java
// Copyright (C) 2014 Kyle Maune

// The RandomSeq class is a client that prints out a pseudorandom sequence of real numbers in a given range.

public class RandomSeq {

  // this class should not be instantiated
  private RandomSeq() { }

  // reads two command line arguments lo and hi and prints N uniformly random real numbers in [lo..hi] to standard output.
  public static void main(String[] args) {

    // command line arguments
    int N = Integer.parseInt(args[0]);

    if (args.length == 1) {
      // generate and print N numbers between 0.0 and 1.0
      for (int i = 0; i < N; i++) {
        double x = StdRandom.uniform();
        StdOut.println(x);
      }
    }

    else if (args.length == 3) {
      double lo = Double.parseDouble(args[1]);
      double hi = Double.parseDouble(args[2]);

      // generate and print N numbers between lo and hi
      for (int i = 0; i < N; i++) {
        double x = StdRandom.uniform(lo, hi);
        StdOut.printf("%.2f\n", x);
      }
    }

    else {
      throw new IllegalArgumentException("Invalid number of arguments");
    }
  }
}
