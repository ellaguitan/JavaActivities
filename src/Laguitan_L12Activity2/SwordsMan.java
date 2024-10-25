package Laguitan_L12Activity2;

public class SwordsMan extends DnDCharacter {

	public SwordsMan(String characterName) {
		super(characterName, 100, 25);
	}
	
	@Override
	public void attack(DnDCharacter opponent) {
		opponent.receiveDamage(this.damage);
		System.out.println(this.characterName + " slashes " + opponent.characterName);
	}
	
	@Override
	public void receiveDamage(int damage) {
		int newHealth = this.health - damage;
		if (newHealth < 0) {
			newHealth = 0;
		}
		this.health = newHealth;
	}
	
	@Override
	public void restoreHealth(int restore) {
		this.health += restore;
		System.out.println(this.characterName + " health restored by " + restore);
	}

	@Override
	public void buffAbility(int buff) {
		this.damage += buff;
		System.out.println(this.characterName + " damage buffed by " + buff);
	}
}
