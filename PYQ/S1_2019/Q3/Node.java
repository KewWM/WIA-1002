
package S1_2019.Q3;

public class Node <E>
{
    protected E element;
    protected Node<E> next;
    protected int hour;

    public Node(E element, int hour) 
    {
        this.element = element;
        this.hour = hour;
    }

    public E getElement() {
        return element;
    }

    public void setElement(E element) {
        this.element = element;
    }

    public Node<E> getNext() {
        return next;
    }

    public void setNext(Node<E> next) {
        this.next = next;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }
}
