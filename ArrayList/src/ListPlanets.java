import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ListPlanets {
	
	public ListPlanets() throws IOException{
		
	 List<Planet> planets = new ArrayList<>();
	 planets.add(new Planet("Mercury", 57_910_000, 4_880)); 
	 planets.add(new Planet("Venus", 108_200_000, 12_103));
	 planets.add(new Planet("Mars", 227_940_000, 6_974));
	 planets.add(new Planet("Earth", 149_600_000, 12_756));
	 planets.add(new Planet("Jupiter", 778_330_000, 142_984)); 
	 planets.add(new Planet("Saturn",1_429_400_000, 120_536));
	 planets.add(new Planet("Uranus", 2_870_990_000L, 51_118)); 
	 planets.add(new Planet("Neptune", 4_504_000_000L, 49_532));	
		
	System.out.println("\n**Original List**");
	printPlanets(planets);
	writer(planets);
	
	
	System.out.println("\n**After Reverse**");
	Collections.reverse(planets);
	printPlanets(planets);
	writer(planets);
	
	System.out.println("\n**After Rotate**");
	Collections.rotate(planets,2);
	printPlanets(planets);
	writer(planets);
	
	System.out.println("\n**After Shuffle**");
	Collections.shuffle(planets);
	printPlanets(planets);
	writer(planets);
	
	}
	
	private void printPlanets(List<Planet> planets) throws IOException {
		for (int i = 0; i < planets.size(); i++) {
			System.out.println(planets.get(i).getName()
					);
					
		}
				
		}
	public static void writer (List<Planet> planets) throws IOException   {
		
		File dosya = new File("planet.txt");
		dosya.createNewFile();
		FileWriter fwriter = new FileWriter(dosya);
		fwriter.write(System.lineSeparator());
		for (int i = 0; i < planets.size(); i++) {
			fwriter.append(planets.get(i).getName()+" "  );
			
		}
		fwriter.close();
		
		
		
		
		
	}
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		new ListPlanets();
		
		
		}

	
}
