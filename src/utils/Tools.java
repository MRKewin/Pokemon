package utils;

public class Tools {
	public static float calculerMoyenne(int[] tab) {
		if(tab.length == 0) {
			return 0;
		}
		
		int somme = 0;
		for(int i = 0; i <= tab.length -1; i++) {
			somme += tab[i];
		}
		return somme/tab.length;
	}
}