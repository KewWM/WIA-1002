
package Lab7b;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Q2 
{
    public static void main(String[] args) 
    {
        PriorityQueue<String> pQ1 = new PriorityQueue<>
        (Arrays.asList("George", "Jim", "John", "Blake", "Kevin", "Michael"));
        
        PriorityQueue<String> pQ2 = new PriorityQueue<>
        (Arrays.asList("George", "Katie", "Kevin", "Michelle", "Ryan"));
        
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
