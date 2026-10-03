import java.util.*;
 class Node{
    //basically a singly linked list stores only two things a data part
    // and a next part pointing to another node
    int data;
    Node next;
    //a constructor is defined to tell what the user may enter in the program
    public Node(int data){
        this.data=data;
        this.next=null;
    }
    //this identifies that when the user enters the data in a node then the data goes into this
    //node and the next node points to null which we can change
}
public class Introduction {



    public static void main(String[] args) {

        //if we want to make a linked list then we need to make the object of type node
        Node head=new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);


        //in order to print the linked list
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
}
