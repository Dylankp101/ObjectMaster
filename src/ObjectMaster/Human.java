package ObjectMaster;

public class Human {
	public String name;
	public Integer strength = 3;
	public Integer stealth = 3;
	public Integer intelligence = 3;
	public Integer health = 100;
	public Human(String name) {
		this.name = name;
	}
	public void statsHuman() {
		System.out.println("Human Skill Ratings");
		System.out.println("Strength Rating: " + strength +" Stealth Rating: " + stealth +" Intelligence Rating: " + intelligence + " Heath: "+ health);
		System.out.println(" ");

	}
	public void attackHuman() {
		this.health -= this.strength;
		System.out.println("Human was ATTACKED");
	}
}

