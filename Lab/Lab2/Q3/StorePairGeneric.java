
package Lab2.Q3;

/*
public class StorePair 
{
    private int first, second;
    public StorePair(int first, int second) 
    {
        this.first = first;
        this.second = second;
    }
    public int getFirst() 
    {
        return first;
    }
    public int getSecond() 
    {
        return second;
    }
    public void setPair(int first, int second)
    {
        this.first = first;
        this.second = second;
    }
    public String toString() 
    {
        return "first = " + first + " second = " + second;
    }
}
*/

public class StorePairGeneric <T extends Comparable<T>> implements Comparable<StorePairGeneric<T>>
{
    private T first;
    private T second;

    public StorePairGeneric(T first, T second)
    {
        this.first = first;
        this.second = second;
    }

    public T getFirst()
    {
        return first;
    }

    public T getSecond() 
    {
        return second;
    }
    
    public void setPair(T first, T second)
    {
        this.first = first;
        this.second = second;
    }
    
    @Override
    public String toString() 
    {
        return "first = " + first + " second = " + second;
    }
    
    @Override
    public boolean equals(Object o)
    {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass()) 
            return false;
        StorePairGeneric<T> other = (StorePairGeneric<T>) o;
        return this.first.equals(other.first);
    }
    
    @Override
    public int compareTo(StorePairGeneric<T> other) 
    {
        return this.first.compareTo(other.first);
    }
}
