package classes.listes;

import java.util.ArrayList;

import classes.Formation;

public class Formations {
	static ArrayList<Formation> listeFormations = new ArrayList<Formation>();
	
	public void addList(Formation frm1){
		listeFormations.add(frm1);
	}
			
	public void displayList() {  		
		for (Formation fm:listeFormations) {
			System.out.println(fm.toString());
		}
	}
}
