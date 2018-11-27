package objects;

public class TestSuperhero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Superhero s1 = new Superhero();
		Superhero s2= new Superhero("Hammer" , "Kim" , 500 , 70);
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println();
		
		Metorite m = new Metorite();
		m.mutate(s1);
		m.mutate(s2);
		
		while(s1.getHealth() >= 0) {
		s2.fight(s1);
		System.out.println("s1 health: " + s1.getHealth());
		}
	}//end main
}//and TestSuperhero
