
package Lab3;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Q1 
{
    public static void main(String[] args) 
    {
        ArrayBag<Integer> ab = new ArrayBag();
        ab.add(23);
        ab.add(412);
        ab.add(12);
        ab.add(912);
        ab.remove(23);
        ab.add(313);
        ab.add(12);
        
        System.out.println("Size: " + ab.getCurrentSize());
        System.out.println(ab.contains(23));
        System.out.println("Frequency: " + ab.getFrequencyOf(12));
        System.out.println(Array.get(ab.toArray(), 0));
        System.out.println(Arrays.toString(ab.toArray()));
    }
}
