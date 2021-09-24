package classes.listes;

import java.util.ArrayList;

import classes.Session;

public class Sessions {
	static ArrayList<Session> listeSessions = new ArrayList<Session>();
	
	public void addList(Session sess1){
		listeSessions.add(sess1);
	}
			
	public void displayList() {  		
		for (Session s:listeSessions) {
			System.out.println(s.toString());
		}
	}
}
