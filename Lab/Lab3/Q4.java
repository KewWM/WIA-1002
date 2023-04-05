
package Lab3;

import java.util.Arrays;

public class Q4 
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
        BagInterface<String> commonItems = bag1.intersection(bag2);
        
        Object[] src1 = commonItems.toArray();
        String[] dest1 = new String[src1.length];
        System.arraycopy(src1, 0, dest1, 0, src1.length);

        Arrays.sort(dest1);
        System.out.println("Intersection for both arrays: " + Arrays.toString(dest1));
        
        //test BagInterface<T> difference(BagInterface<T> anotherBag)
        bag1.remove("b");
        BagInterface leftOver1 = bag1.difference(bag2);
        BagInterface leftOver2 = bag2.difference(bag1);
        
        Object[] src2 = leftOver1.toArray();
        String[] dest2 = new String[src2.length];
        System.arraycopy(src2, 0, dest2, 0, src2.length);
        
        Object[] src3 = leftOver2.toArray();
        String[] dest3 = new String[src3.length];
        System.arraycopy(src3, 0, dest3, 0, src3.length);
        
        Arrays.sort(dest2);
        Arrays.sort(dest3);
        System.out.println("Difference for first compared to second: " + Arrays.toString(dest2));
        System.out.println("Difference for second compared to first: " + Arrays.toString(dest3));
    }
}
