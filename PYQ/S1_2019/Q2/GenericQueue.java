
package S1_2019.Q2;

import java.util.ArrayList;

public class GenericQueue <E>
{
    private int size;
    protected ArrayList<E> list = new ArrayList<>();

    public GenericQueue(int size)
    {
        this.size = size;
    }
    
    public boolean isEmpty()
    {
        return list.isEmpty();
    }
    
    public boolean isFull()
    {
        return list.size() == size;
    }
    
    public E peek()
    {
        return list.get(0);
    }
    
    public void enqueue(E e)
    {
        if(!isFull())
        {
            list.add(e);
            System.out.println("Enqueue: " + e);
        }
        else
        {
            System.out.println("Queue is full");
        }
    }
    
    public void enqueueMany(String str)
    {
        String[] temp = str.split(",");
        for(int i = 0; i < temp.length; i++)
        {
            if(!isFull())
            {
                list.add((E)temp[i]);
                System.out.println("Enqueue: " + (E)temp[i]);
            }
            else
            {
                System.out.println("Queue is full");
                break;
            }
        }
    }
    
    public void dequeue()
    {
        E firstE = list.get(0);
        list.remove(firstE);
        System.out.println("Dequeue: " + firstE);
    }
    
    public void dequeueAll()
    {
        System.out.printf("\nThere are %d items in the queue. Removing them all...\n", list.size());
        while(!list.isEmpty())
        {
            E firstE = list.get(0);
            list.remove(firstE);
            System.out.println("Dequeue: " + firstE);
        }
    }
    
    public void display()
    {
        System.out.println("");
        if(list.isEmpty())
        {
            System.out.println("Nothing to display");
        }
        else
        {
            System.out.printf("There are %d items in the queue. Displaying...\n", list.size());
            for(int i = 0; i < list.size(); i++)
            {
                System.out.println(list.get(i));
            }
        }
        System.out.println("");
    }
}
