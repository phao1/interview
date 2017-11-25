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
//				System.out.println(Thread.currentThread().getName() + "窗口@销售："
//						+ tickets + "号票");
//				tickets--;
//			} else {
//				System.out.println("票已卖完。。。");
//				break;
//			}
			Object o = " string";
			synchronized(o){
				if(tickets >0){
					System.out.println(Thread.currentThread().getName() + "窗口@销售："
							+ tickets + "号票");
					tickets--;
				}else{
					System.out.println("票已卖完。。。" + tickets);
					break;
				}
			}
		}
	}
}

