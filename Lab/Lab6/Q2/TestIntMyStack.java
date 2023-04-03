
package Lab6.Q2;

import java.util.Scanner;

public class TestIntMyStack 
{
    public static void main(String[] args) 
    {
        Scanner ya = new Scanner(System.in);
        MyStack <Integer> walao = new MyStack<>();
        
        System.out.print("Enter an integer: ");
        int num = ya.nextInt();
        
        for(int i = 1 ; i <= num ; i++)
            walao.push(i);
        
        System.out.println("Size of the stack: " + walao.getSize());
        
        System.out.println("Contents of stack: ");
        for(int i = walao.getSize() ; i > 0 ; i--)
            System.out.println(walao.pop());
    }
}

/*
Decreasing order of the integer input.
The stack pop out 1 element for each loop until the stack become empty
*/