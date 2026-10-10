public class mSwapInPairs {

    public static Node swap(Node head) {

        if (head == null || head.next == null) {
            return head;
        }

        Node current = head;
        Node next = head.next;

        Node ans = next;
        Node temptail = null;

        while (current != null && current.next != null) {

            next = current.next;

            // swap current and next
            current.next = next.next;
            next.next = current;

            // connect previous pair to current pair
            if (temptail != null) {
                temptail.next = next;
            }

            temptail = current;
            current = current.next;
        }

        return ans;
    }

    public static void main(String[] args) {

        Node head = ExampleLL.LL();

        head = swap(head);

        Node temp = head;

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}

