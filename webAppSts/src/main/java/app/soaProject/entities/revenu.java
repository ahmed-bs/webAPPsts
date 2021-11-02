package app.soaProject.entities;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("revenu")
public class revenu extends transaction implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public revenu(Long idtrans, Time heure, Date day, float montant, String note, String description) {
		super(idtrans, heure, day, montant, description);
		// TODO Auto-generated constructor stub
	}

}
