package app.soaProject.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class category implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
    private Long idcat;	
	private String nomCat;
	
	
	@OneToMany(mappedBy="categories", fetch = FetchType.LAZY)
	private List<transaction> transactions = new ArrayList<transaction>();
	
	public category(Long idcat, String nomCat) {
		super();
		this.idcat = idcat;
		this.nomCat = nomCat;
	}
	public category() {
		super();
	}



	public Long getIdcat() {
		return idcat;
	}
	public void setIdcat(Long idcat) {
		this.idcat = idcat;
	}
	public String getNomCat() {
		return nomCat;
	}
	public void setNomCat(String nomCat) {
		this.nomCat = nomCat;
	}


}
