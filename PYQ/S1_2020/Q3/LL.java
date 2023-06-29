package S1_2020.Q3;

public class LL<T> {

    protected int size = 0;
    protected Node<T> head;
    protected Node<T> tail;
    private String place[] = {"first", "second", "third", "forth", "fifth", "sixth", "seventh"};

    public LL() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return (size == 0);
    }

    public void createNode(T t, int w) {
        String temp = t + ": " + Integer.toString(w) + ",000,000 Sold";
        add((T) temp);
    }

    public void add(T t) {
        Node<T> newNode = new Node<>(t);
        newNode.next = head;
        head = newNode;
        size++;
        if (tail == null) {
            tail = head;
        }
    }

    public void addAfter(T t, T t2, int w) {
        String temp = t2 + ": " + Integer.toString(w) + ",000,000 Sold";

        Node<T> current = head;
        Node<T> found;
        for (int i = 0; i < size; i++) {
            String sub1 = (String) t;
            String sub2 = (String) current.element;
            if (sub2.contains(sub1)) {
                System.out.printf("Adding %s after %s\nFound %s which is book number %d in the linked list\n\n", t2, t, t, i);
                found = current;

                Node<T> nextNext = current.next;
                current.next = new Node<>((T) temp);
                (current.next).next = nextNext;
                size++;
                display();
                break;
            } else {
                current = current.next;
            }
        }
//        boolean ok = true;
//        while (ok) {
//            if (current.element == t) {
//                Node<T> nextNext = current.next;
//                current.next = newNode;
//                (current.next).next = nextNext;
//                size++;
//                System.out.println(nextNext);
//                ok = false;
//            } 
//            else {
//                current = current.next;
//            }
//        }
    }

    public void removeNode(T t) {
        String sub1 = (String) t;
        Node<T> previous = head;
        for (int i = 0; i < size; i++) {
            String sub2 = (String) previous.element;

            if (i == size - 1) {
                System.out.printf("Removing %s..\nCouldn't find bookname\n\n", t);
                break;
            } else if (sub2.contains(sub1)) {
                System.out.printf("Removing %s..\n%s is the %s book. Removing %s from the linked list\n\n", t, t, place[i], t);
                if (i == 0) {
                    head = head.next;
                    size--;
                    break;
                } else {
                    Node<T> current = previous.next;
                    previous.next = current.next;
                    size--;
                    break;
                }
            } else {
                previous = previous.next;
            }
        }
    }

    public void remove() {

    }

    public void display() {
        System.out.println("Displaying the Linked List *****************************\n");
        Node<T> current = head;
        String str = "";
        for (int i = 0; i < size; i++) {
            str += current.element + "\n";
            current = current.next;
        }
        System.out.println(str);
    }

    public void totalSold() {

    }
}
