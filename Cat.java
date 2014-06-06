// Cat.java
// Copyright (C) 2014 Kyle Maune
// Reads in text files specified as the first command line arguments, concatenates them, and writes the result to filename
// specified as the last command line arguments.

public class Cat {

  // this class should not be instantiated
  private Cat() { }

  public static void main(String[] args) {
    Out out = new Out(args[args.length -1]);
    for (int i = 0; i < args.length - 1; i++); {
      In in = new In(args[i]);
      String s = in.readAll();
      out.println(s);
      in.close();
    }
    out.close();
  }
}
