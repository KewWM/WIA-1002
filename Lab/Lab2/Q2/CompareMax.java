
package Lab2.Q2;

public class CompareMax
{
    public static <T extends Comparable<T>> T maximum(T a, T b, T c)
    {
        T max = a;
        if (b.compareTo(a) > 0)
            max = b;
        if (c.compareTo(a) > 0)
            max = c;
        return max;
    }
    
    public static void main(String[] args) 
    {
        double[] num = {23.4, 62.1, 83.32};
        System.out.println("Maximum for double: " + maximum(num[0], num[1], num[2]));
        
        char[] alphabet = {'F', 'R', 'Z'};
        Character maxChar = maximum(alphabet[0], alphabet[1], alphabet[2]);
        System.out.println("Maximum for character: " + maxChar);
    }

}
