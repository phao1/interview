package offer1;
//输入一个链表，从尾到头打印链表每个节点的值。

//    public class ListNode {
//        int val;
//        ListNode next = null;
//
//        ListNode(int val) {
//            this.val = val;
//        }
//    }


import java.util.ArrayList;
public class Solution3 {
	ArrayList<Integer> arraylist=new ArrayList<Integer>();
	public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
    	if(listNode!=null){
    		this.printListFromTailToHead(listNode.next);
    		arraylist.add(listNode.val);
    		
    	}
    	return arraylist;
    	
        
    }
}
