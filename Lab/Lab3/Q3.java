
package Lab3;

import java.util.Arrays;

public class Q3 
{
    public static void main(String[] args) 
    {
        ArrayBag<String> bag1 = new ArrayBag();
        ArrayBag<String> bag2 = new ArrayBag();
        bag1.add("a");
        bag1.add("b");
        bag1.add("c");
        bag2.add("b");
        bag2.add("c");
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
        System.out.println("Union for both arrays: " + Arrays.toString(dest));
        
        //test BagInterface<T> intersection(BagInterface<T> anotherBag)
        BagInterface<String> commonItems1 = bag1.intersection(bag2);
        BagInterface<String> commonItems2 = bag1.newIntersection(bag2);
        
        Object[] src1 = commonItems1.toArray();
        Object[] src2 = commonItems2.toArray();
        String[] dest1 = new String[src1.length];
        System.arraycopy(src1, 0, dest1, 0, src1.length);
        String[] dest2 = new String[src2.length];
        System.arraycopy(src2, 0, dest2, 0, src2.length);

        Arrays.sort(dest1);
        System.out.println("Intersection for both arrays: " + Arrays.toString(dest1));
        Arrays.sort(dest2);
        System.out.println("Intersection for both arrays: " + Arrays.toString(dest2));
    }
}
