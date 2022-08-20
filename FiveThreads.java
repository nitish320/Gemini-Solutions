import java.util.*;

class MyThread extends Thread{
	@Override
	public void run(){
		System.out.println(getName() + " Hello All");
	}
}

class FiveThreads{

	public static void main(String[] args){
		for(int i=0; i<5; i++){
			Thread t = new MyThread();
			t.start();
		}
	}
}