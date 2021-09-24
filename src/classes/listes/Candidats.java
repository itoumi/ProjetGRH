package classes.listes;

import java.util.ArrayList;

import classes.*;

public class Candidats {
static ArrayList<Candidat> listeCandidats = new ArrayList<Candidat>();
	
	public void addList(Candidat cand1){
		listeCandidats.add(cand1);
	}
	
	public void displayList() {  		
		for (Candidat cd:listeCandidats) {
			System.out.println(cd.toString());
		}
	}
}
