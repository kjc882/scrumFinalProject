/*
 * Kieran Chang 12446452
 * University of Columbia Computer Science
 */
package javabst;

/**
 *
 * @author Kieran
 */
public class JavaBST {
    
    //Node Class
    //Nodes may only take ints in this example
    class Node{
        int key;
        Node left, right;
        
        //Constructor
        public Node(int num){
            key = num;
            left = right = null;
        }
    }
    
    Node root;
    
    //JavaBST constructor
    JavaBST(){
        root = null;
    }
    
    public void inOrder(){
        inOrderReal(root);
    }
    
    //traverse the tree in order
    public void inOrderReal(Node root){
        if(root != null){
            inOrderReal(root.left);
            System.out.println(root.key);
            inOrderReal(root.right);
        }
    }
    
    public void insertSet(int key){
        root = insertReal(root, key);
    }
    
    public Node insertReal(Node root, int key){
        
        //base case
        if(root == null){
            System.out.println("insertion");
            root = new Node(key);
            return root;
        }
        
        //if this key is smaller than the current
        //root's key move left
        if(key < root.key){
            System.out.println("left");
            System.out.println(root.key);
            root.left = insertReal(root.left, key);
        }
        //else move right
        else if(key > root.key){
            System.out.println("right");
            System.out.println(root.key);
            root.right = insertReal(root.right, key);
        }
        return root;
    }
    
    public static void main(String[] args) {
        /*   BST
              50
            /    \
          30     70
          / \     / \
         20 40   60 80 
        */
       
        //creating the tree
        JavaBST bst = new JavaBST();
        bst.insertSet(50);
        bst.insertSet(30);
        bst.insertSet(20);
        bst.insertSet(40);
        bst.insertSet(70);
        bst.insertSet(60);
        bst.insertSet(80);
        
        //display the tree in order
        bst.inOrder();
    }
}
