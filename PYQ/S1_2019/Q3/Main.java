
package S1_2019.Q3;

public class Main 
{
    public static void main(String[] args) 
    {
        LinkedList list = new LinkedList();
        
        list.add("Computing Mathematics", 3);
        list.add("Networking Architecture", 3);
        list.add("Final Year Project", 5);
        list.add("Data Structure", 5);
        list.display();
        list.totalCreditHours();
        list.addAfter("Final Year Project", "Software Modelling", 4);
        list.addAfter("Software Modelling", "Intelligent Robot", 3);
        list.addAfter("Computing Mathematics", "Gamification", 4);
        list.totalCreditHours();
        list.remove("Networking Architecture", 3);
        list.remove("Software Modelling", 4);
        list.display();
        list.totalCreditHours();
    }
}
