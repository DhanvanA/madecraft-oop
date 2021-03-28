/**
 * 
 */
package exercises;

/**
 * @author Apoorva Dhanvanthri
 *
 */
public class Ocean {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SeaCreature seaCreature = new SeaCreature("Spongebob");
		
		seaCreature.eat();
		
		seaCreature.laugh();
		
		SeaCreature seaCreatureOne = new SeaCreature("Patrick");
		
		SeaCreature seaCreatureTwo = new SeaCreature("Squidward");
		
		seaCreatureOne.laugh();
		
		seaCreatureTwo.laugh();

	}

}
