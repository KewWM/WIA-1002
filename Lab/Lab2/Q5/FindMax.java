
package Lab2.Q5;

import java.util.Arrays;

public class FindMax 
{
    public static void main(String[] args)
    {
        Integer[] intArray = {1, 2, 3};
        String[] strArray = {"red", "green", "blue"};
        Circle[] circleArray = {new Circle(3), new Circle(2.9), new Circle(5.9)};
        
        System.out.println("Max of intArray: " + max(intArray));
        System.out.println("Max of strArray: " + max(strArray));
        System.out.println("Max of circleArray: " + max(circleArray));
    }
    
    public static <E extends Comparable<E>> E max(E[] list)
    {
        Arrays.sort(list);
        return list[list.length-1];
    }
    
}
