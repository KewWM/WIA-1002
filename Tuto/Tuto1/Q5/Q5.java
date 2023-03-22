
package Tuto1.Q5;

public class Q5 
{  
    public static void main(String[] args) 
    {
        BankAccount ba = new BankAccount(5000);
        System.out.println(ba.deposit(400));
        System.out.println(ba.withdraw(22));
    }
}
