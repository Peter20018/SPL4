
public class ParkgarageLevel1 {

	public static void main(String[] args) {
		
		int n = 100;
		int autos = 20;
		
		String parken = "19 -19 11 -11 1 -1 17 -17 10 7 -10 -7 3 14 -14 -3 13 -13 4 12 20 18 6 16 -18 -12 -16 5 -5 -20 -6 -4 8 15 -8 2 -15 9 -2 -9";
		String[] parkvorgaenge = parken.split(" ");
		
		int autosInGarage = 0; 
		int maxAutos = 0;
		
		
		for(int i = 0; i < parkvorgaenge.length; i++) 
		{
			int parker = Integer.parseInt(parkvorgaenge[i]);	
			if(parker > 0) 
			{
				autosInGarage++;
			}
			else if(parker < 0) 
			{
				autosInGarage--;
			}
			else 
			{
				System.out.println("Irgendetwas hat nicht funktioniert. ");
			}
			if(maxAutos < autosInGarage) {
				maxAutos = autosInGarage;
			}
			System.out.println("So viele Autos sind zurzeit in der Garage " + autosInGarage);
		}
		System.out.println("Maximale Anzahl an Autos: " + maxAutos);
		}
	}

