/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javastack;

/**
 *
 * @author Kieran
 */
public class JavaStack {

    class Node{
        int key;
        Node next;
        
        //Constructor
        public Node(int num){
            key = num;
            next = null;
        }
    }
    
    //create the root node
    Node root = null;
    
    //constructor
    JavaStack(int key){
        root = new Node(key);
    }
    
    public Node insert(Node node, int key){
        //insert key at the head of the linked list
        //acting as a stack. 
        //Note: this will only happen if the root is
        //not set in main
        if(node == null){
            Node node1 = new Node(key);
            return node1;
        }
        
        //create the node to be added at the head
        Node node1 = new Node(key);
        //set the new node to point to the old head
        node1.next = node;
        //return node1 as the new head of the list
        return node1;
    }
    
    public Node remove(Node node){
        //check if the node to remove is the last
        //node on the stack
        if(node.next == null){
            node = null;
            return node;
        }
        
        //create holder node and set it to the next
        //element in the list
        Node tmp = node.next;
        
        //delete the old head
        node = null;
        
        //return the new head of the list
        return tmp;
    }
    
    public void print(Node node){
        while(node.next != null){
            System.out.println(node.key);
            node = node.next;
        }
        
        System.out.println(node.key);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create the stack
        JavaStack js = new JavaStack(50);
        
        //populate the stack
        js.root = js.insert(js.root, 30);
        js.root = js.insert(js.root, 20);
        js.root = js.insert(js.root, 40);
        js.root = js.insert(js.root, 70);
        js.root = js.insert(js.root, 60);
        js.root = js.insert(js.root, 80);
        
        //printing the stack
        System.out.println("Stack after insertions");
        js.print(js.root);
        
        //de-populating the stack
        js.root = js.remove(js.root);
        js.root = js.remove(js.root);
        js.root = js.remove(js.root);
        
        //printing the stack
        System.out.println("Stack after removals");
        js.print(js.root);
    }
    
}
