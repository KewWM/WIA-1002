/*
Write a recursive method printDigit that prints an integer argument as its constituent digits,
with a blank space separates each digit with the next. For example, if the argument is 4567,
this method will print 4 5 6 7 on the screen.
*/
package Tuto9;

public class Q5 
{
    public static void main(String[] args) 
    {
        printDigit(4567);
    }
    
    public static void printDigit(int n)
    {
        if (n < 10)
            System.out.print(n + " ");
        else
        {
            printDigit(n / 10);
            System.out.print(n % 10 + " ");
        }
    }
}
