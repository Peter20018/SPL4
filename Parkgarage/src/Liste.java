import java.util.ArrayList;

public class Liste {

	public static void main(String[] args) {
		ArrayList<Integer> warteliste = new ArrayList<Integer>();
		warteliste.add(4);
		warteliste.add(4);
		warteliste.add(6);
		warteliste.add(2);
		System.out.println(warteliste);
		System.out.println(warteliste.size());
		
		warteliste.remove((Integer) 4);
		System.out.println(warteliste);
		
	}

}
