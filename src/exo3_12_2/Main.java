package exo3_12_2;

public class Main {

	public static void main(String[] args) {
		Serveur serveur = new Serveur();
		
		Client a = new Client("Alice");
		a.seConnecter(serveur);
		Client b = new Client("Bob");
		b.seConnecter(serveur);
		Client c = new Client("Charlie");

		// Scénario donné
		c.seConnecter(serveur);
		c.envoyer("Bonjour");
		
		// Test de reconnexion
		c.seConnecter(serveur);
		
		// Test d'envoi de message avec utilisateu non-connecté
		Client d = new Client("Daniel");
		d.envoyer("Hello");
	}

}
