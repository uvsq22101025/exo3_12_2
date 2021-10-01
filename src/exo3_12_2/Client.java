package exo3_12_2;

public class Client {
	
	public Client(String nom) {
		this.nom = nom;
	}
	
	
	/**
	 * Connecte le client au serveur. Si le client est déjà connecté, la connexion lui est refusée.
	 * @param serveur (Serveur) le serveur auquel le client se connecte.
	 * @return true si laconnexion s'est faite, false sinon.
	 */
	public boolean seConnecter(Serveur serveur) {
		if (serveur.connecter(this)) {
			System.out.println("Utilisateur " + this.nom + " connecté !");
			this.serveur = serveur;
			return true;
		}
		else {
			System.out.println("Utilisateur " + this.nom + " : déjà connecté...");
			return false;
		}	
	}
	
	
	/**
	 * Envoie un message aux autres utilisateurs.
	 * @param message(String) le message à envoyer.
	 */
	public void envoyer(String message) {
		if (serveur == null) {
			System.out.println("Veuillez vous connecter");
			return;
		}
		serveur.diffuser(this.nom + " : " + message);
	}
	
	
	/**
	 * Simule la transmission d'un message du serveur vers le client.
	 * @param message (String) le message à transmettre.
	 */
	public void recevoir(String message) {
		System.out.println(this.nom + " <- (" + message + ")");
	}
	
	private String nom;
	private Serveur serveur;
}
