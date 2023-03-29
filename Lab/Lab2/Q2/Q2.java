
package Lab2.Q2;

import static Lab2.Q2.CompareMax.maximum;

public class Q2 
{
    public static void main(String[] args) 
    {
        double[] num = {23.4, 62.1, 83.32};
        System.out.println("Maximum for double: " + maximum(num[0], num[1], num[2]));
        
        char[] alphabet = {'F', 'R', 'Z'};
        Character maxChar = maximum(alphabet[0], alphabet[1], alphabet[2]);
        System.out.println("Maximum for character: " + maxChar);
    }
}
