
package Lab1.Q1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadMyLetter_22004821 
{
    public static void main(String[] args) 
    {
        System.out.println("Input second part: ");
        String str = "";
        try
        {
            Scanner input = new Scanner(new FileInputStream("C:/Users/User/Documents/NetBeansProjects/WIA 1002/src/Lab1/Q1/KewWeiMing_22004821.txt"));
            while(input.hasNextLine())
            {
                str += input.nextLine() + "\n";
            }
            input.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File not found.");
        }
        
        str += "\n\n\nTuesday, 13 June 2023. \n\n";
        
        //Input second part here
        Scanner sc = new Scanner(System.in);
        str += sc.nextLine();
        
        //Finally, output all String
        System.out.println(str);
    }
}

/*
It’s me again. Finally, it’s the end of the term and the DS class has finished! I think I did
well in this course and happy to complete Data Structure successfully. DS lets me learn more
about programming. My grade becomes A. I think I can do better @_@|||
*/