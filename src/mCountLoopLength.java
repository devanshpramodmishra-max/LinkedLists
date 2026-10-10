public class mCountLoopLength {

        static int solve(Node root) {
            if(root == null || root.next == null) return -1;

            Node slow = root;
            Node fast = root;

            // Detect cycle
            while(fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;

                if(slow == fast) {
                    break;
                }
            }

            // No cycle
            if(fast == null || fast.next == null) return -1;

            // Find starting point of cycle
            slow = root;

            while(slow != fast) {
                slow = slow.next;
                fast = fast.next;
            }

            // Find length of cycle
            int ans = 1;
            Node temp = slow.next;

            while(temp != slow) {
                temp = temp.next;
                ans++;
            }

            return ans;
        }

}
