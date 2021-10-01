package exo3_12_2;

import java.util.ArrayList;
import java.util.List;

public class Serveur {
	
	/**
	 * Simule la connexion du client par le serveur.
	 * Ajoute le client à la liste des clients connectés si aucune connexion
	 * n'existe déjà. Dans lecas contraire, la connexion est rejetée.
	 * @param client (Client) le client qui souhaite se connecter.
	 * @return true si connexion acceptée, faux sinon.
	 */
	public boolean connecter(Client client) {
		if (!clients.contains(client)) {
			clients.add(client);
			return true;
		}
		return false;
	}
	
	
	/**
	 * Diffuse le message d'un client à tous les clients connectés.
	 * @param message (String) le message à diffuser.
	 */
	public void diffuser(String message) {
		for (Client c : clients)
			c.recevoir(message);
	}
	
	
	private List<Client> clients = new ArrayList<>();
}
