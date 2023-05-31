
package Tuto9;

public class Q2 
{
    public static void main(String[] args) 
    {
//        System.out.println(f());
    }
    
    public static int f(int n) 
    {
        if (n == 0)
            return n;
        else
            return f(n+1) + n;
    }
}

/*
Explain the problem that occurs when executing the recursive method f().
Ans:
When the argument passed in to the method is non-negative(n > -1), thestopping condition (n == 0)
will never be reached. f() becomes an infinite recursive method.
*/