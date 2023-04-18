
package Lab10;

import static Lab10.Q1.selectionSortSmallest;
import static Lab10.Q2.selectionSortLargest;

public class Q3 
{
    public static void main(String[] args) 
    {
        int[] arr = {45, 7, 2, 8, 19, 3};
        
        //Sort Smallest
        selectionSortSmallest(arr);
        System.out.print("Sort ascending: ");
        for (int num : arr)
        {
            System.out.print(num + " ");
        }
        
        //Sort Largest
        selectionSortLargest(arr);
        System.out.print("\nSort decending: ");
        for (int num : arr)
        {
            System.out.print(num + " ");
        }
    }
}
