package classes.listes;

import java.util.ArrayList;

import classes.Formation;

public class Formations {
	public static ArrayList<Formation> listeFormations = new ArrayList<Formation>();
	
	public static void addList(Formation frm1){
		listeFormations.add(frm1);
	}
			
	public static void displayList() {  		
		for (Formation fm:listeFormations) {
			System.out.println(fm.toString());
		}
	}
}
