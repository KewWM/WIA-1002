
package Lab3;

import java.util.Arrays;

public class Q2 
{
    public static void main(String[] args) 
    {
        ArrayBag<String> bag1 = new ArrayBag();
        ArrayBag<String> bag2 = new ArrayBag();
        bag1.add("a");
        bag1.add("b");
        bag1.add("c");
        bag2.add("b");
        bag2.add("b");
        bag2.add("d");
        bag2.add("e");
        BagInterface<String> everything = bag1.union(bag2);
        
        //Show both bags
        System.out.println("Bag 1: " + Arrays.toString(bag1.toArray()));
        System.out.println("Bag 2: " + Arrays.toString(bag2.toArray()));
        
        //test BagInterface<T> union (BagInterface<T> anotherBag)
        Object[] output = everything.toArray();
        String[] dest = new String[output.length];
        System.arraycopy(output, 0, dest, 0, output.length);
        
        Arrays.sort(dest);
        System.out.println("The union of both bags: \n" + Arrays.toString(dest));
    }
}
