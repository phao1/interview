package huaweiOJ;

import java.util.Scanner;

/*
 * 计算字符个数
参与人数：31时间限制：1秒空间限制：32768K
通过比例：27.27%
最佳记录：0 ms|8460K （来自  kd丹妮儿）
 算法知识视频讲解
题目描述
写出一个程序，接受一个有字母和数字以及空格组成的字符串，和一个字符，然后输出输入字符串中含有该字符的个数。不区分大小写。
输入描述:
输入一个有字母和数字以及空格组成的字符串，和一个字符。
输出描述:
输出输入字符串中含有该字符的个数。
输入例子:
ABCDEF
A
输出例子:
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
     * 将小写字母变成大写字母
     *
     * @param ch 输入的字母
     * @return 如果输入的是小写就变成大写，否则不变
     */
    private static char toUppercase(char ch) {
        if (ch >= 'a' && ch <= 'z') {
            return (char) ('A' + (ch - 'a'));
        }

        return ch;
    }
}
