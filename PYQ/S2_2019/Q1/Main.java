package S2_2019.Q1;

public class Main
{

    public static void main(String[] args)
    {
        MyLinkedList<Integer> list1 = new MyLinkedList<>();
        MyLinkedList<Integer> list2 = new MyLinkedList<>();
        MyLinkedList<Integer> newList = new MyLinkedList<>();

        list1.addLast(2);
        list1.addLast(10);
        list1.addLast(38);
        list1.addLast(41);
        list1.addLast(51);
        System.out.println(list1.toString());

        list2.addLast(5);
        list2.addLast(12);
        list2.addLast(18);
        list2.addLast(21);
        list2.addLast(35);
        list2.addLast(41);
        list2.addLast(56);
        System.out.println(list2.toString());

        System.out.println("The newList is:");
        combine(list1, list2, newList);
    }

    public static void combine(MyLinkedList list1, MyLinkedList list2, MyLinkedList newList) {
        //Get newList's size
        int size1 = list1.getSize();
        int size2 = list2.getSize();
        int sizeNew = size1 + size2;
        
        while (list1.getSize() != 1 || list2.getSize() != 1) 
        {   
            if ((int) list1.head.element < (int) list2.head.element) 
            {
                int temp = (int) list1.head.element;
                newList.addLast(temp);
                list1.removeFirst();
            } 
            else if ((int) list2.head.element < (int) list1.head.element) 
            {
                int temp = (int) list2.head.element;
                newList.addLast(temp);
                list2.removeFirst();
            } 
            else 
            {
                int temp = (int) list1.head.element;
                newList.addLast(temp);
                list1.removeFirst();
            }
        }
        
        if ((int) list1.head.element < (int) list2.head.element) 
        {
            int temp = (int) list1.head.element;
            newList.addLast(temp);
            list1.removeFirst();
            temp = (int) list2.head.element;
            newList.addLast(temp);
            list2.removeFirst();
        } 
        else if ((int) list2.head.element < (int) list1.head.element) 
        {
            int temp = (int) list2.head.element;
            newList.addLast(temp);
            list2.removeFirst();
            temp = (int) list1.head.element;
            newList.addLast(temp);
            list1.removeFirst();
        } 

        System.out.println(newList.toString());
    }
}
