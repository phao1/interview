package algorithm40;
//±‡–¥≥Ã–Ú«Ûn£° ”√µ›πÈ
public class Al3 {
	public static void main (String [] args){
		fac(10);
		System.out.println(fac(10));
	}
	public static int fac(int n){
		if(n<0){
			return 0;
		}else if(n==1){
			return 1;
		}else return n*fac(n-1);
	}
}
