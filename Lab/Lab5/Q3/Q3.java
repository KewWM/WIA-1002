
package Lab5.Q3;

public class Q3 
{
    public static void main(String[] args) 
    {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        
        list.addFirst(1);
        list.addLast(10);
        list.addLast(100);
        list.add(2, 2);
        
        list.remove(3);
        System.out.println();
        
        list.iterateForward();
        list.iterateBackward();
        
        list.printSize();
        list.clear();
        list.printSize();
    }
}
