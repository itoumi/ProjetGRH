package classes.listes;

import java.util.ArrayList;

import classes.Formateur;

public class Formateurs {
	public static ArrayList<Formateur> listeFormateurs = new ArrayList<Formateur>();
			
	public static void addList(Formateur frm1){
		listeFormateurs.add(frm1);
	}
			
	public static void displayList() {  		
		for (Formateur fm:listeFormateurs) {
			System.out.println(fm.toString());
		}
	}
}
