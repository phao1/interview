/*
 * ��ʵ��һ����������һ���ַ����еĿո��滻�ɡ�%20�������磬���ַ���ΪWe Are Happy.�򾭹��滻֮����ַ���ΪWe%20Are%20Happy
 */
package offer1;

	public class Solution2 {
	    public String replaceSpace(StringBuffer str) {
	    	for(int i=0;i<str.length();i++){
	            if(str.charAt(i)==(' ')){
	                str.replace(i,i+1,"%20");
	            }
	        }
			return str.toString();
	    }
	}

/*
 * public class Solution {
    public String replaceSpace(StringBuffer str) {
        String sti = str.toString();
        char[] strChar = sti.toCharArray();
        StringBuffer stb = new StringBuffer();
        for(int i=0;i<strChar.length;i++){
            if(strChar[i]==' '){
                stb.append("%20");
            }else{
                stb.append(strChar[i]);
            }
        }
        return stb.toString();
    }
}
 * */
