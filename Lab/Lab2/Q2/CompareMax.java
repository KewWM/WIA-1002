
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
}
