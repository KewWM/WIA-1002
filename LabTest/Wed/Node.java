
package labtest1_wia1002;

public class Node <T>
{
    private T value;
    private String edgeName1;
    private String edgeName2;
    private Node<T> edgeNode1;
    private Node<T> edgeNode2;
    private Person peep;
    
    public Node (Person o)
    {
        peep = o;
    }
    
    //Task 3
    public Node (String name)
    {
        peep = new Person(name);
    }
    
    public void setEdge1 (String edgeName, Node<T> node)
    {
        this.edgeNode1 = node;
        this.edgeName1 = edgeName;
    }
    
    public void setEdge2 (String edgeName, Node<T> node)
    {
        this.edgeNode2 = node;
        this.edgeName2 = edgeName;
    }
    
    public T getValue()
    {
        return this.value;
    }
    
    public void printEdgesAndNodes()
    {
        System.out.println("---------------------------------------");
        System.out.println(peep.toString());
        System.out.printf("  :%s->\n", edgeName1);
        System.out.println("\t" + edgeNode1.peep.toString());
        System.out.printf("  :%s->\n", edgeName2);
        System.out.println("\t" + edgeNode2.peep.toString());
        System.out.println("---------------------------------------");
    }
    
    public void setValue(T t)
    {
        this.value = t;
    }
    //Task3
    public Node<T> traverse (String edgeName)
    {
        Node <T> result = null;
        if (edgeName.equals(edgeName1))
            result = edgeNode1;
        else
            result = edgeNode2;
        return result;
    }
}
