
package S2_2017.Q1;

public class LinkedList<E>
{
    private int size;
    protected Node<E> head;
    protected Node<E> tail;
    
    public LinkedList()
    {
        size = 0;
        head = null;
        tail = null;
    }
    
    public void insertFirstLink(String Bag, int price)
    {
        Node<E> newNode = new Node(Bag, price);
        newNode.next = head;
        head = newNode;
        size++;
        if (tail == null)
            tail = head;
    }
    
    public void addAfter(String selectedBag, String Bag, int price)
    {
        System.out.printf("Adding %s after %s\n", Bag, selectedBag);
        Node<E> newNode = new Node(Bag, price);
        Node<E> previous = head;
        Node<E> current = previous.next;
        int location = 1;
        for (int i = 1; i < size && !previous.element.equals(selectedBag); i++)
        {
            previous = previous.next;
            current = current.next;
            location++;
        }
        System.out.printf("Found %s which is handbag number %d in the linked list\n\n", selectedBag, location);
        previous.next = newNode;
        newNode.next = current;
        size++;
//        Node<E> previous = head;
//        for (int i = 1; i < size - 1; i++)
//        {
//            Node<E> current = head.next;
//            if (previous.element == selectedBag)
//            {
//                System.out.printf("Found %s which is handbag number %d in the linked list\n\n", selectedBag, i+1);
//                newNode.next = current;
//                previous.next = newNode;
//                size++;
//            }
//            previous = previous.next;
//        }
    }
    
    public void removeLink(String bag)
    {
        System.out.println("Removing " + bag);
        Node<E> previous = head;
        Node<E> current = previous.next;
        int location = 1;
        for (int i = 1; i < size && !current.element.equals(bag); i++) 
        {
            previous = previous.next;
            current = current.next;
            location++;
        }
        System.out.printf("Found %s which is handbag number %d in the linked list\n\n", bag, location+1);
        previous.next = current.next;
        size--;
    }

    public String display()
    {
        String str= "Displaying the Linked List *************************************\n";
        Node<E> current = head;
        for (int i = 0; i < size; i++)
        {
            str += String.format("%s: %s Sold\n", current.getElement(), current.getPrice());
            current = current.next;
        }
        return str;
    }
}
