
package Tuto1.Q3;

public class C
{
    public static void main(String[] args) 
    {
        Object[] o = {new A(), new B()};
        System.out.print(o[0]);
        System.out.print(o[1]);
    }
}

class A extends B 
{
    public String toString() 
    {
        return "A";
    }
}

class B 
{
    public String toString() 
    {
        return "B";
    }
}

/*
Answer is a.AB
First, system prints (o[0]) which toString method in subclass A overrides output of toString method in superclass B which is "B" 
Second, system prints (o[1]) which is toString method in superclass B that return "B"
*/