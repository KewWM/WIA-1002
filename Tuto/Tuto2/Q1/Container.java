
package Tuto2.Q1;

public class Container <T>
{
    private T t;
    
    public Container ()
    {
        
    }
    
    public void add (T t)
    {
        this.t = t;
    }
    
    public T retrieve()
    {
        return this.t;
    }
    
    public static void main(String[] args)
    {
        Container <Integer> c1 = new Container<>();
        c1.add(50);
        System.out.println("Object: " + c1.retrieve());
        
        Container <String> c2 = new Container<>();
        c2.add("Java");
        System.out.println("Object: " + c2.retrieve());
    }
}
