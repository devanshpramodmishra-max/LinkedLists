import java.sql.SQLOutput;

public class ReverseLL {
    public static Node Reverse(Node head){
        //this will be the reverse of the linked list
        Node prev=null;
        Node current=head;
        while(current!=null){
            Node next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        return prev;
    }
    public static void main(String[] args) {
        Node head=ExampleLL.LL();
        Node temp=head;
        Node head2= Reverse(head);
    }
}
