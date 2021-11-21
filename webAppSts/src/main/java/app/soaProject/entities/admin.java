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

	public admin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public admin(Long id, String nom, String prenom, String adresse, String telephone, String email,String username,String password) {
		super(id, nom, prenom, adresse, telephone, email , username,password);
		// TODO Auto-generated constructor stub
	}

}
