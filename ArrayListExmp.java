import java.util.*;

public class ArrayListExmp{
	public static void main(String[] args){
		ArrayList<Integer> arr = new ArrayList<>();
		Scanner in = new Scanner(System.in);

		while(true){
			String s = in.nextLine();
			try{
				Integer i = Integer.valueOf(s);
				arr.add(i);
			} catch(NumberFormatException e){
				// e.printStackTrace();
				break;
			}
		}

		System.out.println(arr.toString());
	}
}