package Lab2.Q5;

public class Circle implements Comparable<Circle> 
{
    private double radius;

    public Circle(double radius) 
    {
        this.radius = radius;
    }

    @Override
    public int compareTo(Circle o) 
    {
        if (this.radius > o.radius)
            return 1;
        else if (this.radius < o.radius)
            return -1;
        else
            return 0;
        //return this.radius.compareTo(o.radius);
    }

    @Override
    public String toString()
    {
        return "Circle with radius " + radius;
    }
}
