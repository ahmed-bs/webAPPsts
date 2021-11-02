package app.soaProject.metier;

import java.util.Collection;
import java.util.Optional;
import org.springframework.data.domain.Page;

import app.soaProject.entities.utilisateur;


public interface IUserMetier {
	public utilisateur saveUtilisateur(utilisateur ut);
	public Collection<utilisateur> consulterListUtilisateur();
	public Optional<utilisateur> findUtilisateurById(Long id);
	public utilisateur updateUtilisateur(Long id,utilisateur ut);
	public void deleteUtilisateur(Long id);
	public Page <utilisateur> FindutilisateurByDesignation	(String designation, int page, int size);
}
