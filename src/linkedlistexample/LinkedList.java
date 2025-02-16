/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linkedlistexample;

/**
 *
 * @author Sifiso
 */
public class LinkedList {
    private Node head; // The first node in the list
    
    public void insert(int data){
        Node newNode=new Node(data);
        if(head==null){
            head =newNode;
            return;
        }
        Node temp =head;
        while(temp.next != null){
            temp=temp.next;
        }
        temp.next = newNode;
        
    }
    
    public void display(){
        Node temp =head;
        while(temp!=null){
            System.out.print(temp.data+" ->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    
    
    
    
    
    
}
