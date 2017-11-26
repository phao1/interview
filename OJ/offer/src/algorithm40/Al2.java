package algorithm40;
//最大公约数 最小公倍数
public class Al2 {
	public static void main (String [] args){
		commonDivisor(12,244);
		
	}
	public static int commonDivisor(int x, int y){
		if(x<0||y<0){
			return -1;
		}
		if(x<y){
			int z;
			z=x;
			x=y;
			y=z;
		}
		if(y==0){
			System.out.println("the biggest common divisor is "+x);
			return x;
		}else{
			return commonDivisor(y,x%y);
		}
	}
}
