package castPractice;

class main{

    public static void main(String[] args) {

	    Girl g1=new MMGirl(); //向上转型
	
	    g1.smile();
	
	    MMGirl mmg=(MMGirl)g1;    //向下转型,编译和运行皆不会出错
	
	    mmg.smile();
	
	    mmg.c();
	
	    Girl g2=new Girl();
	
		//MMGirl mmg1=(MMGirl)g2; //不安全的向下转型,编译无错但会运行会出错
		
		//mmg1.smile();
		
		//mmg1.c();
	
	    if(g2 instanceof MMGirl){
	
	             MMGirl mmg1=(MMGirl)g2;
	
	             mmg1.smile();
	
	             mmg1.c();
	
	    	}
    }
}