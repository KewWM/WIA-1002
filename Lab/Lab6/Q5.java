
package Lab6;

import java.util.Scanner;

public class Q5 
{
    public static void main(String[] args) 
    {
        Scanner ya = new Scanner(System.in);
        
        //Enter number of disk
        System.out.print("Enter number of disk: ");
        int numDisk = ya.nextInt();
        
        //Begin: All disk(s) are here
        MyStack<Integer> source = new MyStack<>();
        //Blank
        MyStack<Integer> aux = new MyStack<>();
        //Final: All disk(s) should be here
        MyStack<Integer> dest = new MyStack<>();
        
        //Start by having all disk
        for (int i = numDisk; i > 0; i--)
        {
            source.push(i);
        }
        

        // Display Initial
        System.out.println("\nInitial:\n__________________");
        System.out.printf("Rod 1: %s\n", source.toString());
        System.out.printf("Rod 2: %s\n", aux.toString());
        System.out.printf("Rod 3: %s\n", dest.toString());

        // Start Recursion
        start(numDisk, source, dest, aux);

        // Display Final
        System.out.println("\nFinal:\n__________________");
        System.out.printf("Rod 1: %s\n", source.toString());
        System.out.printf("Rod 2: %s\n", aux.toString());
        System.out.printf("Rod 3: %s\n", dest.toString());
    }

    // Recursion
    public static void start(int startDiscsLeft, MyStack<Integer> start, MyStack<Integer> target, MyStack<Integer> helper) 
    {

        // Base Case
        if (startDiscsLeft == 1) 
        {
            target.push(start.pop());
            return;
        }

        // Move
        start(startDiscsLeft - 1, start, helper, target);
        target.push(start.pop());
        
        // Reset
        start(startDiscsLeft - 1, helper, target, start);
    }
}