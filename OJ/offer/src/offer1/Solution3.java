package offer1;
//����һ��������β��ͷ��ӡ����ÿ���ڵ��ֵ��

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
