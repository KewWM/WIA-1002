
package Lab7b;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Q2 
{
    public static void main(String[] args) 
    {
        PriorityQueue<String> pQ1 = new PriorityQueue<>
        (Arrays.asList("George", "Jim", "John", "Blake", "Kevin", "Michael"));
        System.out.println("Queue1: " + Arrays.toString(pQ1.toArray()));
        
        PriorityQueue<String> pQ2 = new PriorityQueue<>
        (Arrays.asList("George", "Katie", "Kevin", "Michelle", "Ryan"));
        System.out.println("Queue2: " + Arrays.toString(pQ2.toArray()));
        
        //Union = all together
        PriorityQueue<String> union = new PriorityQueue<>(pQ1);
        union.addAll(pQ2);
        System.out.println("Union of both PriorityQueue: " + union.toString());
        
        //Difference
        PriorityQueue<String> diff = new PriorityQueue<>(pQ1);
        diff.removeAll(pQ2);
        System.out.println("Difference of both PriorityQueue: " + diff.toString());
        
        //Intersection
        PriorityQueue<String> intersect = new PriorityQueue<>(pQ1);
        intersect.retainAll(pQ2);
        System.out.println("Intersection between both PriorityQueue: " + intersect.toString());
    }
}
