
package Tuto1.Q4;

public abstract class Vehicle 
{
    private double maxSpeed;
    protected double currentSpeed;

    public Vehicle(double maxSpeed) 
    {
        this.maxSpeed = maxSpeed;
        this.currentSpeed = 0;
    }
    
    public abstract void accelerate();
    
    public double getMaxSpeed() 
    {
        return maxSpeed;
    }

    public double getCurrentSpeed()
    {
        return currentSpeed;
    }
    
    public void pedalToTheMetal()
    {
        while (currentSpeed < maxSpeed)
            accelerate(); 
    }
}
/*
No. It is an abstract class
*/