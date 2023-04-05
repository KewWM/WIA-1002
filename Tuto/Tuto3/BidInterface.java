
package Tuto3;

public interface BidInterface 
{
    public String getCompanyName();
    /*
    Returns the name of the company making this bid.
    Precond: None
    PostCond: The name was returned
    */
    
    public String gerAirConditionerDescription();
    /*
    Returns the description of the air conditioner that this bid is for.
    PreCond: None
    PostCond: The name was returned
    */
    
    public double getCapacity();
    /*
    Returns the capacity of this bid's AC in tons (1 ton = 12,000 BTU).
    PreCond: None
    PostCond: The name was returned
    */
    
    public double getAirConditionerSEER();
    /*
    Returns the seasonal efficiency of this bid's AC (SEER).
    PreCond: None
    */
    
    public double getCost();
    //Returns the cost of this bid's AC.
    
    public double getInstallingCost();
    //Returns the cost of installing this bid's AC.
    
    public double getYearlyCost(double hoursOperated, double energyCost);
    //Returns the yearly cost of operating this bid's AC.
}
