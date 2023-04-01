
package Lab5.SList;

public class TestSList 
{
    public static void main(String[] args) 
    {
        SList<String> sl = new SList<>();
        
        sl.appendEnd("Linked ");
        sl.appendEnd("list ");
        sl.appendEnd("is, ");
        sl.appendEnd("easy.");
        
        sl.display();
        
        System.out.println("");
        sl.removeInitial();
        sl.removeInitial();
        sl.display();
       
        System.out.println("\n" + sl.contains("difficult"));
        
        sl.clear();
    }
}
