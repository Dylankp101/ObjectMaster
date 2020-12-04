package ObjectMaster;

public class Ninja extends Human {
	public Ninja(String name) {
		super(name);
		this.stealth = 10;
	}
	public void steal(Human human) {
		human.health -= this.stealth;
		this.health += this.stealth;
		System.out.println("Ninjas used STEAL");
		System.out.println("Ninjas Heath: " + this.health);
		System.out.println("Humans Heath: " + human.health);
	}
	public void runAway() {
		this.health -= this.stealth;
		System.out.println("Ninjas used RUN");
		System.out.println("Ninjas Heath: " + this.health);

	}
}
