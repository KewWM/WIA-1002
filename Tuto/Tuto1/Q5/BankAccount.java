
package Tuto1.Q5;

public class BankAccount implements Account
{
    private int balance;

    public BankAccount (int initialBalance)
    {
        balance = initialBalance;
    }
    
    @Override
    public int deposit (int amount)
    {
        balance += amount;
        return balance;
    }
    
    @Override
    public boolean withdraw(int amount)
    {
        if (amount <= balance)
        {
            balance -= amount;
            return true;
        }
        else
            return false;
    }
}

