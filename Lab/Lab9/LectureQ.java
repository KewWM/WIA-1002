
package Lab9;

public class LectureQ 
{
    public static void main(String[] args) 
    {
        int n1 = 5;
        System.out.println("Factorial of 5 : " + fac(n1));
        System.out.println("Sum till 5 : " + sum(n1));
        System.out.print("Result: ");
        rec(735);
                
    }
    
    public static int fac(int num)
    {
        if (num == 0)
            return 1;
        else
        {
            return num * fac(num - 1);
        }
    }
    
    public static int sum(int num)
    {
        if (num == 1)
            return 1;
        else
        {
            return num + sum(num - 1);
        }
    }
    
    public static void rec(int n)
    {
        if (n > 0)
        {
            rec(n/10);
            System.out.print(n%10);
        }
        
    }
}
