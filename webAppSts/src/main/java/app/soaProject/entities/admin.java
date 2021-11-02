package app.soaProject.entities;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("admin")
public class admin extends utilisateur implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public admin(Long id, String nom, String prenom, String adresse, String telephone, String email) {
		super(id, nom, prenom, adresse, telephone, email);
		// TODO Auto-generated constructor stub
	}

}
