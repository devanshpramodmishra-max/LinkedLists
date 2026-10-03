
public class RecursiveTraversal {
//we have made a class of node already in the project to remove the disputes of the node



//remember we need to make all the functions as the static ones because
// non satic function need an object to work with whereas the static can be called by name only
    //for non static head.iterate
public static void Iterate(Node head){
      //now we can iterate the head

      if(head==null){
          return;
      }
        System.out.println(head.data);
      Iterate(head.next);

    }
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        Iterate(head);

    }
}
