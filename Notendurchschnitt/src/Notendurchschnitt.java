
public class Notendurchschnitt {

	public static void main(String[] args) {
		
		int[] Noten = {1,1,3,2,4,5,5,4,4,3,2,2,1,1,3,2,4,5,4,3,2,1,4,4,3,2,1,1,5,3};
		int b = 0;
		int a  = 0;
		
		
		System.out.println("Der Notendurschnitt beträgt " + AnzahlNote(Noten));
	}
	
	public static double AnzahlNote(int [] Noten) 
	{
		int a = 0;
		double b = 0;
		
		for(int i = 0; i < Noten.length; i++) 
		{
			a = a + Noten[i];
			b = a / (double)Noten.length;
			System.out.println("Die Note an der " + i + ". Stelle " + Noten[i]);
		}
		return b;
	}
}
