package objects;

public class Superhero {
	private String Power;
	private String Name;
	private int health;
	private int damage;
	public Superhero() {
		Power = "Fly";
		Name = "Superman";
		health = 500;
		damage = 75;
	}//end Superhero
	public Superhero(String Power , String Name , int health , int damage) {
		this.Power = Power;
		this.Name = Name;
		this.health = health;
		this.damage = damage;
	}//end Superhero(String Power , String Name)
	public void setPower(String power) {
		this.Power = power;
	}//end SetPower
	public int getHealth() {
		return health;
	}//end getHealth	
	public int getDamage() {
		return damage;
	}//end getDamage
	public void setHealth(int health) {
		this.health = health;
	}//end setHealth
	public void fight(Superhero s2) {
		s2.setHealth(s2.getHealth() - this.damage);
	}//end fight
	public String toString() {
		return "Name: " + Name + " Power: " + Power;
	}//end toString
}//end Superhero
