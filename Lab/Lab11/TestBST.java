
package Lab11;

import java.util.Arrays;

public class TestBST
{
    public static void main(String[] args) 
    {
        Integer[] num = {45, 88, 54, 76, 98, 1, 2, 20, 6, 53, 42, 100, 86, 32, 28, 65, 14};
        String arr = Arrays.toString(num).replace("[", "").replace("]", "");
        System.out.println("Input Data: " + arr);
        
        BST<Integer> treeBst = new BST(num);
        System.out.print("Inorder (sorted): ");
        treeBst.inorder(treeBst.getRoot());
        System.out.println("");
        
        System.out.print("Postorder: ");
        treeBst.postorder(treeBst.getRoot());
        System.out.println("");
        
        System.out.print("Preorder: ");
        treeBst.preorder(treeBst.getRoot());
        System.out.println("");
        
        System.out.println("Height of BST: " + treeBst.height());
        
        System.out.println("Root for BST is: " + treeBst.getRootElement());
        
        System.out.println("Check whether 10 is in the tree? " + treeBst.search(10));
        
        System.out.println("Delete 53 " + treeBst.delete(45));
        
        System.out.print("Updated Inorder data (sorted): ");
        treeBst.inorder(treeBst.getRoot());
        System.out.println("");
        
        System.out.println("Min Value: " + treeBst.minValue());
        System.out.println("Max Value: " + treeBst.maxValue());
        
        System.out.println("A path from the root to 6 is: " + treeBst.pathAsStr(6));
        
    }
}
