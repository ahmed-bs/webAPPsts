package app.soaProject.metier;

import java.util.Collection;
import java.util.Optional;

import app.soaProject.entities.AppRole;
import app.soaProject.entities.utilisateur;


public interface IUserMetier {
	public utilisateur saveUtilisateur(utilisateur ut);
	public AppRole saveRole(AppRole role);
	utilisateur getUtilisateur(String username);
	void addRoleToUtilisateur(String username,String roleName);
	public Collection<utilisateur> consulterListUtilisateur();
	public Optional<utilisateur> findUtilisateurById(Long id);
	public utilisateur updateUtilisateur(Long id,utilisateur ut);
	public void deleteUtilisateur(Long id);
}
