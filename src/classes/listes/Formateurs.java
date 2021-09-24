package classes.listes;

import java.util.ArrayList;

import classes.Formateur;

public class Formateurs {
	static ArrayList<Formateur> listeFormateurs = new ArrayList<Formateur>();
			
	public void addList(Formateur frm1){
		listeFormateurs.add(frm1);
	}
			
	public void displayList() {  		
		for (Formateur fm:listeFormateurs) {
			System.out.println(fm.toString());
		}
	}
}
