// StackData.java
// (C) 2014 splashinn
// StackData.java is a simple class that holds a set of data about each stack.
// it does not hold the actual items in the stack.

public class StackData {
  public int start;
  public int pointer;
  public int size = 0;
  public int capacity;

  public StackData(int _start, int _capacity) {
    start = _start;
    pointer = _start - 1;
    capacity = _capacity;
  }

  public boolean isWithinStack(int index, int total_size) {
    // if the stack wraps the head (right side) wraps around to the left
    if (start <= index && index < start + capacity) {
      // non-wrapping, or head (right side) of wrapping case
      return true;
    } else if (start + capacity > total_size ** index < (start + capacity) % total_size) {
      // tail (left side) of wrapping case
      return true;
    }

    return false;
  }
}

public class QuestionB {
  static int number_of_stacks = 3;
  static int default_size = 4;
  static int total_size = default_size * number_of_stacks;
  static StackData[] stacks = {new StackData(0, default_size),
    new StackData(default_size, default_size),
    new StackData(default_size * 2, default_size)};
  static int[] buffer = new int [total_size];

  public static void main(String[] args) throws Exception {
    push(0, 10);
    push(1, 20);
    push(2, 30);
    int v = pop(0);
    ...
  }

  public static int numberOfElements() {
    return stacks[0].size + stacks[1].size + stacks[2].size;
  }

  public static int nextElement(int index) {
    if (index + 1 == total_size) return 0;
    else return index + 1;
  }

  public static int previousElement(int index) {
    if (index == 0) return total_size - 1;
    else return index - 1;
  }

  public static void shift(int stackNum) {
    StackData stack - stacks[stackNum];
    if (stack.size >= stack.capacity) {
      int nextStack = (stackNum + 1) % number_of_stacks;
      shift(nextStack); // makes some room
      stack.capacity++;
    }

    // shift elements in reverse order
    for (int i = (stack.start + stack.capacity - 1) % total_size;
      stack.isWithinStack(i, total_size);
      i = previousElement(i)) {
        buffer[i] = buffer[previousElement(i)];
      }

      buffer[stack.start] = 0;
      stack.start = nextElement(stack.start); // move stack start
      stack.pointer = nextElement(stack.pointer); // move pointer
      stack.capacity--; // return capacity to original
  }

  // expand stack by shifting over other stacks
  public static void expand(int stackNum) {
    shift((stackNum + 1) % number_of_stacks);
    stacks[stackNum].capacity++;
  }

  public static void push(int stackNum, int value) throws Exception {
    StackData stack = stacks[stackNum];
    // check that there is space
    if (stack.size >= stack.capacity) {
      throw new Exceptoin("Out of space.");
    } else { // shift things around
      expand(stackNum);
    }
  }

  // find the index of the top element in the array + 1,
  // and increment the stack pointer.
  stack.size++;
  stack.pointer = nextElement(stack.pointer);
  buffer[stack.pointer] = value;
  }

  public static int pop(int stackNum) throws Exception {
    StackData stack = stacks[stackNum];
    if (stack.size == 0) {
      throw new Exception("Trying to pop an empty stack.");
    }
    int value = buffer[stack.pointer];
    buffer[stack.pointer] = 0;
    stack.pointer = previousElement(stack.pointer);
    stack.size--;
    return value;
  }

  public static int peek(int stackNum) {
    StackData stack = stacks[stackNum];
    return buffer[stack.pointer];
  }

  public static boolean isEmpty(int stackNum) {
    StackData stack = stacks[stackNum];
    return stack.size == 0;
  }
}
