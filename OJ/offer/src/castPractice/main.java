package castPractice;

class main{

    public static void main(String[] args) {

	    Girl g1=new MMGirl(); //����ת��
	
	    g1.smile();
	
	    MMGirl mmg=(MMGirl)g1;    //����ת��,��������нԲ������
	
	    mmg.smile();
	
	    mmg.c();
	
	    Girl g2=new Girl();
	
		//MMGirl mmg1=(MMGirl)g2; //����ȫ������ת��,�����޴������л����
		
		//mmg1.smile();
		
		//mmg1.c();
	
	    if(g2 instanceof MMGirl){
	
	             MMGirl mmg1=(MMGirl)g2;
	
	             mmg1.smile();
	
	             mmg1.c();
	
	    	}
    }
}