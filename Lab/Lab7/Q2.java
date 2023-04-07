
package Lab7;

public class Q2 
{
    //method check palindrome
    public static boolean isPalindrome(String s)
    {
        //Insert String to queue1 from front to back (fTB)
        MyQueue<Character> q1 = new MyQueue<>();
        for (char str : s.toCharArray())
            q1.enqueue((Character) str);
        String fTB = q1.toString();
        
        //Insert String to queue2 from back to front (bTF)
        MyQueue<Character> q2 = new MyQueue<>();
        while (!q1.isEmpty())
        {
            q2.enqueue(q1.dequeue());
            
            if (q2.getSize() > 1) 
            {
                for (int i = 0; i < q2.getSize() - 1; i++) 
                {
                    q2.enqueue(q2.dequeue());
                }
            }
        }
        String bTF = q2.toString();
        
        return fTB.equals(bTF);
    }
    /*
    Example: "okla"
    Size: 1
    q1: kla
    q2: o
    
    Size: 2
    q1: la
    q2: ok ->(max i: 1) ko
    
    Size: 3
    q1: a
    q2: kol ->(max i: 2) lko
    
    Size: 4
    q1: null
    q2: lkoa ->(max i: 3)  alko
    */
    
    public static void main(String[] args) 
    {
        System.out.println(isPalindrome("oklah"));
        System.out.println(isPalindrome("wtatw"));
        System.out.println(isPalindrome("oi"));
        System.out.println(isPalindrome("a"));
    }
}
