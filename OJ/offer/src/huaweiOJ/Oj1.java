package huaweiOJ;

import java.util.Scanner;

/*
 * 
�����ַ������һ�����ʵĳ��ȣ������Կո������
��������
һ���ַ���
�������
����N�����һ�����ʵĳ��ȡ�
��������
hello world
�������
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
