
package Lab2.Q6;

import static Lab2.Q6.MinMaxTwoDArray.max;
import static Lab2.Q6.MinMaxTwoDArray.min;

public class Q6 
{
    public static void main(String[] args) 
    {
        Integer[][] numbers = {{4, 5, 6}, {1, 2, 3}};
        System.out.println("Minimum number: " + min(numbers));
        System.out.println("Maximum number: " + max(numbers));
    }
}
