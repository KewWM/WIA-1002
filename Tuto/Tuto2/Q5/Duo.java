
package Tuto2.Q5;

public class Duo <A, B>
{
    private A first;
    private B second;
    
    public Duo (A first, B second)
    {
        this.first = first;
        this.second = second;
    }

    public A getFirst() 
    {
        return first;
    }
    public void setFirst(A first) 
    {      
        this.first = first;
    }

    public B getSecond() 
    {
        return second;
    }
    public void setSecond(B second) 
    {
        this.second = second;
    }
    
    
}
