
package Tuto3;

public interface BidCollectionInterface 
{
    public void addBit(BidInterface bid);
    //Adds a bid to this collection.
    
    public BidInterface getBestYearlyCostBid(double averageHour, double energyCost);
    //Returns the bid in this collection with the best yearly cost.
    
    public BidInterface getBestInitialCostBid();
    /*
    Returns the bid in this collection with the best initial cost.
    The initial cost will be defined as the unit cost plus the installation cost.
    */
    
    public void clear();
    /*
    Clears all of the items from this collection.
    Percond: None
    PostCond: The collection becomes empty
    */
    
    public int getNumberBid();
    //Gets the number of items in this collection.
    
    public boolean isEmpty();
    //Sees whether this collection is empty.
}
