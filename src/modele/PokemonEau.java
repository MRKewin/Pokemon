package modele;

import utils.Constantes;

public class PokemonEau extends Pokemon{

	public PokemonEau(String name, int hp, int atk) {
		super(name, hp, atk);
	}
	
	@Override
	public void attack(Pokemon p) {
		switch (p.getClass().getSimpleName()) {
		case "PokemonPlante": 
		case "PokemonEau": 
			p.setHp(p.getHp() - Math.round(this.getAtk() * Constantes.DEGAT_PEU_EFFICACE));
			break;
		case "PokemonFeu": {
			p.setHp(p.getHp() - (this.getAtk() * Constantes.DEGAT_SUPER_EFFICACE));
			break;
		}
		default:
			super.attack(p);
		}
	}

}