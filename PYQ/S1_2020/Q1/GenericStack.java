package S1_2020.Q1;

import java.util.ArrayList;

public class GenericStack<E> {

    private int size;
    protected ArrayList<E> list = new ArrayList<>();

    public GenericStack() {

    }

    public GenericStack(int size) {
        this.size = size;
    }

    public int getSize() {
        return list.size();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public boolean isFull() {
        return (list.size() == size);
    }

    public E peek() {
        return list.get(0);
    }

    public void push(E e) {
        list.add(e);
        System.out.println("Push: " + e);
    }

    public void pushMany(String e) {
        System.out.println("Push many into stack...");
        String[] stringList = e.split(",");
        for (String stringList1 : stringList) {
            list.add((E) stringList1);
            System.out.println("Push: " + (E) stringList1);
        }
    }

    public E pop() {
        E o = list.get(getSize() - 1);
        list.remove(getSize() - 1);
        return o;
    }

    public E popMiddle() {
        if (getSize() % 2 == 1) //Odd
        {
            int mid = getSize() % 2 + 1;
            E o = list.get(mid);
            list.remove(mid);
            return o;
        } else //Even
        {
            System.out.println("\nCurrent count of stack is even number, so no middle index...");
            return null;
        }
    }

    public void popAll() {
        System.out.printf("There are %d items in the stack. Pop all...\n", getSize());
        for (int i = getSize() - 1; i >= 0 ; i--)
        {
            E o = list.get(getSize() - 1);
            list.remove(getSize() - 1);
            System.out.println("Removing " + o);
        }
    }

    public void display() {
        System.out.println("");
        if (!list.isEmpty()) 
        {
            System.out.printf("There are %d items in the stack. Displaying...\n", getSize());
            for (int i = getSize() - 1; i >= 0; i--) 
            {
                System.out.println(list.get(i));
            }
        }
        else{
            System.out.println("Stack is empty, nothing to display...");
        }
    }
}
