
package Lab2.Q3;

public class Q3 
{
    public static void main(String[] args) 
    {
        StorePairGeneric <Integer> a = new StorePairGeneric<>(6, 4);
        StorePairGeneric <Integer> b = new StorePairGeneric<>(2, 2);
        StorePairGeneric <Integer> c = new StorePairGeneric<>(6, 3);
        
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        
        System.out.println("a.equals(b): " + a.equals(b));
        System.out.println("a.equals(c): " + a.equals(c));
        System.out.println("b.euqals(c): " + b.equals(c));
        System.out.println("a.compareTo(b): " + a.compareTo(b));
        System.out.println("a.compareTo(c): " + a.compareTo(c));
        System.out.println("b.compareTo(c): " + b.compareTo(c));
    }
}
