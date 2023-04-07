
package Lab7;

public class Q1 
{
    public static void main(String[] args) 
    {
        MyQueue<String> fruitQ = new MyQueue(new Object[] {"Durian", "Blueberry"});
        
        fruitQ.enqueue("Apple");
        fruitQ.enqueue("Orange");
        fruitQ.enqueue("Grapes");
        fruitQ.enqueue("Cherry");
        
        System.out.println(fruitQ);
        
        System.out.println("Top item: " + fruitQ.peek());
        System.out.println("Queue size: " + fruitQ.getSize());
        
        fruitQ.dequeue();
        
        System.out.println("Item at index-2: " + fruitQ.getElement(2));
        System.out.println("Contains Cherry? " + fruitQ.contains("Cherry"));
        System.out.println("Contains Durian? " + fruitQ.contains("Durian"));
        
        System.out.println(fruitQ.isEmpty());
    }
}
