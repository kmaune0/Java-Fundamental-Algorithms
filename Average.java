// Average.java
// Copyright (C) 2014 Kyle Maune
// Reads in a sequence of real numbers, and computes their average.
// The Average class provides a client for reading in a sequence of real numbers and printing out their average.

public class Average {

  // this class should not be instantiated
  private Average() { }

  // Reads in a sequence of real numbers from standard input and prints out their average to standard output.
  public static void main(String[] args) {
    int count = 0; // number input values
    double sum = 0.0; // sum of input values

    // read data and compute statistics
    while (!StdIn.isEmpty()) {
      double value = StdIn.readDouble();
      sum += value;
      count++;
    }

    // compute the average
    double average = sum / count;

    // print results
    StdOut.println("Average is " + average);
  }
}
