class RemoveNthNode{
	 public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode res = new ListNode(0);
        res.next = head;
        ListNode p1 = res;
        ListNode p2 = res;
        int i=0;
        while(i<n+1){
            p1 = p1.next;
            i++;
        }
        while(p1 != null){
            p1 = p1.next;
            p2 = p2.next;
        }
       p2.next = p2.next.next;
    
        return res.next;
    }

}
