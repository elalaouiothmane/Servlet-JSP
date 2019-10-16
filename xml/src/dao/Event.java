package dao;

import java.io.Serializable;
import javax.persistence.Entity;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Event implements Serializable {
	private Long idEvent;
	private Date dateDebut;
	private Date dateFin;
	private String lieuEvent;
	private String titreEvent;
	private String descreptionEvent;
	private User utilisateur;
	public Long getIdEvent() {
		return idEvent;
	}
	public void setIdEvent(Long idEvent) {
		this.idEvent = idEvent;
	}
	public Date getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}
	public Date getDateFin() {
		return dateFin;
	}
	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}
	public String getLieuEvent() {
		return lieuEvent;
	}
	public void setLieuEvent(String lieuEvent) {
		this.lieuEvent = lieuEvent;
	}
	public String getTitreEvent() {
		return titreEvent;
	}
	public void setTitreEvent(String titreEvent) {
		this.titreEvent = titreEvent;
	}
	public String getDescreptionEvent() {
		return descreptionEvent;
	}
	public void setDescreptionEvent(String descreptionEvent) {
		this.descreptionEvent = descreptionEvent;
	}
	public User getUtilisateur() {
		return utilisateur;
	}
	public void setUtilisateur(User utilisateur) {
		this.utilisateur = utilisateur;
	}
	public Event() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Event(Date dateDebut, Date dateFin, String lieuEvent, String titreEvent, String descreptionEvent) {
		super();
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.lieuEvent = lieuEvent;
		this.titreEvent = titreEvent;
		this.descreptionEvent = descreptionEvent;
	}


}
