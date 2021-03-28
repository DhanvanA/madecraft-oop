package exercises;

public class Smurf {

	private String name;
	private static int papacounter = 0;
	private static int Smurfetcounter = 0;

	public static Smurf createSmurf(String name) {
		if(name == "Papa" && papacounter == 0) {
			System.out.println("Creating " + name + " Smurf");
			papacounter++;
			return new Smurf(name);
		}
		else if(name == "Smurfet" && Smurfetcounter == 0) {
			System.out.println("Creating " + name + " Smurf");
			Smurfetcounter++;
			return new Smurf(name);
		}
		else  if(name != "Papa" && name != "Smurfet") {
			System.out.println("Creating " + name + " Smurf");
			return new Smurf(name);
		}
	  return new Smurf(" ");
	}

	private Smurf(String name) {
		this.name = name;
	}

	public void printName() {
		System.out.println("My name is " + name + " Smurf.");
	}

	public void eat() {
		System.out.println(name + " Smurf is eating Smurfberries.");
	}

}
