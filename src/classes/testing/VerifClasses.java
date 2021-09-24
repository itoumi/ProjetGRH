package classes.testing;

public class VerifClasses {
	
	//Vérification de la chaine si elle est vide
	public boolean VerifChaine(String text) {
		return !text.isEmpty();
	}
	
	// Vérification de la contrainte :  id >0
	public boolean VerifID (int id) {
		return id>0;
	}
	
	// Vérification de la contrainte :  nombre d'heures >10
	public boolean VerifNbHeures(int nb_heures) {
		return nb_heures>10;
	}
	
	// Vérification de la contrainte :  prix >100
	public boolean VerifPrix (int prix) {
		return prix>100;
	}
	
	// Vérification de la contrainte :  longueur titre >=3
	public boolean VerifTitre(String titre) {
		return titre.length()>=3;
	}
	
	// Vérification de la contrainte sur le mode session : présentiel ou en ligne
	public boolean VerifSession(String textMode) { 
		return ((textMode.equals("en ligne"))||(textMode.equals("présentiel")));
	}
	
	// Vérification de la contrainte sur le grade: junior, senior ou expert
	public boolean VerifGrade(String textGrade) { 
		return ((textGrade.equals("junior"))||(textGrade.equals("senior"))||(textGrade.equals("expert")));
	}
}
