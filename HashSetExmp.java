import java.util.*;

public class HashSetExmp{
	public static void main(String[] args){
		HashSet<Integer> hash = new HashSet<>();
		Scanner in = new Scanner(System.in);

		while(true){
			String s = in.nextLine();
			try{
				Integer i = Integer.valueOf(s);
				hash.add(i);
			} catch(NumberFormatException e){
				// e.printStackTrace();
				break;
			}
		}

		System.out.println(hash.toString());
	}
}