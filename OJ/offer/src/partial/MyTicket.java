package partial;
// synchronize
class MyTicket implements Runnable {
	int tickets = 100;
	public void run() {
		while (true) {
//			if (tickets > 0) {
//				try {
//					Thread.sleep(100);
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
//				System.out.println(Thread.currentThread().getName() + "����@���ۣ�"
//						+ tickets + "��Ʊ");
//				tickets--;
//			} else {
//				System.out.println("Ʊ�����ꡣ����");
//				break;
//			}
			Object o = " string";
			synchronized(o){
				if(tickets >0){
					System.out.println(Thread.currentThread().getName() + "����@���ۣ�"
							+ tickets + "��Ʊ");
					tickets--;
				}else{
					System.out.println("Ʊ�����ꡣ����" + tickets);
					break;
				}
			}
		}
	}
}

