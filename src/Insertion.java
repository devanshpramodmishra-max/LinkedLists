public class Insertion {
    public static Node InsertAtBegin(Node head,int num) {
   Node temp=new Node(num);
   temp.next=head;
   return temp;

    }

    public static Node InsertAtEnd(Node head,int num) {
    Node temp=head;
    while(temp.next!=null){
        temp=temp.next;
    }
    //we have reached th e point of the loop where we need to insert the next number
        Node last=new Node(num);
        temp.next=last;
        return head;
    }

    public static Node InsertAtPos(Node head,int pos,int value) {
        Node temp=head;
        for(int i=1;i<pos-1;i++){
            temp=temp.next;
        }
        Node a=new Node(value);
        a.next=temp.next;
        temp.next=a;
        return head;
    }
    public static void main(String[] args) {
        Node head = new Node(2);
        head.next = new Node(3);
        head.next.next = new Node(4);
        head.next.next.next = new Node(5);
        head=InsertAtBegin(head,1);


        head=InsertAtEnd(head,6);

        head=InsertAtPos(head,3,7);
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
}
