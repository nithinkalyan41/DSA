class AdddTwo{
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode(0);
            ListNode res = l3;
            int c = 0;
           while(l1!=null || l2!=null){
               int sum = 0;
               if(l1 !=null){
                   sum+= l1.val;
                   l1 = l1.next;
               }
               if(l2 != null){
                   sum+=l2.val;
                   l2 =l2.next;
               }
               sum+=c;
               c = sum/10;
               sum = sum%10;
               res.next = new ListNode(sum);
               res = res.next;
           }
        if(c == 1){
           res.next = new ListNode(1);
        }  
        

        return l3.next;   
    }
}

}
