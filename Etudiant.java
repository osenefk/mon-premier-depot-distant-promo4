public class Etudiant{

//Proprietes

	private String nomEtudiant;
	private String prenomEtudiant;
	
	private String emailEtudiant;
	
	private String telEtudiant;
	
	//Constructeurs
	
	public Etudiant(){
		
	}
	
	public Etudiant(String nom, String prenom){
		
		this.nomEtudiant=nom;
		
		this.prenomEtudiant=prenom;
		
	}
	
	//Getters et setters
	
	public String getNomEtudiant(){
		
		return this.nomEtudiant;
	}
	
	public String getPrenomEtudiant(){
		
		return this.prenomEtudiant;
	}
	
	
	public void setNomEtudiant(String nom){
		this.nomEtudiant=nom;
	}
	
	public void setPrenomEtudiant(String prenom){
		this.prenomEtudiant=prenom;
	}
	