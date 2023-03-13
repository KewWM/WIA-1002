
package Lab1.Q2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Q2 
{
    public static void main(String[] args) 
    { 
        charSepByComma("C:/Users/User/Documents/NetBeansProjects/WIA 1002/src/Lab1/Q2/text1.txt");
        charSepByCommaSpace("C:/Users/User/Documents/NetBeansProjects/WIA 1002/src/Lab1/Q2/text2.txt");
        charSepBySemicolonSpace("C:/Users/User/Documents/NetBeansProjects/WIA 1002/src/Lab1/Q2/text3.txt");
        charSepByAlphabetNumber("C:/Users/User/Documents/NetBeansProjects/WIA 1002/src/Lab1/Q2/text4.txt");
    }
    
    public static void charSepByComma(String filename)
    {
        try{
            Scanner ya = new Scanner(new FileInputStream(new File(filename)));
            String line = "";
            int numOfChar = 0;
            
            while(ya.hasNextLine())
            {
                line = String.join("", ya.nextLine().split(","));
                numOfChar += line.length();
                System.out.println(line);
            }
            System.out.println("Number of characters: " + numOfChar + "\n");
            
            ya.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File not found.");
        }
    }
    
    public static void charSepByCommaSpace(String filename)
    {
        String specialChars = "[,;\\s]+";
        StringBuilder sb = new StringBuilder();
        int count = 0;
        try
        {
            Scanner ya = new Scanner(new FileInputStream(new File(filename)));
            String line = "";
            int numOfChar = 0;
            
            while(ya.hasNextLine())
            {
                line = String.join("", ya.nextLine().split("; "));
                String[] words = line.split(specialChars);
                for (String word : words) 
                {
                    sb.append(word).append(" ");
                    count += word.length();
                }
            }
            System.out.println(sb.toString());
            System.out.println("Number of characters: " + numOfChar + "\n");
            
            ya.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File not found.");
        }
    }
    
    public static void charSepBySemicolonSpace(String filename)
    {
        String specialChars = "[,;\\s]+";
        StringBuilder sb = new StringBuilder();
        int count = 0;
        try{
            Scanner ya = new Scanner(new FileInputStream(new File(filename)));
            String line = "";
            int numOfChar = 0;
            
            while(ya.hasNextLine())
            {
                line = String.join("", ya.nextLine().split(", "));
                String[] words = line.split(specialChars);
                for (String word : words) 
                {
                    sb.append(word).append(" ");
                    count += word.length();
                }
            }
            System.out.println(sb.toString());
            System.out.println("Number of characters: " + numOfChar + "\n");
            
            ya.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File not found.");
        }
    }
    
    public static void charSepByAlphabetNumber(String filename)
    {
        try
        {
            Scanner s = new Scanner(new FileInputStream(new File(filename)));
            String line1 = "", line2 = "";
            int numOfChar = 0;
            
            while(s.hasNextLine())
            {
                String originalText = s.nextLine();
                
                for (int i = 0 ; i < originalText.length(); i++)
                {
                    if(Character.isDigit(originalText.charAt(i)) == false)
                    {
                        line1 += originalText.charAt(i);
                    }
                    else
                    {
                        line2 += originalText.charAt(i);
                    }
                }
                numOfChar += (line1.length() + line2.length());
                System.out.println(line1 + "\n" + line2);
            }
            System.out.println("Number of characters: " + numOfChar + "\n");
            
            s.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File not found.");
        }
    }
}
