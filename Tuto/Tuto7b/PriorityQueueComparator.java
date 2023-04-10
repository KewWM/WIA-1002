
package Tuto7b;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueComparator implements Comparator<String>
{
    public int compare(String s1, String s2) 
    {
        if (s1.length() < s2.length()) 
        {
            return -1;
        }
        if (s1.length() > s2.length())
        {
            return 1;
        }
        return 0;
    }
    
    public static void main(String... args )
    {
        PriorityQueueComparator pqc=new PriorityQueueComparator();
        PriorityQueue<String> pq=new PriorityQueue<String>(5,pqc);
        pq.add("Jason");
        pq.add("Ali");
        pq.add("Muhamad");
        for(String s:pq)
        {
            System.out.println(s);
        }
    }
    
}

/*
a) What is the purpose of the PriorityQueueComparator in the code?
Ans:
To define a custom ordering method for the elements of the PriorityQueue.
In this code specifically, it is used to compare two strings based on their length.

b) What is the output for the code?
Ans:
Ali
Jason
Muhamad
*/