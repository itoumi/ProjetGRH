package classes;

public class Candidat {
	private int id;
	private String name,departement;
	
	public Candidat(int id, String name, String departement) {
		super();
		this.id = id;
		this.name = name;
		this.departement = departement;
	}

	public Candidat() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartement() {
		return departement;
	}

	public void setDepartement(String departement) {
		this.departement = departement;
	}

	@Override
	public String toString() {
		return "Candidat [id=" + id + ", name=" + name + ", departement=" + departement + "]";
	}
	
}
