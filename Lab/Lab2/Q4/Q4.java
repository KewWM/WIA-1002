
package Lab2.Q4;

public class Q4 
{
    public static void main(String[] args) 
    {
        Integer[] intArray = {5,3,7,1,4,9,8,2};
        String[] strArray = {"red", "blue", "orange", "tan"};
        
        System.out.println(minmax(intArray));
        System.out.println(minmax(strArray));
    }
    
    public static <T extends Comparable<T>> String minmax(T[] input)
    {
        T min = input[0];
        T max = input[0];
        for (int i = 0; i < input.length; i++)
        {
            if (input[i].compareTo(min) < 0)
                min = input[i];
            if (input[i].compareTo(max) > 0)
                max = input[i];
        }
        return "Min = " + min + " Max = " + max;
    }
}
