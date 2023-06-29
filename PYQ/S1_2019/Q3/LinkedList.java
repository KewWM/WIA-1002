
package S1_2019.Q3;

public class LinkedList<E> 
{
    protected int size = 0;
    protected Node<E> head = null;
    protected Node<E> tail = null;
    
    public LinkedList()
    {
        
    }
    
    public boolean isEmpty()
    {
        return (size == 0);
    }
    
    public void add(E subject, int hour)
    {
        Node<E> newNode = new Node<>(subject, hour);
        newNode.next = head;
        head = newNode;
        size++;
        if (tail == null) 
        {
            tail = head;
        }
    }
    
    public void addAfter(E subject, E newSub, int hour)
    {
        System.out.printf("Adding %s after %s\n\n", newSub, subject);
        Node<E> current = head;
        for (int i = 0; i < size; i++)
        {
            if(current.element == (subject))
            {
                Node<E> temp = current.next;
                current.next = new Node<>(newSub, hour);
                current.next.next = temp;
                size++;
                break;
            }
            current = current.next;
        }
    }
    
    public void remove(E subject, int hour)
    {
        System.out.println("Removing " + subject + "...\n");
        Node<E> findIndex = head;
        int location = -1;
        for (int i = 0; i < size; i++)
        {
            if(findIndex.element == (subject))
            {
                location = i;
                break;
            }
            else
            {
                findIndex = findIndex.next;
            }
        }
        
        if (location == -1)
        {
            System.out.println("Nothing to remove...");
        }
        
        Node<E> previous = head;
        for (int j = 0; j < location-1; j++)
        {
            previous = previous.next;
        }
        Node<E> current = previous.next;
        previous.next = current.next;
        size--;
    }
    
    public void display()
    {
        System.out.println("Displaying the Linked List *****************************\n");
        Node<E> current = head; 
        String str = "";
        while(current != null)
        {
            System.out.printf("%s: %d hours\n", current.element, current.hour);
            current = current.next;
        }
        System.out.println("");
    }
    
    public void totalCreditHours()
    {
        int total = 0;
        Node<E> current = head;
        for (int i = 0; i < size; i++)
        {
            total += current.hour;
            current = current.next;
        }
        System.out.println("Total credit hours: " + total + "\n");
    }
}
