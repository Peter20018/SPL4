
public class ParkgarageLevel1 {

	public static void main(String[] args) {
		
		int n = 2;
		int autos = 4;
		
		String parken = "1 2 -1 3 4 -3 -4 -2";
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

