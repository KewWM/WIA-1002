
package S2_2019.Q1;

public class MyLinkedList<E> {
    protected Node<E> head;
    protected Node<E> tail;
    protected int size;

    public MyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public int getSize() {
        return size;
    }
    
    public void addFirst(E e)
    {
        Node<E> newNode = new Node<>(e);
        newNode.next = head;
        size++;
        if (tail == null)
            tail = head;
    }
    
    public void addLast(E e)
    {
        Node<E> newNode = new Node<>(e);
        if (tail == null) 
        {
            head = tail = newNode;
        }
        else 
        {
            tail.next = newNode;
            tail = tail.next;
        }
        size++; 
        
    }
    
    public E removeFirst()
    {
        Node<E> temp = head;
        head = head.next;
        size--;
        if (head == null) 
        {
            tail = null;
        }
        return temp.element;
    }

    @Override
    public String toString() {
        String str = "[size=" + getSize() + "] ";
        Node<E> temp = head;
        for (int i = 0; i < getSize(); i++)
        {      
            str += ">> " + temp.element + " ";
            temp = temp.next;
        }
        return str;
    }
    
    
}
