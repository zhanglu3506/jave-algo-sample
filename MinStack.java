// Enhance the stack implementation to support min() operation. min() should return the current minimum value in the stack.
// If the stack is empty, min() should return -1.
//
// pop() - remove and return the top element, if the stack is empty, return -1
//
// push(int element) - push the element to top
// top() - return the top element without remove it, if the stack is empty, return -1
// min() - return the current min value in the stack.
public class MinStack{
  Deque<Integer> stack;
  Deque<Integer> minStack;
  public Solution() {
    stack = new LinkedList();
    minStack = new LinkedList();
  }

  public int pop() {
    if(stack.isEmpty()){
      return -1;
    }
    if(stack.peek() == minStack.peek()){
      minStack.pop();
    }
    return stack.pop();
  }

  public void push(int element) {
    stack.push(element);
    if(minStack.isEmpty()){
      minStack.push(element);
    }
    if(element <= minStack.peek()){
      minStack.push(element);
    }
  }

  public int top() {
    if(stack.isEmpty()){
      return -1;
    }
    return stack.peek();
  }

  public int min() {
    if(stack.isEmpty()){
      return -1;
    }
    return minStack.peek();
  }
}
