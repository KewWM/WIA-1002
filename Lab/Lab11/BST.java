
package Lab11;

public final class BST <E extends Comparable<E>>
{
    protected TreeNode<E> root;
    protected int size = 0;
    
    public BST() 
    {
        root = new TreeNode<>();
        size = 0;
    }

    public BST(E[] arr) 
    {
        for (E obj : arr)
            insert(obj);
    }

    public boolean search(E e) 
    {
    TreeNode<E> current = root; // Start from the root

        while (current != null)
        {
            if (e.compareTo(current.element) < 0)
                current = current.left;
            else if (e.compareTo(current.element) > 0)
                current = current.right;
            else // element matches current.element
                return true; // Element is found
        }
        return false;
    }
    
    public boolean insert(E e)
    {
        if (root == null)
            root = new TreeNode<>(e); // Create a new root
        else 
        {
            // Locate the parent node
            TreeNode<E> parent = null;
            TreeNode<E> current = root;
            while (current != null) 
            {
                if (e.compareTo(current.element) < 0) 
                {
                    parent = current;
                    current = current.left;
                } 
                else if (e.compareTo(current.element) > 0)
                {
                    parent = current;
                    current = current.right;
                } 
                else
                {
                    return false; // Duplicate node not inserted
                }
            }
            // Create the new node and attach it to the parent node
            if (e.compareTo(parent.element) < 0)
                parent.left = new TreeNode<>(e);
            else
                parent.right = new TreeNode<>(e);
        }
        size++;
        return true; // Element inserted successfully
    }
    
    public int getSize()
    {
        return size;
    }
    
    public int height() 
    {
        TreeNode<E> node = root;
        if (node == null) 
            return 0;
        else 
        {
            // compute the depth of each subtree
            int lDepth = height(node.left);
            int rDepth = height(node.right);

            // use the larger one 
            if (lDepth > rDepth)
                return (lDepth);
            else
                return (rDepth);
        }
    }
    
    private int height(TreeNode<E> node) 
    {
        if (node == null)
            return 0;
        else 
        {
            /* compute the depth of each subtree */
            int lDepth = height(node.left);
            int rDepth = height(node.right);

            /* use the larger one */
            if (lDepth > rDepth)
                return (lDepth + 1); 
            else
                return (rDepth + 1);
        }
    }
    
    public E getRootElement() 
    {
        return root.element;
    }
    
    public TreeNode<E> getRoot()
    {
        return root;
    }
    
    public E minValue() 
    {
        TreeNode<E> parent = null;
        TreeNode<E> current = root;

        while (current != null) 
        {
            parent = current;
            current = current.left;
        }

        return parent.element;
    }
    
    public E maxValue()
    {
        TreeNode<E> parent = null;
        TreeNode<E> current = root;

        while (current != null) 
        {
            parent = current;
            current = current.right;
        }

        return parent.element;
    }
    
    public java.util.ArrayList<TreeNode<E>> path(E e) 
    {
        java.util.ArrayList<TreeNode<E>> list = new java.util.ArrayList<TreeNode<E>>();
        TreeNode<E> current = root; // Start from the root

        while (current != null) 
        {
            list.add(current); // Add the node to the list
            if (e.compareTo(current.element) < 0)
                current = current.left;
            else if (e.compareTo(current.element) > 0)
                current = current.right;
            else
                break;
        }
        return list; // Return an array list of nodes
    }
    
    public String pathAsStr(E e) 
    {
        java.util.ArrayList ptrList = path(e);
        java.util.ArrayList<E> list = new java.util.ArrayList<>();
        for (Object ptr : ptrList) 
        {
            TreeNode<E> node = (TreeNode<E>) ptr;
            list.add(node.element);
        }

        return list.toString().replace("[", "").replace("]", "").replace(", ", " ");
    }
    
    public boolean delete(E e) 
    {
        // Locate the node to be deleted and also locate its parent node
        TreeNode<E> parent = null;
        TreeNode<E> current = root;
        while (current != null) 
        {
            if (e.compareTo(current.element) < 0) 
            {
                parent = current;
                current = current.left;
            } 
            else if (e.compareTo(current.element) > 0) 
            {
                parent = current;
                current = current.right;
            }
            else
                break; // Element is in the tree pointed at by current
        }

        if (current == null)
            return false; // Element is not in the tree

        if (current.left == null)
        {
            // Case 1: current has no left child
            // Connect the parent with the right child of the current node
            if (parent == null)
                root = current.right;
            else 
            {
                if (e.compareTo(parent.element) < 0)
                    parent.left = current.right;
                else
                    parent.right = current.right;
            }
        } 
        else
        {
            // Case 2: The current node has a left child
            // Locate the rightmost node in the left subtree of
            // the current node and also its parent
            TreeNode<E> parentOfRightMost = current;
            TreeNode<E> rightMost = current.left;

            while (rightMost.right != null) 
            {
                parentOfRightMost = rightMost;
                rightMost = rightMost.right; // Keep going to the right
            }

            // Replace the element in current by the element in rightMost
            current.element = rightMost.element;

            // Eliminate rightmost node
            if (parentOfRightMost.right == rightMost)
                parentOfRightMost.right = rightMost.left;
            else // Special case: parentOfRightMost == current
                parentOfRightMost.left = rightMost.left;
        }
        size--;
        return true; // Element deleted successfully
    }
    
    public boolean clear() 
    {
        root = null;
        size = 0;
        return true;
    }
    
    protected void inorder(TreeNode<E> root) 
    {
        if (root == null) 
            return;
        inorder(root.left);
        System.out.print(root.element + " ");
        inorder(root.right);
    }
    
    protected void postorder(TreeNode<E> root) 
    {
        if (root == null)
            return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.element + " ");
    }
    
    protected void preorder(TreeNode<E> root)
    {
        if (root == null)
            return;
        System.out.print(root.element + " ");
        preorder(root.left);
        preorder(root.right);
    }
}
