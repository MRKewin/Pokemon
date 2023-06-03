package modele;

public class Pokemon {
	// attributs (toutes les propriétés d'une classe sont en private par convention
	private String name;
	private int hp;
	private int atk;
	
	// constructeur
	public Pokemon(String name, int hp, int atk) {
		 this.name = name;
		 this.hp = hp;
		 this.atk = atk;
	}
	
	// getter du nom
	public String getName() {
		return this.name;
	}
	
	// getter de la vie
	public int getHp() {
		return this.hp;
	}
	
	//getter de la force
	public int getAtk() {
		return this.atk;
	}
	
	// setter pour modifier la vie (hp) du pokemon
	public void setHp(int hp) {
		this.hp = hp;
	}
	
	public boolean isDead() {
		return this.hp == 0;
	}
	
	// target ici represente le pokemon ennemi
	public void attack(Pokemon target) {
		target.setHp(target.getHp() - this.atk);
	}
	
	@Override
	public String toString() {
		return "Pokemon : " + this.name + ", point de vie : " + this.hp + ". Force : " + this.atk;
	}
	
}