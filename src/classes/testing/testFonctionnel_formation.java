package classes.testing;

import java.util.ArrayList;

import classes.Formation;
import classes.listes.Formations;

public class testFonctionnel_formation {

	public static void main(String[] args) {
		
		String formateur= "Toumi";
		String prix = "120";
		String nb_heures = "32";
		
		VerifClasses vc=new VerifClasses();
		
		// Vérification Classe d'équivalence titre
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		System.out.println("vérification du titre:");
		
		ArrayList<String> listTitre = new ArrayList<String>();
		listTitre.add("JS");
		listTitre.add("ATO");
		listTitre.add("Java-JSP");
		
		for (String titre:listTitre) {
			if ((vc.VerifChaine(titre))&&(vc.VerifChaine(formateur))&&(vc.VerifChaine(prix))&&(vc.VerifChaine(nb_heures))) {
				int nbHint = Integer.parseInt(nb_heures);
				int prix_int = Integer.parseInt(prix);
				if(vc.VerifTitre(titre)&&(vc.VerifNbHeures(nbHint))&&(vc.VerifPrix(prix_int))) {
					Formation formation = new Formation(titre, formateur, prix_int, nbHint);
					Formations.listeFormations.add(formation);
					Formations.displayList();
					System.out.println("\n");
				}else {
					System.out.println(" un des paramètres entrés n'est pas valide !\n");
				}
				
			}else {
				System.out.println("l'un des paramétre est  vide!\n");
			}
		}
		
		// Vérification Classe d'équivalence prix
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		System.out.println("vérification du prix:");
				
		ArrayList<String> listPrix = new ArrayList<String>();
		listPrix.add("0");
		listPrix.add("100");
		listPrix.add("250");
				
		String titre = "JAVA";
				
		for (String prix1:listPrix) {
			if ((vc.VerifChaine(titre))&&(vc.VerifChaine(formateur))&&(vc.VerifChaine(prix))&&(vc.VerifChaine(nb_heures))) {
				int nbint1 = Integer.parseInt(nb_heures);
				int prix_int1 = Integer.parseInt(prix1);
				if(vc.VerifTitre(titre)&&(vc.VerifNbHeures(nbint1))&&(vc.VerifPrix(prix_int1))) {
					Formation formation = new Formation(titre, formateur, prix_int1, nbint1);
					Formations.listeFormations.add(formation);
					Formations.displayList();
					System.out.println("\n");
				}else {
					System.out.println(" un des paramètres entrés n'est pas valide !\n");
				}
						
			}else {
				System.out.println("l'un des paramétre est  vide!\n");
			}
		}
				
		// Vérification Classe d'équivalence nb Heures
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		System.out.println("vérification du nb Heures:");
				
		ArrayList<String> listNbH = new ArrayList<String>();
		listNbH.add("10");
		listNbH.add("11");
		listNbH.add("40");
				
		for (String nbh:listNbH) {
			if ((vc.VerifChaine(titre))&&(vc.VerifChaine(formateur))&&(vc.VerifChaine(prix))&&(vc.VerifChaine(nbh))) {
				int nbh_int = Integer.parseInt(nbh);
				int prix_int = Integer.parseInt(prix);
				if(vc.VerifTitre(titre)&&(vc.VerifNbHeures(nbh_int))&&(vc.VerifPrix(prix_int))) {
					Formation formation = new Formation(titre, formateur, prix_int, nbh_int);
					Formations.listeFormations.add(formation);
					Formations.displayList();
					System.out.println("\n");
				}else {
					System.out.println(" un des paramètres entrés n'est pas valide !\n");
				}
						
			}else {
				System.out.println("l'un des paramétre est  vide!\n");
			}
		}
	}

}
