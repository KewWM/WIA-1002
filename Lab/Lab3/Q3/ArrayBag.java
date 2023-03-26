
package Lab3.Q3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class ArrayBag <T> implements BagInterface<T>
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
    
    @Override
    public BagInterface<T> intersection(BagInterface<T> aBag)
    {
        // create a newly allocated bag.
        BagInterface<T> newBag = new ArrayBag<>();

        // check to see if either one of the two bags is null.
        if ((null == this) || (null == aBag))
        {
            System.out.print("A null bag was found...");
            return newBag;
        }
        // then check to see if both bags are empty.
        if (isEmpty() || aBag.isEmpty())
        {
            System.out.println("Both bags are empty.");
            return newBag;
        }
        // otherwise, return the newly allocated linked bag that
        // contains overlapping entries from both of the bags.

        // convert the two bags into arrays.
        T[] bag1 = this.toArray();
        T[] bag2 = aBag.toArray();

        // iteration of the outer loop will represent the first bag's entries.
        for (int i = 0; i < this.getCurrentSize(); i++)
        {
            int counter1 = this.getFrequencyOf(bag1[i]);

            // iteration of the inner loop will represent the second bag's entries.
            for (int j = 0; j < aBag.getCurrentSize(); j++)
            {
                int counter2 = aBag.getFrequencyOf(bag2[j]);

                // check to see if the second bag's entries
                // match any of the first bag's entries.
                if (bag1[i] == bag2[j])
                {
                    // check to see if all the overlapping entries
                    // have been added to the bag already.
                    if ((newBag.getFrequencyOf(bag1[i]) == counter1) ||
                            (newBag.getFrequencyOf(bag2[j]) == counter2))
                    {
                        // if so, break out of the inner for loop
                        // in order to prevent re-adding the entry.
                        break;
                    }
                    // otherwise, add the overlapping entry
                    // into the intersection bag.
                    else
                    {
                        newBag.add(bag1[i]);
                    }
                }
            } // end of inner for loop.
        } // end of outer for loop.

        // return the intersection of the two bags.
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
        bag2.add("c");
        bag2.add("d");
        bag2.add("e");
        BagInterface<String> everything = bag1.union(bag2);
        
        //test BagInterface<T> union (BagInterface<T> anotherBag)
        Object[] output = everything.toArray();
        String[] dest = new String[output.length];
        System.arraycopy(output, 0, dest, 0, output.length);
        
        Arrays.sort(dest);
        System.out.println("Union for both arrays: " + Arrays.toString(dest));
        
        //test BagInterface<T> intersection(BagInterface<T> anotherBag)
        BagInterface<String> commonItems = bag1.intersection(bag2);
        
        Object[] src1 = commonItems.toArray();
        String[] dest1 = new String[src1.length];
        System.arraycopy(src1, 0, dest1, 0, src1.length);

        Arrays.sort(dest1);
        System.out.println("Intersection for both arrays: " + Arrays.toString(dest1));
    }
}
