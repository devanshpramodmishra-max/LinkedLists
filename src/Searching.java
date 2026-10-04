import java.util.Scanner;

public class Searching {
    public static boolean Search(Node head,int value){
        while(head!=null){
            if(head.data==value){return true;}
            else {
            head=head.next;
            }
        }
        return false;
    }


    public static void main(String[] args) {

        Node head = new Node(2);
        head.next = new Node(3);
        head.next.next = new Node(4);
        head.next.next.next = new Node(5);
        Scanner sc=new Scanner(System.in);
        int value=sc.nextInt();
        System.out.println(Search(head,value));
    }
}
