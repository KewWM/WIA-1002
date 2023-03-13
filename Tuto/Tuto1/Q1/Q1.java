
package Tuto1.Q1;

public class Q1 
{
    public static void main(String[] args) 
    {
        String areaCode = "03";
        int[] number = {79676301, 79676302, 79676303, 79676304, 79676305};
        Telephone[] tp = new Telephone[5];
        for (int i = 0; i < tp.length; i++)
        {
            tp[i] = new Telephone(areaCode, number[i]);
            System.out.println(tp[i].makeFullNumber());
        }
    }
}
