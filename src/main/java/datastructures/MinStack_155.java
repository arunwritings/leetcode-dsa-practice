package datastructures;

import java.util.ArrayDeque;
import java.util.Deque;

public class MinStack_155 {

    private Deque<Integer> mainStack;
    private Deque<Integer> minStack;

    public MinStack_155() {
        minStack = new ArrayDeque<>();
        mainStack = new ArrayDeque<>();
        minStack.push(Integer.MAX_VALUE);
    }

    public void push(int val) {
        mainStack.push(val);
        minStack.push(Math.min(val, minStack.peek()));
    }

    public void pop() {
        mainStack.pop();
        minStack.pop();
    }

    public int top() {
       return mainStack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}
