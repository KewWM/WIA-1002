
package Tuto4;

public interface Q3 <E>
{
    public E removeLast();
}

/*
a) The name is removeLast()

b)
public E removeLast() 
{
    Node<E> pointer 1 = head;
    if (size == 0) 
        return null;
    else if (size == 1) 
    {
        size = 0;
        return tail;
    }
    else 
    {
        Node<E> pointer1 = head;
        
        // Move to last 2nd node
        for (int i = 1; i < size - 1; i++) 
            pointer1 = pointer1.next;

        // Remove last node
        Node<E> temp = tail;
        tail = pointer1;
        tail.next = null;
        
        size--;

        return temp.element;
    }
}

public E removeLast() 
{
    Node<E> pointer 1 = head;

    for (int  i = 0; i < size - 2; size++)
    {
        pointer1 = pointer1.next;
        
*/