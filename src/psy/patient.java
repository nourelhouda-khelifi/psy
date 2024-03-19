package psy;
import java.util.Date;
public class patient {
	private int id,statue;
	private String nom,prenom,email,ville,phone;
	private Date d;
	public patient(int id, int statue, String nom, String prenom, String email, String ville, String phone, Date d) {
		super();
		this.id = id;
		this.statue = statue;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.ville = ville;
		this.phone = phone;
		this.d = d;
	}
	
	public int getStatue() {
		return statue;
	}
	
	public void setStatue(int statue) {
		this.statue = statue;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Date getD() {
		return d;
	}
	public void setD(Date d) {
		this.d = d;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "patient [id=" + id + ", statue=" + statue + ", nom=" + nom + ", prenom=" + prenom + ", email=" + email
				+ ", ville=" + ville + ", phone=" + phone + ", d=" + d + "]";
	}

}
