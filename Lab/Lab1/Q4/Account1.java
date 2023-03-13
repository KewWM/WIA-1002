
package Lab1.Q4;

import java.util.ArrayList;
import java.util.Date;

public class Account1
{
    private String name;
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;
    private Date dateCreated;
    private ArrayList<Transaction> transactions = new ArrayList<Transaction>();

    public Account1() {}

    public Account1(int id, double initialBalance) 
    {
        this.id = id;
        this.balance = initialBalance;
        this.dateCreated = new Date();
    }
    
    public Account1(String name, int id, double initialBalance)
    {
        this.name = name;
        this.id = id;
        this.balance = initialBalance;
        this.dateCreated = new Date();
    }
    
    public int getId() 
    {
        return id;
    }
    public void setId(int id) 
    {
        this.id = id;
    }

    public double getBalance() 
    {
        return balance;
    }
    public void setBalance(double balance) 
    {
        this.balance = balance;
    }

    public double getAnnualInterestRate()
    {
        return annualInterestRate;
    }
    public void setAnnualInterestRate(double annualInterestRate) 
    {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() 
    {
        return dateCreated;
    }

    public ArrayList<Transaction> getTransactions() 
    {
        return transactions;
    }
      
    public double getMonthlyInterestRate()
    {
        return annualInterestRate / 12;
    }
    
    public double getMonthlyInterest()
    {
        return balance * this.getMonthlyInterestRate();
    }
    
    public void withdraw(double amount, String description)
    {
        balance -= amount;
        transactions.add(new Transaction('W', amount, this.balance, description));
    }
    
    public void deposit(double amount, String description)
    {
        balance += amount;
        transactions.add(new Transaction('D', amount, this.balance, description));
    }
}
