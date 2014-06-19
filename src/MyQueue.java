// MyQueue.java
// (C) 2014 splashinn
// implement a MyQueue class which implements a queue using two stacks

public class MyQueue<T> {
  Stack<T> stackNewest, stackOldest;

  public MyQueue() {
    stackNewest = new Stack<T>();
    stackOldest = new Stack<T>();
  }

  public int size() {
    return stackNewest.size() + stackOldest.size();
  }

  public void add(T value) {
    // push ont stackNewest, which always has the newest elements on top
    stackNewest.push(value);
  }

  // move elements from stackNewest into stackOldest. this is usually done so that operations can be done on stackOldest
  private void shiftStacks() {
    if (stackOldest.isEmpty()) {
      while (!stackNewest.isEmpty()) {
        stackOldest.push(stackNewest.pop());
      }
    }
  }

  public T peek() {
    shiftStacks(); // ensure stackOldest has the current elements
    return stackOldest.peek(); // retrieve the oldest item
  }

  public T remove() {
    shiftStacks(); // ensure stackOldest has the current elements
    return stackOldest.pop(); // pop the oldest item
  }
}
