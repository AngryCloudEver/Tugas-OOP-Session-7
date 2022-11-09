
class Heroes{
	int attack = 10;
	
	public void Status() {
		System.out.println("I Have Agility, Strength, and Intelegent");
	}
	
	public void messages() {
		System.out.println("Saya mempunyai senjata");
	}
}

class Tank extends Heroes{

	public Tank() {
		super();
	}
}

class Mage extends Heroes{
	int attack = 20;
	
	public void Attack() {
		System.out.println("Damage Mage: " + super.attack);
	}
	
	public void messages() {
		System.out.println("Saya mempunyai buku/tongkat");
	}
	
	public void displaySenjata() {
		messages();
		super.messages();
	}
}

public class Inheritance {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tank t = new Tank();
		t.Status();
		System.out.println("Damage: " + t.attack);
		
		Mage m = new Mage();
		m.Attack();
		m.displaySenjata();
	}

}
