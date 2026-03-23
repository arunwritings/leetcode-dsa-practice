package datastructures;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class PeekingIterator_284 implements Iterator<Integer> {
    private final Iterator<Integer> itr;
    private Integer nextValue = null;
    public PeekingIterator_284(Iterator<Integer> iterator) {
        itr = iterator;
        if (hasNext()) nextValue = itr.next();
    }

    public Integer peek() {
        return nextValue;
    }
    @Override
    public boolean hasNext() {
        return nextValue!=null || itr.hasNext();
    }

    @Override
    public Integer next() {
        int value = nextValue;
        if (itr.hasNext()) nextValue = itr.next();
        else nextValue = null;
        return value;
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3);
        PeekingIterator_284 it = new PeekingIterator_284(list.iterator());

        System.out.println(it.peek());
        System.out.println(it.next());
        System.out.println(it.peek());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.hasNext());
    }
}
