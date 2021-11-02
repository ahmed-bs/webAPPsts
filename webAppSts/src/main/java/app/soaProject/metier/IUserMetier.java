package app.soaProject.metier;

import java.util.Collection;
import java.util.Optional;

import app.soaProject.entities.utilisateur;


public interface IUserMetier {
	public utilisateur saveUtilisateur(utilisateur ut);
	public Collection<utilisateur> consulterListUtilisateur();
	public Optional<utilisateur> findUtilisateurById(Long id);
	public utilisateur updateUtilisateur(Long id,utilisateur ut);
	public void deleteUtilisateur(Long id);
}
