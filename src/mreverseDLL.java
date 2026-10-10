public class mreverseDLL {
    public static NodeDLL reverseLL(NodeDLL head) {
        if (head == null) return head;

        NodeDLL current = head;
        NodeDLL newHead = null;

        while (current != null) {
            NodeDLL temp = current.next;

            current.next = current.prev;
            current.prev = temp;

            newHead = current;
            current = temp;
        }

        return newHead;
    }
}
