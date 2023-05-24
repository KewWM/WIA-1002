
package Lab4;

public class TestLinkedList 
{
    public static void main(String[] args) 
    {
        MyLinkedList<Character> list = new MyLinkedList<>();
        list.add('a');
        list.add('b');
        list.add('c');
        list.add('d');
        list.add('e');
        
        System.out.print("Element: ");
        list.print();
        
        list.reverse();
        
        System.out.println("Size: " + list.getSize());
        System.out.println("First value: " + list.getFirst() + "\nLast value: " + list.getLast());
        System.out.println(list.remove(2) + " is removed!");
        
        System.out.print("Element: ");
        list.print();
        
        System.out.println("Index location of second value: " + list.indexOf('b'));
        System.out.println("Index location of third value: " + list.indexOf('c'));
        System.out.println("List contain 'c'? " + list.contains('c'));
        list.set(0, 'j');
        list.set(1, 'a');
        list.set(2, 'v');
        list.set(3, 'a');
        System.out.print("After replacement: ");
        list.print();
        
        //Q2
        System.out.println("Middle Value: " + list.getMiddleValue());
    }
}
