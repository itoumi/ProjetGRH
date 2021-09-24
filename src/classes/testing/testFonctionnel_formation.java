package classes.testing;

import java.util.ArrayList;

import classes.Formation;
import classes.listes.Formations;

public class testFonctionnel_formation {

	public static void main(String[] args) {
		
		String formateur= "Toumi";
		int prix = 120;
		int nb_heures = 32;
		
		VerifClasses vc=new VerifClasses();
		
		// Vérification Classe d'équivalence titre
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		System.out.println("vérification du titre:");
		
		ArrayList<String> listTitre = new ArrayList<String>();
		listTitre.add("JS");
		listTitre.add("ATO");
		listTitre.add("Java-JSP");
		
		for (String titre:listTitre) {
			if ((vc.VerifChaine(titre))&&(vc.VerifChaine(formateur))) {
				if(vc.VerifTitre(titre)&&(vc.VerifNbHeures(nb_heures))&&(vc.VerifPrix(prix))) {
					Formation formation = new Formation(titre, formateur, prix, nb_heures);
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
				
				ArrayList<Integer> listPrix = new ArrayList<Integer>();
				listPrix.add(0);
				listPrix.add(100);
				listPrix.add(250);
				
				String titre = "JAVA";
				
				for (int prix1:listPrix) {
					if ((vc.VerifChaine(titre))&&(vc.VerifChaine(formateur))) {
						if(vc.VerifTitre(titre)&&(vc.VerifNbHeures(nb_heures))&&(vc.VerifPrix(prix1))) {
							Formation formation = new Formation(titre, formateur, prix1, nb_heures);
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
				
				ArrayList<Integer> listNbH = new ArrayList<Integer>();
				listNbH.add(10);
				listNbH.add(11);
				listNbH.add(40);
				
				for (int nb_heures1:listNbH) {
					if ((vc.VerifChaine(titre))&&(vc.VerifChaine(formateur))) {
						if(vc.VerifTitre(titre)&&(vc.VerifNbHeures(nb_heures1))&&(vc.VerifPrix(prix))) {
							Formation formation = new Formation(titre, formateur, prix, nb_heures1);
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
