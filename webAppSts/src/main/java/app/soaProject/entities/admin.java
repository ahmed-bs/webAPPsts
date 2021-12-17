package app.soaProject.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("admin")
public class admin extends utilisateur implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public admin() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param nom
	 * @param prenom
	 * @param adresse
	 * @param telephone
	 * @param email
	 * @param username
	 * @param password
	 * @param role
	 */
	public admin(Long id, String nom, String prenom, String adresse, String telephone, String email, String username,
			String password, Collection<AppRole> role) {
		super(id, nom, prenom, adresse, telephone, email, username, password, role);
		// TODO Auto-generated constructor stub
	}

	
}
