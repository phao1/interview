/*
 * 请实现一个函数，将一个字符串中的空格替换成“%20”。例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy
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
