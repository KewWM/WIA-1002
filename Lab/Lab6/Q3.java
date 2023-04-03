
package Lab6;

import java.util.Random;

public class Q3 
{
    public static void main(String[] args) 
    {
        MyStack<Integer> S = new MyStack<>();
        Random numLai = new Random();
        int unknownSize = numLai.nextInt(10) + 1;
        
        for (int i = 0; i < unknownSize; i++)
        {
            S.push(numLai.nextInt(10) + 1);
        }
        
        System.out.println("Stack: " + S.toString());
        int sum = 0;
        for (int i = 0; i < unknownSize; i++)
        {
            sum += S.pop();
        }
        System.out.printf("Sum of %d element(s) is: %d\n", unknownSize, sum);
    }
}
