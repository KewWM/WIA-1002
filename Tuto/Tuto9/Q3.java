/*
Write a recursive method to reverse a string.
String → gnirts
*/
package Tuto9;

public class Q3 
{
    public static void main(String[] args) 
    {
        String str = "String";
        System.out.print("Original: " + str + "\nReversed: ");
        reverseString(str);
    }
    
    public static void reverseString(String string)   
    {   
        if ((string==null)||(string.length() <= 1))   
            System.out.println(string);   
        else  
        {   
            System.out.print(string.charAt(string.length() - 1));   
            reverseString(string.substring(0, string.length() - 1));   
        }   
    }   
}
