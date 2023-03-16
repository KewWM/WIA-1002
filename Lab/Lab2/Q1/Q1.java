
package Lab2.Q1;

public class Q1 
{
    public static void main(String[] args) 
    {
        MyGeneric <String> strObj = new MyGeneric<> ("I am string");
        MyGeneric <Integer> intObj = new MyGeneric<> (666);
        
        System.out.println("String: " + strObj.getE());
        System.out.println("Integer: " + intObj.getE());
    }
    
}
