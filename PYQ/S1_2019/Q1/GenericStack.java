
package S1_2019.Q1;

import java.util.ArrayList;

public class GenericStack<T>{
    private int sizes = 0;
    protected ArrayList<T> list = new ArrayList<>();

    public GenericStack() {
    }
    
    public GenericStack(int size) {
        this.sizes = size;
    }
    
    public boolean isEmpty()
    {
        return list.isEmpty();
    }
    
    public boolean isFull()
    {
        return list.size() == sizes;
    }
    
    public void peek()
    {
        
    }
    
    public void push(T t)
    {
        list.add(t);
        System.out.println("Push: " + t);
    }
    
    public void pushMany(String str)
    {
        String[] temp = str.split(",");
        for(int i = 0; i < temp.length; i++)
        {
            list.add((T)temp[i]);
            System.out.println("Push: " + (T)temp[i]);
        }
    }
    
    public void pop()
    {
        T lastE = list.get(list.size() - 1);
        list.remove(lastE);
        System.out.println("Pop the top of stack...");
    }
    
    public void popAll()
    {
        System.out.printf("There are %d item in the stack. Removing all...\n", list.size());
        for (int i = list.size() - 1; i >= 0; i--)
        {
            T lastE = list.get(i);
            list.remove(lastE);
            System.out.println("Removing " + lastE + " ...");
        }
    }
    
    public void display()
    {
        System.out.println("");
        if (list.isEmpty())
        {
            System.out.println("Stack is empty, nothing to display...");
        }
        else
        {
            System.out.printf("There are %s items in the stack. Displaying...\n", list.size());
            for (int i = list.size() - 1; i >= 0; i--)
            {
                System.out.println(list.get(i));
            }
        }
        System.out.println("");
    }
}
