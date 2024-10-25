package Laguitan_L12Activity2;

public abstract class DnDCharacter implements Abilities {
	public String characterName;
	public int health;
	public int damage;
	
	public DnDCharacter (String characterName, int health, int damage) {
		this.characterName = characterName;
		this.health = health;
		this.damage = damage;
	}

	public String getCharacterName() {
		return characterName;
	}

	public void setCharacterName(String characterName) {
		this.characterName = characterName;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public String toString(String characterType) {
		return "\n" + characterType + "'s Profile:" + 
				"\nName: " + this.characterName + 
				"\tHealth: " + this.health +
				"\tDamage: " + this.damage;
	}
	
	public boolean isAlive() {
		if (this.health > 0) {
			return true;
		}
		
		return false;
	}
	
	public abstract void attack(DnDCharacter opponent);
	public abstract void receiveDamage(int damage);
}
