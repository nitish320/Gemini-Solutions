import java.util.*;

public class StackExmp{
	public static void main(String[] args){
		System.out.println("Enter numbers : ");

		Stack<Integer> st = new Stack<>();
		Queue<Integer> removed = new LinkedList<>();
		Scanner in = new Scanner(System.in);

		for(int i=0; i<6; i++){
			st.push(in.nextInt());
		}
		System.out.println(st.toString());

		removed.add(st.pop());
		removed.add(st.pop());

		System.out.println(removed.toString());
		System.out.println(st.toString());

	}
}