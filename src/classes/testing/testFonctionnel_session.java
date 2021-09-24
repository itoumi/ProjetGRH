package classes.testing;

import java.util.ArrayList;

import classes.Session;
import classes.listes.Sessions;

public class testFonctionnel_session {
	
	public static void main(String[] args) {
		
		String debut= "01/02/2020";
		String fin = "31/07/2020";
		String titre_formation = "Formation JAVA";
		String lieu = "Marseille";
		
		VerifClasses vc=new VerifClasses();
		
		// Vérification Classe d'équivalence mode
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		System.out.println("vérification du mode:");
		
		ArrayList<String> listMode = new ArrayList<String>();
		listMode.add("en ligne");
		listMode.add("sur place");
		listMode.add("présentiel");
		
		for (String mode: listMode) {
			if ((vc.VerifChaine(debut))&&(vc.VerifChaine(fin))&&(vc.VerifChaine(lieu))&&(vc.VerifChaine(titre_formation))&&(vc.VerifChaine(mode))) {
				if (vc.VerifSession(mode)) {
					Session sess = new Session(debut,fin,titre_formation,lieu,mode);
					Sessions.listeSessions.add(sess);
					Sessions.displayList();
					System.out.println("Session ajouté avec succès !");
					System.out.println("\n");
				}else {
					System.out.println("le champ mode est incorrecte !");
				}
			}else {
				System.out.println("l'un des paramétre est  vide!");
			}
		}
		
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		System.out.println("vérification d'un champ vide : ");
		// Véification avec un des paramètres String Chaine vide
		lieu = "";
		String mode = "en ligne";
		
		if (vc.VerifChaine(lieu)) {
			Session sess = new Session(debut,fin,titre_formation,lieu,mode);
			Sessions.listeSessions.add(sess);
			Sessions.displayList();
		} else
			System.out.println("Le champ est vide !!");
		

	}

}
