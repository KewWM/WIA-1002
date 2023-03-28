
package Lab4;

public class MyLinkedList <E>
{
    private Node<E> head;
    private Node<E> tail;
    private int size = 0;

    public MyLinkedList() 
    {
        head = null;
        tail = null;
    }
    
    public void addFirst (E e)
    {
        Node<E> newNode = new Node<>(e);
        newNode.next = head;
        head = newNode;
        size++;
        if (tail == null)
            tail = head;
    }
    
    public void addLast (E e)
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
    
    public void add (int index, E e)
    {
        if (index == 0) 
        {
            addFirst(e);
        }
        else if (index >= size) 
        {
            addLast(e);
        }
        else 
        {
            Node<E> current = head;
            for (int i = 1; i < index; i++) 
            {
            current = current.next;
            }
            Node<E> temp = current.next;
            current.next = new Node<>(e);
            (current.next).next = temp;
            size++;
        }
    }
    
    public void add(E e) 
    {
        if (size == 0) 
        {
            addFirst(e);
        } 
        else
        {
            addLast(e);
        }
    }
    
    public E removeFirst()
    {
        if (size == 0) 
        {
            return null;
        }
        else
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
    }
    
    public E removeLast()
    {
        switch (size) 
        {
            case 0 -> 
            {
                return null;
            }
            case 1 -> 
            {
                Node<E> temp = head;
                head = tail = null;
                size = 0;
                return temp.element;
            }
            default -> 
            {
                Node<E> current = head;
                
                for (int i = 0; i < size - 2; i++)
                {
                    current = current.next;
                }
                
                Node<E> temp = tail;
                tail = current;
                tail.next = null;
                size--;
                return temp.element;
            }
        }
    }
    
    public E remove(int index)
    {
        if (index < 0 || index >= size) 
        {
            return null;
        }
        else if (index == 0)
        {
            return removeFirst();
        }
        else if (index == size - 1)
        {
            return removeLast();
        }
        else 
        {
            Node<E> previous = head;

            for (int i = 1; i < index; i++)
            {
                previous = previous.next;
            }

            Node<E> current = previous.next;
            previous.next = current.next;
            size--;
            return current.element;
        }
    }
    
    public boolean contains(E e)
    {
        Node<E> current = head;

        for (int i = 0; i < size; i++)
        {
            if (current.element == e) 
            {
                return true;
            }
            current = current.next;
        }
        return false;
    }
    
    public E get(int index)
    {
        Node<E> current = head;
        for (int i = 0; i < index; i++) 
        {
            current = current.next;
        }
        return current.element;
    }
    
    public E getFirst()
    {
        return head.element;
    }
    
    public E getLast()
    {
        return tail.element;
    }
    
    public int indexOf(E e)
    {
        Node<E> current = head;
        for (int i = 0; i < size; i++) 
        {
            if (current.element == e) 
            {
                return i;
            }
            current = current.next;
        }
        return -1;
    }
    
    public int lastIndexOf(E e)
    {
        int lastIndex = -1;
        Node<E> current = head;
        for (int i = 0; i < size; i++) 
        {
            if (current.element == e) 
            {
                lastIndex = i;
            }
            current = current.next;
        }

        return lastIndex;
    }
    
    public E set(int index, E e)
    {
        add(index, e);
        return remove(index + 1);
    }
    
    public void clear()
    {
        while (size != 0)
            removeFirst();
    }
    
    public void print()
    {
        Node<E> current = head;
        String str = "";
        for (int i = 0; i < size; i++) 
        {
            str += current.element + " ";
            current = current.next;
        }
        System.out.println(str);
    }
    
    public void reverse()
    {
        Node<E> current = head;
        E[] arr = (E[]) new Object[size];
        String str = "Reversed element: ";
        for (int i = 0; i < size; i++) 
        {
            arr[i] = current.element;
            current = current.next;
        }

        for (int i = size - 1; i > -1; i--) 
        {
            str += arr[i] + " ";
        }
        System.out.println(str);
    }

    public int getSize() 
    {
        return size;
    }
    
    //Q2
    public E getMiddleValue() 
    {
        Node<E> current = this.head;
        for (int i = 0; i < (this.size + 1) / 2; i++) 
            current = current.next;
        return current.element;
    }
}
