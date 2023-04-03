
package Lab6;

import java.util.Scanner;

public class Q4 
{
    public static void main(String[] args) 
    {
        MyStack<Character> S1 = new MyStack<>();
        MyStack<Character> S2 = new MyStack<>();
        Scanner ya = new Scanner(System.in);
        
        System.out.print("Enter a String: ");
        String input = ya.nextLine();
        while (!(input.length() <= 15))
        {
            System.out.print("Error! Enter a String: ");
            input = ya.nextLine();
        }
        
        for (int i = 0; i < input.length(); i++)
        {
            S1.push(input.charAt(i));
        }
        for (int i = input.length() - 1; i >= 0; i--)
        {
            S2.push(input.charAt(i));
        }
        
        if (S1.toString().equals(S2.toString()))
            System.out.println("The String is palindrome");
        else
            System.out.println("The String is not palindrome");
    }
}
