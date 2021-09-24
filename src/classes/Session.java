package classes;

public class Session {
	private String debut, fin, lieu;
	private String titre_formation, mode;
	
	public Session(String debut, String fin, String lieu, String titre_formation, String mode) {
		super();
		this.debut = debut;
		this.fin = fin;
		this.lieu = lieu;
		this.titre_formation = titre_formation;
		this.mode = mode;
	}
	public Session() {
		super();
	}
	public String getDebut() {
		return debut;
	}
	public void setDebut(String debut) {
		this.debut = debut;
	}
	public String getFin() {
		return fin;
	}
	public void setFin(String fin) {
		this.fin = fin;
	}
	public String getLieu() {
		return lieu;
	}
	public void setLieu(String lieu) {
		this.lieu = lieu;
	}
	public String getTitre_formation() {
		return titre_formation;
	}
	public void setTitre_formation(String titre_formation) {
		this.titre_formation = titre_formation;
	}
	public String getMode() {
		return mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}
	@Override
	public String toString() {
		return "Session [debut=" + debut + ", fin=" + fin + ", lieu=" + lieu + ", titre_formation=" + titre_formation
				+ ", mode=" + mode + "]";
	} 
	
	
	
}
