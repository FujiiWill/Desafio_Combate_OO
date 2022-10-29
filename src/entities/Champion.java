package entities;

public class Champion {

	private String name;
	private int life;
	private int attack;
	private int armour;
	
	public Champion(String name, int life, int attack, int armour) {
		this.name = name;
		this.life = life;
		this.attack = attack;
		this.armour = armour;
	}

	public String getName() {
		return name;
	}

	public int getLife() {
		return life;
	}
	
	public int getAttack() {
		return attack;
	}

	public int getArmour() {
		return armour;
	}

	public void takeDamage (Champion other) {
		int damage = other.attack - this.armour;
		if(damage < 0) {	
			damage = 1;
		}
		this.life = this.life - damage;
	}
	
	public String status() {
		if(life <= 0) {
			life = 0;
			return name 
				+ ": " 
				+ life 
				+ " de vida (morreu)";				
			}
		else {
			return name 
				+ ": "
				+ life
				+ " de vida";
		}
	}
}