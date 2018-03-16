public class Employe{

//Proprietes

	private String nomEmploye;
	private String prenomEmploye;
	
	//Constructeurs
	
	public Employe(){
		
	}
	
	public Employe(String nom, String prenom){
		
		this.nomEmploye=nom;
		
		this.prenomEmploye=prenom;
		
	}
	
	public Employe(String nom){
		
		this.nomEmploye=nom;
		
	}
	
	
	
	//Getters et setters
	
	public String getNomEmploye(){
		
		return this.nomEmpoye;
	}
	
	public String getPrenomEmploye(){
		
		return this.prenomEmpoye;
	}
	
	
	public void setNomEmploye(String nom){
		this.nomEmploye=nom;
	}
	
	public void setPrenomEmploye(String prenom){
		this.prenomEmploye=prenom;
	}
	
	
	
	
	
}