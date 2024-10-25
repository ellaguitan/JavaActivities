package Laguitan_L12Activity1;

public class Catalyst extends DnDCharacter{

	public Catalyst(String characterName) {
		super(characterName, 100, 15);
	}
	
	@Override
	public void attack(DnDCharacter opponent) {
		opponent.receiveDamage(this.damage);
		System.out.println(this.characterName + " tightly binded " + opponent.characterName);
	}
	
	@Override
	public void receiveDamage(int damage) {
		int newHealth = this.health - damage;
		if (newHealth < 0) {
			newHealth = 0;
		}
		this.health = newHealth;
	}

}
