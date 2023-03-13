
package Tuto1.Q1;

public class Telephone 
{
    private String areaCode;
    private int number;
    private static int numberOftelephoneObject = 0;

    public Telephone(String areaCode, int number) 
    {
        this.areaCode = areaCode;
        this.number = number;
        numberOftelephoneObject++;
    }

    public String getAreaCode() 
    {
        return areaCode;
    }
    public void setAreaCode(String areaCode) 
    {
        this.areaCode = areaCode;
    }

    public int getNumber() 
    {
        return number;
    }
    public void setNumber(int number) 
    {
        this.number = number;
    }
    
    public String makeFullNumber()
    {
        String s = this.areaCode + "-" + this.number;
        return s;
    }
}
