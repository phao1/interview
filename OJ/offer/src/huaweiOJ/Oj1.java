package huaweiOJ;

import java.util.Scanner;

/*
 * 
计算字符串最后一个单词的长度，单词以空格隔开。
输入描述
一行字符串
输出描述
整数N，最后一个单词的长度。
输入例子
hello world
输出例子
5/
 */
//1.while 2. string.length();
public class Oj1 {
	public static void main (String [] args){
		Scanner scanner=new Scanner(System.in);
		while(scanner.hasNext()){
			String input = scanner.nextLine();
			System.out.println(findTheLastLength(input));
		}
		scanner.close();
	}
	
	public static int findTheLastLength(String input){
		int last=input.length()-1;
		int space_index=0;
		for(int i=last;i>0;i--){
			if(input.charAt(i)==' '){
				space_index=i;
				break;
			}
		}
		int length=last-space_index;
		return length;
	}
}
