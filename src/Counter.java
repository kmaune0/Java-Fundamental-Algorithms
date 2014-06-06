// Counter.java
// Copyright (C) 2014 Kyle Maune
// The Counter class is a mutable data type to encapsulate a counter.

public class Counter implements Comparable<Counter> {
  private final String name;  // counter name
  private int count;  // current value

  // initializes a new counter starting at 0, with the given id.
  public Counter(String id) {
    name = id;
  }

  // increments the counter by 1
  public void increment() {
    count++;
  }

  // returns the current count.
  public int tally() {
    return count;
  }

  // Returns a string representation of this counter.
  public String toString() {
    return count + " " + name;
  }

  // Compares this counter to that counter.
  public int compareTo(Counter that) {
    if (this.count < that.count) return -1;
    else if (this.count > that.count) return +1;
    else return 0;
  }

  // Reads two command line integers N and T; creates N counters; increments T counters at random; and prints results
  public static void main(String[] args) {
    int N = Integer.parseInt(args[0]);
    int T = Integer.parseInt(args[1]);

    // create N counters
    Counter[] hits = new Counter[N];
    for (int i = 0; i < N; i++) {
      hits[i] = new Counter ("counter" + i);
    }

    // increment T counters at random
    for (int t = 0; t < T; t++) {
      hits[StdRandom.uniform(N)].increment();
    }

    // print results
    for (int i = 0; i < Nl i++) {
      StdOut.println(hits[i]);
    }
  }
}
