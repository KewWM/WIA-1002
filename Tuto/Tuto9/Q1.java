
package Tuto9;

public class Q1 
{
    public static void main(String[] args) 
    {
        System.out.println(f(0));
    }
    
    public static int f(int n) 
    {
        if (n == 1)
            return n;
        else
            return n * f(n-1);
    }
}

/*
Explain the problem that occurs when executing the recursive method f(0).
Ans:
The method runs infinitely and causes a StackOverflowError since there is no base case (n == 0) that stop the recursion.
*/