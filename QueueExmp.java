import java.util.*;

public class QueueExmp{
	public static void main(String[] args){
		System.out.println("Enter numbers : ");

		Queue<Integer> list = new LinkedList<>();
		Scanner in = new Scanner(System.in);

		for(int i=0; i<6; i++){
			list.add(in.nextInt());
		}

		System.out.println(list.toString());

		// remove 2
		System.out.println(list.poll());
		System.out.println(list.poll());

		// print rest
		System.out.println(list.toString());

	}
}