/*
Write a recursive method to calculate the following :
    5 + 4 + 3 + 2 + 1.
State the base case and recursive case. Trace your solution using number, N of 5.

Algorithm :
1. Base case = 1
2. Recursive case = n + sum(n-1)
*/
package Tuto9;

public class Q4 
{
    public static void main(String[] args) 
    {
        System.out.println("5 + 4 + 3 + 2 + 1\nTotal: " + sum(5));
    }
    
    public static int sum(int N)
    {
        if (N == 1)
            return 1;
        else
        {
            return N + sum(N - 1);
        }
        
    }
}
