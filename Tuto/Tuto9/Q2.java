
package Tuto9;

public class Q2 
{
    public static void main(String[] args) 
    {
        //System.out.println(f());
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
The program occurs compile-time error. This error happens because the method f() requires a parameter n
*/