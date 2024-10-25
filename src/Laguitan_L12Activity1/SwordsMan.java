package Laguitan_L12Activity1;

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

}
