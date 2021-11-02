package app.soaProject.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

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
	public category(Long idcat, String nomCat) {
		super();
		this.idcat = idcat;
		this.nomCat = nomCat;
	}

}
