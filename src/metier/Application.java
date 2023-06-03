package metier;

import modele.Pokemon;
import modele.PokemonPlante;

public class Application {
    public static void main(String[] args) {
        Pokemon pikachu = new Pokemon("Pikachu", 20, 9);
        PokemonPlante bulbizar = new PokemonPlante("Bulbizar", 50, 10);
        
        // Combat entre Pikachu et Bulbizar
        while (!pikachu.isDead() && !bulbizar.isDead()) {
            pikachu.attack(bulbizar);
            System.out.println(bulbizar);
            
            if (!bulbizar.isDead()) {
                bulbizar.attack(pikachu);
                System.out.println(pikachu);
            }
        }
        
        // Vérification du vainqueur
        if (pikachu.isDead()) {
            System.out.println("Bulbizar a gagné !");
        } else {
            System.out.println("Pikachu a gagné !");
        }
    }
}