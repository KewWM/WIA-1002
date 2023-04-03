
package Lab6.Q1;

public class TestMyStack 
{
    public static void main(String[] args) 
    {
        MyStack <Character> walao = new MyStack<>();
        
        walao.push('a');
        walao.push('b');
        walao.push('c');
        System.out.println(walao.toString());
        System.out.println("Element 'b' exist? " + walao.search('b'));
        System.out.println("Element 'k' exist? " + walao.search('k'));
        
        System.out.println();
        MyStack <Integer> fuiyoh = new MyStack<>();
        
        fuiyoh.push(1);
        fuiyoh.push(2);
        fuiyoh.push(3);
        System.out.println(fuiyoh.toString());
        System.out.println("Element '6' exist? " + fuiyoh.search(6));
    }
}
