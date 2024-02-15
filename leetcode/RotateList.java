class RotateList{
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null){
            return head;
        }
        int size = 1;
        ListNode tail = head;
        while(tail.next!=null){
            tail= tail.next;
            size++; 
        }
        k = k%size;
        tail.next = head;
        for(int i=0;i<size-k;i++){
            tail = tail.next;
            head = head.next;
        }
        tail.next = null;
        return head;
    }
}
