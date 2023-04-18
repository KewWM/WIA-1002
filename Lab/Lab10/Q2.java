
package Lab10;

public class Q2 
{
    public static void selectionSortLargest(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            int currentMax = arr[i];
            int currentMaxIndex = i;
            
            for (int j = i + 1; j < arr.length; j ++)
            {
                if (currentMax < arr[j])
                {
                    currentMax = arr[j];
                    currentMaxIndex = j;
                }
            }
            
            if (currentMaxIndex != i) 
            {
                arr[currentMaxIndex] = arr[i];
                arr[i] = currentMax;
            }
        }
    }
}
