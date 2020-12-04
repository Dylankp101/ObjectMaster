package ObjectMaster;

public class HumanTest {
public static void main(String[] args) {
//	Characters
	Human dylan = new Human("Dylan");
	Wizard shaun = new Wizard("Shaun");
	Ninja sadie = new Ninja("Sadie");
	Samurai george = new Samurai("George");
	Samurai lezli = new Samurai("Lezli");
	Samurai darwin = new Samurai("Darwin");

//	Series of Events 
	dylan.statsHuman();
	dylan.attackHuman();
	shaun.fireBall(dylan);
	shaun.healHuman(dylan);	
	sadie.steal(dylan);
	sadie.runAway();
	george.deathBlow(dylan);
	george.meditate();
	darwin.howMany();
	
//	System.out.println("Health: " + dylan.attackHuman());
	

	}
}