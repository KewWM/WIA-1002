
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
        MyStack<Integer> A = new MyStack<>();
        //Blank
        MyStack<Integer> B = new MyStack<>();
        //Final: All disk(s) should be here
        MyStack<Integer> C = new MyStack<>();
        
        //Start by having all disk
        for (int i = numDisk; i > 0; i++)
        {
            A.push(i);
        }
        
        System.out.println("oi");
    }
}
