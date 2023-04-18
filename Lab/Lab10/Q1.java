
package Lab10;

public class Q1 
{
    public static void selectionSortSmallest(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            int currentMin = arr[i];
            int currentMinIndex = i;
            
            for (int j = i + 1; j < arr.length; j ++)
            {
                if (currentMin > arr[j])
                {
                    currentMin = arr[j];
                    currentMinIndex = j;
                }
            }
            
            if (currentMinIndex != i) 
            {
                arr[currentMinIndex] = arr[i];
                arr[i] = currentMin;
            }
        }
    }
}
