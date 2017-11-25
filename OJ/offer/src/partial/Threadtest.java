package partial;

public class Threadtest {
	public static void main(String [] args){
//		Mythread thread1=new Mythread();
//		thread1.run();
		for(int i=0;i<100;i++){
			System.out.println(Thread.currentThread().getName()+" "+ i);
			if(i==30){
				Thread myThread1= new Mythread();
				Thread myThread2= new Mythread();
				myThread1.start();
				myThread2.start();
			}
		}
	}
}
