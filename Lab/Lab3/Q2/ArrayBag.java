
package Lab3.Q2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class ArrayBag<T> implements BagInterface<T>
{
    private int DEFAULT_CAPACITY = 25;
    private T[] bag = (T[]) new Object[DEFAULT_CAPACITY];
    private int numberOfEntries;
    
    @Override
    public int getCurrentSize() 
    {
        return numberOfEntries;
    }

    @Override
    public boolean isFull() 
    {
        return numberOfEntries == 25;
    }

    @Override
    public boolean isEmpty() 
    {
        return numberOfEntries == 0;
    }

    @Override
    public boolean add(T newEntry) 
    {
        if (numberOfEntries < DEFAULT_CAPACITY)
        {
            numberOfEntries++;
            bag[numberOfEntries - 1] = newEntry;
            return true;
        }
        return false;
    }

    @Override
    public T remove() 
    {     
        if (numberOfEntries != 0)
        {
            Random ya = new Random();
            int choosenIndexRemove = ya.nextInt(numberOfEntries);
            T result = bag[choosenIndexRemove]; //Return value removed
            bag[choosenIndexRemove] = null;
            
            for (int i = choosenIndexRemove; i < numberOfEntries; i++)
            {
                bag[i] = bag[i + 1];
            }
            numberOfEntries--;
            return result;
        }
        return null;
    }

    @Override
    public boolean remove(T anEntry)
    {
        if (numberOfEntries != 0)
        {
             for (int i = 0; i < numberOfEntries; i++)
             {
                if (bag[i] == anEntry) 
                {
                    bag[i] = null;

                    for (int j = i; j < numberOfEntries; j++) 
                    {
                        bag[j] = bag[j + 1];
                    }

                    numberOfEntries--;
                    return true;
                }
            }
        }
        return false;
    }
    
    @Override
    public void clear()
    {
        //Arrays.fill(bag, null);
        for (int i = 0; i < numberOfEntries; i++)
        {
            bag[i] = null; 
        }
        numberOfEntries = 0;
    }
    
    @Override
    public int getFrequencyOf(T anEntry)
    {
        int freq = 0;
        for (int i = 0; i < numberOfEntries; i++)
        {
            if (bag[i] == anEntry)
                freq++;
        }
        return freq;
    }
    
    @Override
    public boolean contains(T anEntry)
    {
        for (int i = 0; i < numberOfEntries; i++)
        {
            if (bag[i] == anEntry)
                return true;
        }
        return false;
    }
    
    @Override
    public T[] toArray()
    {
        T[] result = (T[])new Object[numberOfEntries];

        System.arraycopy(bag, 0, result, 0, numberOfEntries); 
      
        return result;
    }

    @Override
    public BagInterface<T> union(BagInterface<T> anotherBag) 
    {
        BagInterface<T> newBag = new ArrayBag();
        for (int i = 0; i < this.toArray().length; i++) 
        {
            newBag.add((T) Array.get(this.toArray(), i));
        }
        for (int i = 0; i < anotherBag.toArray().length; i++) 
        {
            newBag.add((T) Array.get(anotherBag.toArray(), i));
        }
        return newBag;
    }
    
    public static void main(String[] args) 
    {
        ArrayBag<String> bag1 = new ArrayBag();
        ArrayBag<String> bag2 = new ArrayBag();
        bag1.add("a");
        bag1.add("b");
        bag1.add("c");
        bag2.add("b");
        bag2.add("b");
        bag2.add("d");
        bag2.add("e");
        BagInterface<String> everything = bag1.union(bag2);
        
        //test BagInterface<T> union (BagInterface<T> anotherBag)
        Object[] output = everything.toArray();
        String[] dest = new String[output.length];
        System.arraycopy(output, 0, dest, 0, output.length);
        
        Arrays.sort(dest);
        System.out.println(Arrays.toString(dest));
    }
}
