
package Lab5.Q2;

import java.util.Scanner;

public class Q2 
{
    public static void main(String[] args) 
    {
        Scanner ya = new Scanner(System.in);
        StudentList<String> list = new StudentList<>();
        
        //input name
        System.out.println("Enter your student name list. Enter 'n' to end.....");
        while(true)
        {
            String inName = ya.nextLine();
            if (inName.equalsIgnoreCase("n") == false)
                list.add(inName);
            else
            {
                System.out.println();
                break;
            }
        }
        
        //display input
        System.out.println("You have entered the following students' name : ");
        list.printList();
        
        //display size
        System.out.println("The number of students entered is : " + list.getSize() + "\n");
        
        //Replace 
        System.out.println("All the name entered are correct? Enter 'r' to rename the student name, 'n' to proceed.");
        String rOrN;
        do
        {
            rOrN = ya.nextLine();
            System.out.println();
            
            if (rOrN.equalsIgnoreCase("r") == true)
            {
                System.out.println("Enter the existing student name that u want to rename : ");
                String originalN = ya.nextLine();
                System.out.println();
                
                System.out.println("Enter the new name :");
                String newN = ya.nextLine();
                System.out.println();
                
                list.replace(originalN, newN);
                
                System.out.println("The new student list is :");
                list.printList();
            }
            else if (rOrN.equalsIgnoreCase("r") == false && rOrN.equalsIgnoreCase("n") == false) 
                System.out.println("Invalid input! Enter only :(r/n)");
        } while(rOrN.equalsIgnoreCase("r") == false && rOrN.equalsIgnoreCase("n") == false);
        
        //Remove
        System.out.println("Do you want to remove any of your student name? Enter 'y' for yes, 'n' to proceed.");
        String yOrN;
        do
        {
            yOrN = ya.nextLine();
            System.out.println();
            
            if (yOrN.equalsIgnoreCase("y") == true)
            {
                System.out.println("Enter a student name to remove :");
                String byeN = ya.nextLine();
                System.out.println();
                list.removeElement(byeN);
                
                System.out.println("The number of updated student is : " + list.getSize());
                System.out.println("The updated students list is : ");
                list.printList();
            }
            else if (yOrN.equalsIgnoreCase("r") == false && yOrN.equalsIgnoreCase("n") == false) 
                System.out.println("Invalid input! Enter only :(y/n)");
        } while (yOrN.equalsIgnoreCase("y") == false && yOrN.equalsIgnoreCase("n") == false);
        
        System.out.println("All student data captured complete. Thank you!");
    }
}
