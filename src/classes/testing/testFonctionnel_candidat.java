package classes.testing;

import classes.Candidat;
import classes.listes.Candidats;
import java.util.ArrayList;

public class testFonctionnel_candidat {

	public static void main(String[] args) {
		
		//int id = 01;
		String name = "Ichrak";
		String dpt = "Bouches du Rhône";
		
		VerifClasses vc=new VerifClasses();
		
		// Vérification Classe d'équivalence ID
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		System.out.println("vérification de l'ID:");
		
		ArrayList<String> listID = new ArrayList<String>();
		listID.add("0");
		listID.add("10");
		listID.add("-3");
		
		for (String id:listID) {
			System.out.println("id n° ="+id+" :");
			if((vc.VerifChaine(name))&&(vc.VerifChaine(dpt))&&(vc.VerifChaine(id))) {
				int idint = Integer.parseInt(id); 
				if (vc.VerifID(idint)) {
					Candidat cand = new Candidat(idint,name,dpt);
					Candidats.listeCandidats.add(cand);
					Candidats.displayList();
					System.out.println("Candidat ajouté avec succès !");
					System.out.println("\n");
				}else {
					System.out.println("l'id n'est pas valide !");
				}
			}
			else {
				System.out.println("l'un des paramétre est  vide!");
			}
		}
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		System.out.println("vérification d'un champ vide : ");
		// Véification avec un des paramètres String Chaine vide
		name = "";
		int id = 1;
		if (vc.VerifChaine(name)) {
			Candidat cand = new Candidat(id,name,dpt);
			Candidats.listeCandidats.add(cand);
			Candidats.displayList();
		} else
			System.out.println("Le champ est vide !!");
		
	}
}
