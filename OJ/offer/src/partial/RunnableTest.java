package partial;

public class RunnableTest {
	public static void main (String [] args){
		for(int i=0;i<10;i++){
			System.out.println(Thread.currentThread().getName()+" "+i);
			Runnable myRunnable = new MyRunnable();
			if(i==3){
				
				Thread thread1 = new Thread(myRunnable);
				Thread thread2 = new Thread(myRunnable);
				thread1.setPriority(1);
				thread2.setPriority(10);;
				thread1.start();
				thread2.start();
			}
			
		
		}
		
	}
}
