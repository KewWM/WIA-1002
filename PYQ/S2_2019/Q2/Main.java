package S2_2019.Q2;

public class Main {

    public static void main(String[] args) 
    {
        String[] region = {"Asia", "Europe", "Europe", "Greenland", "Asia", "Greenland", "Asia"};
        Integer[] amount = {450, 510, 650, 200, 390, 670, 790};
        String[] name = {"Ahamd", "Hemish", "Banny", "Ain", "Ali", "Ben", "Lee"};
        SalesList sl = new SalesList(region, amount, name);
        SortSalesList sortL = new SortSalesList();

        System.out.println("Original Data:");
        System.out.println(sl.toString());

        System.out.println("Sorting Result on Region using SelectionSort");
        sortL.selectionSort(region);

        System.out.println("Sorting Result on Sales using InsertionSort");
        sortL.insertionSort(amount);

        System.out.println("Sorting Result on SalesRep using BubbleSort");
        sortL.bubbleSort(name);
    }
}
