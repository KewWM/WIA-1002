
package Lab10;

public class Q4 
{
    public static void insertion(int[] arr)
    {
        for (int i = 1; i < arr.length; i++)
        {
            int currentElement = arr[i];
            int k;
            for (k = i - 1; k >= 0 && arr[k] > currentElement; k--)
                arr[k + 1] = arr[k];
            arr[k + 1] = currentElement;
        }
    }
    
    public static void main(String[] args) 
    {
        int[] num = {10, 34, 2, 56, 7, 67, 88, 42};
        
        System.out.print("Unsorted: ");
        for (int i : num) 
        {
            System.out.print(i + " ");
        }
        
        insertion(num);
        System.out.print("\nSorted: ");
        for (int i : num) 
        {
            System.out.print(i + " ");
        }
    }
}
