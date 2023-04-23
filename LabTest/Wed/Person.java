
package labtest1_wia1002;

public class Person 
{
    private String name;
    private int age;
    
    public Person(String name, int age) 
    {
        this.name = name;
        this.age = age;
    }
    
    public Person(String name)
    {
        this.name = name;
    }
    
    @Override
    public String toString() 
    {
        return String.format("%s (age=%s)", this.name, this.age);
    }
}
