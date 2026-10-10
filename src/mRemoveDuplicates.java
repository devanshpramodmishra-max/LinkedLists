class mRemoveDuplicates {
    Node removeDuplicates(Node head) {
        // your code here
        if(head==null||head.next==null)return head;
        Node temp=head;
        //we have made the temporary head and now we need to solve the null
        while(temp.next!=null){
            if(temp.data==temp.next.data){
                temp.next=temp.next.next;
            }
            else{
                temp=temp.next;
            }

        }
        return head;
    }
};