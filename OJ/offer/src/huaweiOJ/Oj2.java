package huaweiOJ;

import java.util.Scanner;

/*
 * �����ַ�����
����������31ʱ�����ƣ�1��ռ����ƣ�32768K
ͨ��������27.27%
��Ѽ�¼��0 ms|8460K ������  kd���ݶ���
 �㷨֪ʶ��Ƶ����
��Ŀ����
д��һ�����򣬽���һ������ĸ�������Լ��ո���ɵ��ַ�������һ���ַ���Ȼ����������ַ����к��и��ַ��ĸ����������ִ�Сд��
��������:
����һ������ĸ�������Լ��ո���ɵ��ַ�������һ���ַ���
�������:
��������ַ����к��и��ַ��ĸ�����
��������:
ABCDEF
A
�������:
1/
 */
public class Oj2 {
	public static void main(String [] args){
		Scanner scanner=new Scanner(System.in);
		
		while(scanner.hasNext()){
			String input = scanner.next();
			String ch = scanner.next();
            System.out.println(countCharNumber(input, ch));
		}
		scanner.close();
	}
	private static int countCharNumber(String input, String chStr) {

        char ch = 0;
        for (int i = 0; i < chStr.length(); i++) {
            if (chStr.charAt(i) != ' ') {
                ch = chStr.charAt(i);
                break;
            }
        }


        ch = toUppercase(ch);
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (toUppercase(input.charAt(i)) == ch) {
                count++;
            }
        }

        return count;
    }

    /**
     * ��Сд��ĸ��ɴ�д��ĸ
     *
     * @param ch �������ĸ
     * @return ����������Сд�ͱ�ɴ�д�����򲻱�
     */
    private static char toUppercase(char ch) {
        if (ch >= 'a' && ch <= 'z') {
            return (char) ('A' + (ch - 'a'));
        }

        return ch;
    }
}
