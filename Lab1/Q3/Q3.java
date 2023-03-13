
package Lab1.Q3;

public class Q3 
{
    public static void main(String[] args)
    {
        Account acc = new Account(1122, 20000);
        acc.setAnnualInterestRate(0.045);
        acc.withdraw(2500);
        acc.deposit(3000);
        System.out.println("Balance: RM" + acc.getBalance());
        System.out.println("Monthly Interest: " + acc.getMonthlyInterest());
        System.out.println("Date: " + acc.getDateCreated());
    }
}
