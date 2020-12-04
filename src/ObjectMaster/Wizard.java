package ObjectMaster;

public class Wizard extends Human {
	static Integer power = 40;
	public Wizard(String name) {
		super(name);
		this.health = 50;
		this.intelligence = 8;
	}
	public void healHuman(Human human) {
		human.health += this.intelligence;
		System.out.println("Wizard used HEAL");
		System.out.println("Human health: " + human.health);
	}
	public void fireBall(Human human) {
		human.health -= this.power;
		System.out.println("Wizard used FIREBALL");	
		System.out.println("Human health: " + human.health);
	}
}
