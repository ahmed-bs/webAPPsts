package app.soaProject.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

@Entity
@DiscriminatorValue("employee")
public class employee extends utilisateur implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@OneToMany(mappedBy="employees", fetch = FetchType.LAZY)
	private List<transaction> transactions = new ArrayList<transaction>();
	
	public employee() {
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
	public employee(Long id, String nom, String prenom, String adresse, String telephone, String email, String username,
			String password, Collection<AppRole> role) {
		super(id, nom, prenom, adresse, telephone, email, username, password, role);
		// TODO Auto-generated constructor stub
	}

	

}
