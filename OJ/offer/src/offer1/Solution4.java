package offer1;

public class Solution4 {
		public static void main(String[] args){
			int [] pre= new int []{1,2,4,3,7};
			int [] in = new int []{4,2,3,1,7};			
			TreeNode x=reConstructBinaryTree(pre,in);
			System.out.println("tree");
			print(x);
		
		}
		public static void print(TreeNode tree){
			
			if(tree!=null){
				print(tree.left);
				print(tree.right);
				System.out.print(tree.val);
				
			}
		}
	   public static TreeNode reConstructBinaryTree(int [] pre,int [] in) {
	       if(pre==null || in==null){
	           return null;
	       }
	       java.util.HashMap<Integer,Integer>map= new java.util.HashMap<Integer,Integer>();
			for(int i=0;i<in.length;i++){
	            map.put(in[i],i);
	        }
	       return preIn(pre,0,pre.length-1,in,0,in.length-1,map);
		}
	   public static TreeNode preIn(int[] p,int pi,int pj,int[] n, int ni, int nj, java.util.HashMap<Integer,Integer>map){
	        if(pi>pj){
	            return null;
	        }
	        TreeNode head=new TreeNode(p[pi]);
	        System.out.println("the value of head is " + p[pi]);
	        int index =map.get(p[pi]);
	        System.out.println("the index is " + index);
	        head.left=preIn(p,pi+1,pi+index-ni,n,ni,index-1,map);
	        head.right=preIn(p,pi+index-ni+1,pj,n,index+1,nj,map);
	        System.out.println(head.val);
	        return head;
	    }
	}
