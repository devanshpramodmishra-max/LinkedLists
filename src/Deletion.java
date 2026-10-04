import java.util.Scanner;

public class Deletion {
    public static Node Delete(Node head,int index){
        //here we need to delete a node frm a linked list at a index
        Node temp=head;

        for(int i=1;i<index-1;i++){
            temp=temp.next;
            //this has reached the previous index which is required
        }
        temp.next=temp.next .next;
        return head;
    }
    public static void main(String[] args) {

        Node head = new Node(2);
        head.next = new Node(3);
        head.next.next = new Node(4);
        head.next.next.next = new Node(5);
        Scanner sc=new Scanner(System.in);
        int index=sc.nextInt();
       Delete(head,index);
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
}
