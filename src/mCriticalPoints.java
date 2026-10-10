public class mCriticalPoints {
        static int solve(Node root){
            if(root==null||root.next==null||root.next.next==null)return 0;
            int prev=root.data;
            int criticalPoints=0;
            Node current=root.next;
            Node next=root.next.next;
            while(next!=null){
                if(current.data>prev&&current.data>next.data){
                    criticalPoints++;
                }
                if(current.data<prev&&current.data<next.data){
                    criticalPoints++;
                }
                prev=current.data;
                current=current.next;
                next=next.next;

            }
            return criticalPoints;
        }
}
