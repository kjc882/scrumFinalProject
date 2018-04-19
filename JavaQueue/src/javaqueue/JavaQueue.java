/*
 * Kieran Chang 12446452
 * University of Columbia Computer Science
 * CS3330 Object Oriented Programming SP18
 */
package javaqueue;

/**
 *
 * @author Kieran
 */
public class JavaQueue {

    //Node Class
    //Nodes may only take ints in this example
    class Node{
        int key;
        Node next;
        
        //Constructor
        public Node(int num){
            key = num;
            next = null;
        }
    }
    
    Node root = null;
    
    JavaQueue(int key){
        root = new Node(key);
    }
    
    JavaQueue(){
        root = null;
    }
    
    public Node insert(Node node, int key){
        
        //if the queue is empty on insert
        if(node == null){
            Node node1 = new Node(key);
            return node1;
        }
        
        //node to be added to the queue
        Node node1 = new Node(key);
        Node holder = node;
        
        //cycle to the end of the list
        while(node.next != null){
            node = node.next;
        }
        
        //add the new node to the end of the queue
        node.next = node1;
        
        //head of the list does not change
        //return the same node that was sent
        return holder;
    }
    
    public Node remove(Node node){
        //create node to hold the new head node
        Node tmp = node.next;
        
        //delete the old head of the list
        node = null;
        
        //return the new head of the list
        return tmp;
    }
    
    public void print(Node node){
        //cycle through the list
        while(node.next != null){
            System.out.println(node.key);
            node = node.next;
        }
        
        //print the last element not covered in while loop
        System.out.println(node.key);
    }
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create and populate the queue
        JavaQueue q = new JavaQueue(50);
        q.insert(q.root, 30);
        q.insert(q.root, 20);
        q.insert(q.root, 40);
        q.insert(q.root, 70);
        q.insert(q.root, 60);
        q.insert(q.root, 80);
        
        //display the queue after creation
        System.out.println("Queue after creation");
        q.print(q.root);
        
        //remove 3 elements from the queue
        q.root = q.remove(q.root);
        q.root = q.remove(q.root);
        q.root = q.remove(q.root);
        
        //display the q after the removals
        System.out.println("Queue after removals");
        q.print(q.root);
    }
    
}
