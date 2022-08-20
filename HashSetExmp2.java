import java.util.*;

public class HashSetExmp2{
	public static void main(String[] args){
		HashSet<Integer> set = new HashSet<>();
		Scanner in = new Scanner(System.in);

		while(true){
			String s = in.nextLine();
			try{
				Integer i = Integer.valueOf(s);
				set.add(i);
			} catch(NumberFormatException e){
				// e.printStackTrace();
				break;
			}
		}

		System.out.println(set.toString());
	}
}