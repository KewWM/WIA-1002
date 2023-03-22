
package Lab1.Q4;


public class Q4 
{
    public static void main(String[] args) 
    {
        Account1 acc = new Account1("George", 1122, 1000);
        acc.setAnnualInterestRate(0.015);
        acc.deposit(30, "1st deposit");
        acc.deposit(40, "2nd deposit");
        acc.deposit(50, "3rd deposit");
        acc.withdraw(5, "1st withdraw");
        acc.withdraw(4, "2nd withdraw");
        acc.withdraw(3, "3rd withdraw");
        
        System.out.println(acc.getName() + "\n" + acc.getAnnualInterestRate()*100 + "\n" + acc.getBalance() + "\n");
        for (Transaction transaction : acc.getTransactions()) 
        {
            System.out.println("Date: " + transaction.getDate());
            System.out.println("Type: " + transaction.getType());
            System.out.println("Amount: " + transaction.getAmount());
            System.out.println("Balance: " + transaction.getBalance());
            System.out.println("Description: " + transaction.getDescription());
            System.out.println();
        }
    }
}
