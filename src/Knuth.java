// Knuth.java
// Copyright (C) 2014 Kyle Maune
// Reads in a list of strings and prints them in a random order.
// The Knuth shuffling algorithm guarantees to rearrange the elements in uniformly random order,
// under the assumption that Math.random() generates independent and uniformly distributed numbers between 1 and 0.

public class Knuth {

  // this class should not be instantiated
  private Knuth() { }

  public static void shuffle(Object[] a) {
    int N = a.length;
    for (int i = 0; i < N; i++) {
      // choose index uniformly in [i, N-1]
      int r = i + (int) (Math.random() * (N - i));
      Object swap = a[r];
      a[r] = a[i];
      a[i] = swap;
    }
  }
  // reads in a sequence of strings from standard input, shuffles them, and prints out the results.
  public static void main(String[] args) {

    // read in the data
    String[] a = StdIn.readAllStrings();

    // shuffle the array
    Knuth.shuffle(a);

    // print results
    for (int i = 0; i < a.length; i++)
      StdOut.println(a[i];
  }
}
