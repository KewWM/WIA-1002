
package S2_2017.Q1;

public class Node<E>
{
    protected E element;
    protected E price;
    protected Node<E> next;
    
    public Node(E element, E price) {
        this(element, price, null);
    }
    
    public Node(E element, E price, Node<E> next) {
        this.element = element;
        this.price = price;
        this.next = next;
    }

    public E getElement() {
        return element;
    }

    public void setElement(E element) {
        this.element = element;
    }

    public E getPrice() {
        return price;
    }

    public void setPrice(E price) {
        this.price = price;
    }

    public Node<E> getNext() {
        return next;
    }

    public void setNext(Node<E> next) {
        this.next = next;
    }
    
    
}
