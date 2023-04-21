
package Lab9;

public class Q2 
{
    public static void main(String[] args)
    {
        permuteString("ABC");
    }
    
    public static void permuteString(String str) 
    {
        permuteHelper("", str);
    }

    private static void permuteHelper(String prefix, String remaining)
    {
        int len = remaining.length();
        if (len == 0) 
        {
            System.out.println(prefix);
        } 
        else 
        {
            for (int i = 0; i < len; i++) 
            {
                              //New Prefix                  New Remaining
                permuteHelper(prefix + remaining.charAt(i), remaining.substring(0, i) + remaining.substring(i + 1, len));
            }
        }
    }
}
