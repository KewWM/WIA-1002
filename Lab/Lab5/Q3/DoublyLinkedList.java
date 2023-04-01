
package Lab5.Q3;

public class DoublyLinkedList <E>
{
    private Node<E> head;
    private Node<E> tail;
    private int size;

    public DoublyLinkedList() 
    {
        this.head = null;
        this.tail = null;
        size = 0;
    }
    
    public void addFirst(E e)
    {
        Node<E> tmp = new Node(e, head, null);
        if (head != null)
            head.prev = tmp;
        head = tmp;
        if (tail == null)
            tail = tmp;
        size++;
        System.out.println("adding: " + e);
    }
    
    public void addLast(E e)
    {
        Node<E> tmp = new Node(e , null, tail);
        if (tail != null)
            tail.next = tmp;
        tail = tmp;
        if (head == null)
            head = tmp;
        size++;
        System.out.println("adding: " + e);
    }
    
    public void add(int index, E e)
    {
        if (index < 0 || index > size)
            System.out.println("Error: Index out of bounds. Can't add.");
        else if (index == 0)
            addFirst(e);
        else if (index == size)
            addLast(e);
        else
        {
            Node<E> tmp = head;
            for (int i = 0; i < index; i++)
            {
                tmp = tmp.next;
            }
            Node<E> insert = new Node(e, tmp, tmp.prev);
            tmp.prev.next = insert;
            tmp.prev = insert;
            size++;
        }
    }
    
    public void iterateForward()
    {
        System.out.println("iterating forward..");
        Node<E> tmp = head;
        while (tmp != null)
        {
            System.out.print(tmp.element + " ");
            tmp = tmp.next;
        }
        System.out.println();
    }
    
    public void iterateBackward()
    {
        System.out.println("iterating backward..");
        Node<E> tmp = tail;
        while (tmp != null)
        {
            System.out.print(tmp.element + " ");
            tmp = tmp.prev;
        }
        System.out.println();
    }
    
    public E removeFirst()
    {
        if (size == 0)
        {
            System.out.println("Error: No first node. Nothing to remove.");
            return null;
        }
        
        Node<E> tmp = head;
        head = head.next;
        head.prev = null;
        tmp.next = null;
        size--;
        System.out.println("deleted: " + tmp.element);
        return tmp.element;
    }
    
    public E removeLast()
    {
        if (size == 0)
        {
            System.out.println("Error: No last node. Nothing to remove.");
            return null;
        }
        
        Node<E> tmp = tail;
        tail = tail.prev;
        tail.next = null;
        tmp.prev = null;
        size--;
        System.out.println("deleted: " + tmp.element);
        return tmp.element;
    }
    
    public E remove(int index)
    {
        E element = null;
        if (index < 0 || index >= size)
        {
            System.out.println("Error: Index out of bounds. Can't remove.");
            return null;
        }
        else if (index == 0)
            element = removeFirst();
        else if (index == size - 1)
            element = removeLast();
        else
        {
            Node<E> tmp = head;
            for (int i = 0; i < index; i++)
                tmp = tmp.next;
            element = tmp.element;
            tmp.next.prev = tmp.prev;
            tmp.prev.next = tmp.next;
            tmp.next = null;
            tmp.prev = null;
            System.out.println("deleted: " + tmp.element);
        }
        return element;
    }
    
    public void clear()
    {
        System.out.printf("successfully clear %d node(s)\n\n", getSize());
        Node<E> tmp = head;
        while (head != null)
        {
            tmp = head.next;
            head.prev = head.next = null;
            head = tmp;
        }
        tmp = null;
        tail.prev = tail.next = null;
        size = 0;
    }

    public int getSize() 
    {
        return size;
    }
    
    public void printSize()
    {
        System.out.println("Size of current Doubly Linked List: " + getSize());
    }
}
