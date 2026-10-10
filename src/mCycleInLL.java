public class mCycleInLL {

        public static Node detectCycle(Node head){
            if(head==null||head.next==null)return null;
            Node slow=head;
            Node fast=head;
            slow=slow.next;
            fast=fast.next.next;
            while(slow!=null||fast!=null){

                if(slow==fast){
                    Node finalfast=fast;
                    break;
                }
                slow=slow.next;
                fast=fast.next.next;
            }
            slow=head;
            while(slow!=fast){
                slow=slow.next;
                fast=fast.next;
            }
            return slow;
        }
    }

