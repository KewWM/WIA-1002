package S1_2020.Q2;

import java.util.ArrayList;

public class GenericQueue<E> {

    private int size;
    protected ArrayList<E> list = new ArrayList<>();

    public GenericQueue() {
    }

    public GenericQueue(int size) {
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
    
    public void enqueue(E e) {
        list.add(e);
        System.out.println("Enqueue: " + e);
    }
    
    public void enqueueMany(String e) {
        String[] stringList = e.split(",");
        for (String stringList1 : stringList) {
            list.add((E) stringList1);
            System.out.println("Enqueue: " + (E) stringList1);
        }
    }
    
    public void dequeue(E o)
    {
        list.remove(o);
        System.out.println("Dequeue: " + o);
    }
    
    public void dequeueAll() {
        System.out.printf("There are %d items in the queue. Removing them all...\n", getSize());
        while (!list.isEmpty()) 
        {
            E o = list.get(0);
            list.remove(o);
            System.out.println("Dequeue: " + o);
        }
    }
    
    public void changeOrder(int k)
    {
        System.out.println("\nChange queue order...");
        ArrayList<E> tempList = new ArrayList<>();
        for (int i = k - 1; i < getSize(); i++)
        {
            E o = list.get(i);
            tempList.add(o);
        }
        for (int j = 0; j < k - 1; j++)
        {
            E o2 = list.get(j);
            tempList.add(o2);
        }
        list = tempList;
    }
    
    public void display() {
        System.out.println("");
        if (!list.isEmpty()) 
        {
            System.out.printf("There are %d items in the queue. Displaying...\n", getSize());
            for (int i = 0; i < getSize(); i++) 
            {
                System.out.print(list.get(i) + "|");
            }
            System.out.println("");
        }
        else{
            System.out.println("Nothing to display");
        }
    }
}
