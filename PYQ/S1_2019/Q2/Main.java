
package S1_2019.Q2;

public class Main 
{
    public static void main(String[] args) 
    {
        GenericQueue<String> q = new GenericQueue<String>(6);
        q.enqueue("Hello");
        q.enqueueMany("all,who,wants,ice cream,or cookies");
        q.display();
        q.dequeue();
        q.dequeueAll();
        q.display();
        
        System.out.println("------------------------------------");
        
        GenericQueue<Integer> q2 = new GenericQueue<Integer>(6);
        q2.enqueue(1000);
        q2.enqueue(2000);
        q2.enqueueMany("3000,4000 5000,6000,7000,8000 9000");
        q2.display();
        q2.dequeue();
        q2.dequeue();
        q2.enqueue(8000);
        q2.dequeueAll();
        q2.display();
    }
}
