class MyThread implements Runnable{
	Thread t ;

	public MyThread(){
		t = new Thread();
	}

	public void run(){
		System.out.println(t.getName() + " - Hello India");
	}
}

public class FiveThreadsRunnable{
	public static void main(String[] args){
		for(int i=0; i<5; i++){
			Thread t = new Thread(new MyThread());
			t.start();
		}
	}
}