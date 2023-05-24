
package Lab7b;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class Q1 
{
    public static void main(String[] args) 
    {
        Integer[] num = {4, 8, 1, 2, 9, 6, 3, 7};
        PriorityQueue<Integer> pQ = new PriorityQueue<>();
        for (int i = 0; i < num.length; i++)
            pQ.add(num[i]);
        
        System.out.println("Element contain: " + pQ.toString());
        
        System.out.println("First element removed: " + pQ.poll());
        
        pQ.add(5);
        System.out.println("Added new element '5'");
        
        System.out.println("Queue to array: " + Arrays.toString(pQ.toArray()));
        
        System.out.println("First element: " + pQ.peek());
        
        System.out.println("Queue contains '1'?  " + pQ.contains(1));
        
        System.out.println("Size of queue: " + pQ.size());
        
        System.out.println("\nRemoving the element(s) in queue till empty:");
        while (!pQ.isEmpty())
            System.out.println(pQ.poll());
        System.out.println("Its empty!!!\n");
        
        PriorityQueue<Integer> pQ2 = new PriorityQueue<>(Collections.reverseOrder());
        for (Integer num1 : num) 
        {
            pQ2.add(num1);
        }
        //Alternative suggested: pQ.addAll(Arrays.asList(num));
        
        System.out.print("Sort the priority queue in reversing order: ");
        while (pQ2.size() > 0)
            System.out.print(pQ2.poll() + " ");
        System.out.println("");
    }
}
