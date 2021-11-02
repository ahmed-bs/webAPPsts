package app.soaProject.entities;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;


@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="type",discriminatorType=DiscriminatorType.STRING)
public class transaction implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
    private Long idtrans;
	private Time heure;
	private Date day;
	private float montant;
	private String note;
	private String description;
	
	
	
	
	public Long getIdtrans() {
		return idtrans;
	}
	public void setIdtrans(Long idtrans) {
		this.idtrans = idtrans;
	}
	public Time getHeure() {
		return heure;
	}
	public void setHeure(Time heure) {
		this.heure = heure;
	}
	public Date getDay() {
		return day;
	}
	public void setDay(Date day) {
		this.day = day;
	}
	public float getMontant() {
		return montant;
	}
	public void setMontant(float montant) {
		this.montant = montant;
	}
	public transaction(Long idtrans, Time heure, Date day, float montant, String note, String description) {
		super();
		this.idtrans = idtrans;
		this.heure = heure;
		this.day = day;
		this.montant = montant;
		this.note = note;
		this.description = description;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
