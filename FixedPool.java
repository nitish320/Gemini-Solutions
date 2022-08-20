import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

class Numbers extends Thread{
	int n;

	public Numbers(int n){
		this.n = n;
	}

	public void run(){
		System.out.println(getName()  + " - " + n);
		do_sth();
	}

	public void do_sth(){
		try{
			sleep(2000);
		} catch(InterruptedException e){
			e.printStackTrace();
		}
	}
}


public class FixedPool{
	public static void main(String[] args){
		ExecutorService service = Executors.newFixedThreadPool(5);


		for(int i=1; i<11; i++)
			service.execute(new Numbers(i));

	}
}