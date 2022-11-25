package logic;

public class RafaNadal extends Thread {
public void run() {
	try {
		this.wait();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	while(true) {
		System.out.println("JAAAAAAAAA");
		Thread.yield();
		
	}
}
}
