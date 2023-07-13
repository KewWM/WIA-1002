
package S2_2017.Q1;

public class Q1 
{
    public static void main(String[] args) 
    {
        LinkedList<String> list = new LinkedList<>();
        list.insertFirstLink("Tods",500000000);
        list.insertFirstLink("Prada",1000000);
        list.insertFirstLink("Chanel",100000000);
        list.insertFirstLink("Louis Vuitton",10000000);
        System.out.println(list.display());
        
        list.addAfter("Chanel", "Coach", 10000000);
        System.out.println(list.display());
        
        list.addAfter("Coach", "Mulberry", 90000000);
        System.out.println(list.display());
        
        list.removeLink("Chanel");
        System.out.println(list.display());
        
        list.removeLink("Coach");
        System.out.println(list.display());
    }
}
