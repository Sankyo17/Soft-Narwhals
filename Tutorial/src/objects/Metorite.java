package objects;

public class Metorite {
	private String[] powers = {"death","debt","hunger","explode","no power"};
	public Metorite() {}//end Metorite()
	public void mutate(Superhero s1) {
		int r = (int)(Math.random() * powers.length);
		String newPower = powers[r];
		s1.setPower(newPower);
		System.out.println(s1.toString());
	}//end mutate
}//end Metorite

