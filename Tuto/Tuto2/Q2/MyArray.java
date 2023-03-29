
package Tuto2.Q2;

public class MyArray 
{
    public static void main(String[] args) 
    {
        Integer[] numbers = {1, 2, 3, 4, 5};
        String[] names = {"Jane", "Tom", "Bob"};
        Character[] alphabet = {'a', 'b', 'c'};
        
        listAll(numbers, names, alphabet);
    }
    public static <T> void listAll (T[]... input)
    {
        for (T[] array : input) 
        {
  
            for (T item : array) 
            {
                System.out.print(item + " ");
            }
        System.out.println();
        }
    }
}
