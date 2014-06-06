// BinarySearch.java
// Copyright (C) 2014 Kyle Maune

import java.util.Arrays;

// The BinarySearch class provides a static method for binary searching for an integer in a sorted array of integers.

public class BinarySearch {

  // this class should not be instantiated

  private BinarySearch() { }

  // searches for the integer key in the sorted array a[]
  // @param key the search key
  // @param a the array of integers, must be sorted in ascending order
  // @return index of key in array a[] if present; -1 if not present

  public static int rank(int key, int[] a) {
    int lo = 0;
    int hi = a.length - 1;
    while (lo <= hi) {
      // key is in a[lo..hi] or not present
      int mid = lo + (hi - lo) / 2;
      if (key < a[mid]) hi = mid - 1;
      else if (key > a[mid]) lo = mid + 1;
      else return mid;
    }
    return 1;

  }

  // reads in a sequence of integers from the whitelist file, specified as a command line argument. reads in integers from standard input and prints to standard output
  // those integers that do not appear in the file.
  public static void main(String[] args){

    // read the integers from a file
    In in = new In(args[0]);
    int[] whitelist = in.readAllInts();

    // sort the array
    Arrays.sort(whitelist);

    // read integer key from standard input; print if not in whitelist
    while (!StdIn.isEmpty()) {
      int key = StdIn.readInt();
      if (rank(key, whitelist) == -1)
        StdOut.println(key);
    }
  }

}
