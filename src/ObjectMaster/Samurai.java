package ObjectMaster;

public class Samurai extends Human {
	static Integer deathStrike = 10000;
	static Integer totalSamurai = 0;
	public Samurai(String name) {
		super(name);
		this.health = 200;
		this.totalSamurai += 1;
	}
	public void deathBlow(Human human) {
		human.health -= this.deathStrike;
		this.health = (this.health / 2);
		System.out.println("Samurai used DEATHBLOW");
		System.out.println("Human health: " + human.health);
		System.out.println("Ninja health: " + this.health);

	}
	public void meditate() {
		this.health = this.health + (this.health / 2);
		System.out.println("Samurai used MEDITATE");
		System.out.println("Ninja health: " + this.health);

	}
	public void howMany() {
		System.out.println("Total number of Samurai: " + totalSamurai);
	}
}
