
package Lab7b;

public class ComparableBook implements Comparable<ComparableBook>
{
    private int id;
    private String name;

    public ComparableBook(int id, String name) 
    {
        this.id = id;
        this.name = name;
    }
    
    @Override
    public String toString() 
    {
        return String.format("(%d) %s", this.id, this.name);
    }
    
    @Override
    public int compareTo(ComparableBook cBook) 
    {
        return this.id - cBook.id;
    }
}
