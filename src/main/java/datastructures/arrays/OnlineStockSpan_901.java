package datastructures.arrays;

import java.util.Stack;

public class OnlineStockSpan_901 {

    public static class Pair {
        int price;
        int span;
    }

    private final Stack<Pair> monotonicStack;

    public OnlineStockSpan_901() {
        monotonicStack = new Stack<>();
    }

    public int next(int price) {
        int span=1;
        while (!monotonicStack.isEmpty() && monotonicStack.peek().price<=price) {
            span += monotonicStack.peek().span;
            monotonicStack.pop();
        }
        Pair push = new Pair();
        push.price = price;
        push.span = span;
        monotonicStack.push(push);
        return span;
    }

    public static void main(String[] args) {
        OnlineStockSpan_901 o = new OnlineStockSpan_901();
        System.out.println(o.next(100));
        System.out.println(o.next(80));
        System.out.println(o.next(70));
        System.out.println(o.next(85));
    }
}
