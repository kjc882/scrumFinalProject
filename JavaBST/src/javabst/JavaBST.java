/*
 * Kieran Chang 12446452
 * University of Columbia Computer Science
 * CS3330 Object Oriented Programming SP18
 */
package javabst;

/**
 *
 * @author Kieran
 */
public class JavaBST {
    
    Node root;
    
    //JavaBST constructor
    JavaBST(int key){
        root = new Node(key);
    }
    
    JavaBST(){
        root = null;
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
        JavaBST bst = new JavaBST(50);
        bst.insert(bst.root, 30);
        bst.insert(bst.root, 20);
        bst.insert(bst.root, 40);
        bst.insert(bst.root, 70);
        bst.insert(bst.root, 60);
        bst.insert(bst.root, 80);
        
        //display the tree in order
        bst.inOrder(bst.root);
    }
    
    //Node Class
    //Nodes may only take ints in this example
    class Node{
        int key;
        Node left, right;
        
        //Constructor
        public Node(int num){
            int key = num;
            left = right = null;
        }
    }
    
    //traverse the tree in order
    public void inOrder(Node root){
        if(root != null){
            inOrder(root.left);
            System.out.println(root.key);
            inOrder(root.right);
        }
    }
    
    public Node insert(Node node, int key){
        
        //if the tree is empty on insert
        if(node == null){
            System.out.println("insertion");
            Node node1 = new Node(key);
            return node1;
        }
        
        //if this key is smaller than the current
        //node's key move left
        if(key < node.key){
            System.out.println("left");
            node.left = insert(node.left, key);
        }
        //else move right
        else{
            System.out.println("right");
            node.right = insert(node.right, key);
        }
        return node;
    }
}
