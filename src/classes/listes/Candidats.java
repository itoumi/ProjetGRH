package classes.listes;

import java.util.ArrayList;

import classes.Candidat;

public class Candidats {
public static ArrayList<Candidat> listeCandidats = new ArrayList<Candidat>();
	
	public static void addList(Candidat cand1){
		listeCandidats.add(cand1);
	}
	
	public static void displayList() {  		
		for (Candidat cd:listeCandidats) {
			System.out.println(cd.toString());
		}
	}
}
