
public class Planet {
	
	private  String name;
	private  long orbit;
	private  int diameter;
	

	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public long getOrbit() {
		return orbit;
	}


	public void setOrbit(long orbit) {
		this.orbit = orbit;
	}


	public int getDiameter() {
		return diameter;
	}


	public void setDiameter(int diameter) {
		this.diameter = diameter;
	}


	public Planet(String name, long orbit, int diameter) {
		super();
		this.name = name;
		this.orbit = orbit;
		this.diameter = diameter;
	}
	

}
