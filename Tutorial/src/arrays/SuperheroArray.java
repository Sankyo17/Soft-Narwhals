package arrays;

public class SuperheroArray {

	public static void main(String[] args) {
		
		String[] superhero = {"IronMan" , "SuperMan" , "Thor" , "Hulk" , "WonderWoman"}; //array with superhero names
		System.out.println(superhero [0]); //prints superhero in the 0 index
		System.out.println(superhero[superhero.length -1]); //prints the superhero in the last index
		for (int i = 0; i < superhero.length; i++) { //prints all superhero names
			System.out.println(superhero[i]);
		}
		String[] superpowers = {"Money" , "Fly" , "Hammer" , "Strong" , "Sheild"}; //array with all superpowers
		boolean[] isHuman = { true , false , false , true , false }; //array for if the superhero is a human
		for (int i = 0; i < superhero.length; i++) { //prints table with name, power, and isHuman
			System.out.println("Name: "  + superhero [i] + "\n Power: " + superpowers[i] + "\n Human: " + isHuman[i] );
		}
		for (int i = 0; i < superhero.length; i++) { //prints same table with index number before the name
			System.out.println(i + " Name: "  + superhero [i] + "\n Power: " + superpowers[i] + "\n Human: " + isHuman[i] );
		}
		superpowers[0] = "NONE"; //set superhero in index 0 to NONE
		superpowers[3] = "NONE"; //set superhero in index 3 to NONE
		for (int i = 0; i < superpowers.length; i++) { //for loop to set superpowers to NONE if they are not human
			if (isHuman[i] == false) {
				superpowers[i] = "NONE";
			}
		}
		for (int i = 0; i < superhero.length; i++) { //prints final table 
			System.out.println(i + " Name: "  + superhero [i] + "\n Power: " + superpowers[i] + "\n Human: " + isHuman[i] );
		}
		
	}

}
