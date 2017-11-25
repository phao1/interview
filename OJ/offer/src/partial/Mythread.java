package partial;

public class Mythread extends Thread{
	private int i=0;
	public void run(){
		for(int i=0;i<100;i++){
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}
}

