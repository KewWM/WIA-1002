
package Lab9;

public class Q1 
{
    public static void main(String[] args) 
    {
        String s1 = "flabbergasted";
        String s2 = "Astronaut";
        System.out.printf("%s --> %s\n", s1, substitute(s1));
        System.out.printf("%s --> %s\n", s2, substitute(s2));
    }
    
    public static String substitute(String str)
    {
        //Base Case
        if (str.isBlank())
            return "";
        
        if (str.charAt(0) == 'a')
            return 'i' + substitute(str.substring(1));
        else
            return str.charAt(0) + substitute(str.substring(1));
    }
}
