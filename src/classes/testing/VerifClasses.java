package classes.testing;

public class VerifClasses {
	
	public boolean VerifID (int id) {
		return id>0;
	}
	
	public boolean VerifNbHeures(int nb_heures) {
		return nb_heures>10;
	}
	
	public boolean VerifPrix (int prix) {
		return prix>100;
	}
	
	public boolean VerifTitre(String titre) {
		return titre.length()>=3;
	}
	
	public boolean VerifChaine(String text) {
		return !text.isEmpty();
	}
	
	public boolean VerifSession(String textMode) { 
		return ((textMode.equals("en ligne"))||(textMode.equals("présentiel")));
	}
	
	public boolean VerifGrade(String textGrade) { 
		return ((textGrade.equals("junior"))||(textGrade.equals("senior"))||(textGrade.equals("expert")));
	}
}
