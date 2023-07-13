
package S2_2019.Q2;

import java.util.Arrays;

public class SortSalesList<E extends Comparable<E>> extends SalesList
{
    public SortSalesList() {
    }

    public SortSalesList(String[] region, Integer[] sale, String[] name) {
        super(region, sale, name);
    }

    public void selectionSort(String[] list)
    {
        for (int i = 0; i < list.length - 1; i++)
        {
            String currentMin = list[i];
            int currentMinIndex = i;
            
            for (int j = i + 1; j < list.length; j++)
            {
                if (currentMin.compareTo(list[j]) < 0)
                {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }
            
            if (currentMinIndex != i)
            {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
        System.out.println(Arrays.toString(list));
    }
    
    public void insertionSort(Integer[] list)
    {
        for (int  i = 0; i < list.length; i++)
        {
            Integer currentElement = list[i];
            int k;
            for (k = i - 1; k >= 0 && list[k].compareTo(currentElement) > 0; k--)
            {
                list[k + 1] = list[k];
            }
            list[k + 1] = currentElement;
        }
        System.out.println(Arrays.toString(list));
    }
    
    public void bubbleSort(String[] list)
    {
        boolean needNext = true;
        for (int i = 1; i < list.length && needNext; i++)
        {
            needNext = false;
            for (int j = 0; j < list.length - i; j++)
            {
                if (list[j].compareTo(list[j+1]) > 0)
                {
                    String temp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = temp;
                    needNext = true;
                }
            }
        }
        System.out.println(Arrays.toString(list));
    }
    
}
