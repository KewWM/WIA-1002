
package Lab3.Q5;

public class ArrayBagDemo<T> extends ArrayBag<T>
{
    private static void testAdd(BagInterface<String> aBag, String[] content)
    {
        for (String s : content)
            aBag.add(s);
        
        Object[] obj = aBag.toArray();
        String[] dest = new String[obj.length];
        System.arraycopy(obj, 0, dest, 0, obj.length);
        
        System.out.print("Adding ");
        for (String item : dest) 
        {
            System.out.print(item + " ");
        }
        System.out.println();
    }
    
    private static void displayBag(BagInterface<String> aBag)
    {
        System.out.println("The bag contains " + aBag.getCurrentSize() + " string(s), as follows: ");
        Object[] obj = aBag.toArray();
        String[] dest = new String[obj.length];
        System.arraycopy(obj, 0, dest, 0, obj.length);
        for (String item : dest) 
        {
            System.out.print(item + " ");
        }
        System.out.println("\n");
    }
    
    public static void main(String[] args) 
    {
        ArrayBag<String> bag1 = new ArrayBag<>();
        ArrayBag<String> bag2 = new ArrayBag<>();
        String[] contentsOfBag1 = {"A", "A", "B", "A", "C", "A"};
        String[] contentsOfBag2 = {"A", "B", "A", "C", "B", "C", "D", "another string"};
        
        System.out.println("bag1");
        testAdd(bag1, contentsOfBag1);
        displayBag(bag1);
        
        System.out.println("bag2");
        testAdd(bag2, contentsOfBag2);
        displayBag(bag2);
        
        System.out.println("bag3, test the method union of bag1 and bag2:");
        ArrayBag<String> bag3 = (ArrayBag<String>) bag1.union(bag2);
        displayBag(bag3);
        
        System.out.println("bag4, test the method intersection of bag1 and bag2:");
        ArrayBag<String> bag4 =(ArrayBag<String>) bag1.intersection(bag2);
        displayBag(bag4);
        
        System.out.println("bag5, test the method difference of bag1 and bag2:");
        ArrayBag<String> bag5 = (ArrayBag<String>) bag1.difference(bag2);
        displayBag(bag5);
    }
}
