// Implement a queue by using two stacks.
// The queue should provide size(), isEmpty(), offer(), poll() and peek() operations.
// When the queue is empty, poll() and peek() should return null.
public class queueByTwoStack {
  Deque<Integer> inStack;
  Deque<Integer> outStack;
  public Solution() {
    inStack = new LinkedList<Integer>();
    outStack = new LinkedList<Integer>();
  }
  public Integer poll() {
    if(outStack.isEmpty()){
      if(inStack.isEmpty()){
        return null;
      }
      while(!inStack.isEmpty()){
        outStack.push(inStack.pop());
      }
    }
    return outStack.pop();
  }

  public void offer(int element) {
    inStack.push(element);
  }

  public Integer peek() {
    if(outStack.isEmpty()){
      if(inStack.isEmpty()){
        return null;
      }
      while(!inStack.isEmpty()){
        outStack.push(inStack.pop());
      }
    }
    return outStack.peek();
  }

  public int size() {
    return inStack.size() + outStack.size();
  }

  public boolean isEmpty() {
    return inStack.isEmpty() && outStack.isEmpty();
  }
}
