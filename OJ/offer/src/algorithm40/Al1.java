package algorithm40;

public class Al1 {
	public static void main(String [] args){
		int i=0;
		for(i=1;i<=20;i++){
			System.out.print(num(i)+" ");
		}
	}
	public static int num(int i){
		if(i==1||i==2){
			return 1;
		}else{
			return num(i-1)+num(i-2);
		}
		
	}
}
