
package Lab4;

public class Node <T>
{
    protected T element;
    protected Node<T> next;

    public Node() 
    {
        this(null, null);
    }
    
    public Node(T element) 
    {
        this(element, null);
    }

    public Node(T element, Node<T> next) 
    {
        this.element = element;
        this.next = next;
    }

    public T getElement() 
    {
        return element;
    }

    public void setElement(T element) 
    {
        this.element = element;
    }

    public Node<T> getNext() 
    {
        return next;
    }

    public void setNext(Node<T> next) 
    {
        this.next = next;
    }
    
}
