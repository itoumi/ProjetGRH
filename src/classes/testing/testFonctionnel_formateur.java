package classes.testing;

import java.util.ArrayList;

import classes.Formateur;
import classes.listes.Formateurs;

public class testFonctionnel_formateur {

	public static void main(String[] args) {
		
		String nom= "Toumi";
		String prenom = "Ichrak";
		String specialite = "Test";
		
		VerifClasses vc=new VerifClasses();
		
		// Vérification Classe d'équivalence Grade
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		System.out.println("vérification du grade:");
		
		ArrayList<String> listGrade = new ArrayList<String>();
		listGrade.add("expert");
		listGrade.add("moyen");
		listGrade.add("senior");
		
		for (String grade: listGrade) {
			if ((vc.VerifChaine(nom))&&(vc.VerifChaine(prenom))&&(vc.VerifChaine(specialite))&&(vc.VerifChaine(grade))) {
				if (vc.VerifGrade(grade)) {
					Formateur frm = new Formateur(nom,prenom,specialite, grade);
					Formateurs.listeFormateurs.add(frm);
					Formateurs.displayList();
					System.out.println("Formateur ajouté avec succès !");
					System.out.println("\n");
				}else {
					System.out.println("le champ grade est incorrecte !");
				}
			}else {
				System.out.println("l'un des paramétre est  vide!");
			}
		}
		
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		System.out.println("vérification d'un champ vide : ");
		// Véification avec un des paramètres String Chaine vide
		specialite = "";
		String grade = "junior";
		
		if (vc.VerifChaine(specialite)) {
			Formateur frm = new Formateur(nom,prenom,specialite,grade);
			Formateurs.listeFormateurs.add(frm);
			Formateurs.displayList();
		} else
			System.out.println("Le champ est vide !!");
		

	}

}
