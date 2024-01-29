class MergeLists{
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode mergedlist = new ListNode(0);
        ListNode ans = mergedlist;
        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                mergedlist.next = list1;
                list1 = list1.next;
            }else{
                mergedlist.next = list2;
                list2 = list2.next;
            }
            mergedlist = mergedlist.next;
        }
        while(list1 != null){
            mergedlist.next = list1;
            mergedlist = mergedlist.next;
            list1 = list1.next;
        }
        while(list2 != null){
            mergedlist.next = list2;
            mergedlist = mergedlist.next;
            list2 = list2.next;
        }
        return ans.next;
    }

}
