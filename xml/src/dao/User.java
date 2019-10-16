package dao;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class User implements Serializable {
	private Long idUser;
	private String emailUser;
	private String ecoleUser;
	private String telUser;
	private String passwordUser;
	private Set<Event> myEvents=new HashSet<Event>();
	public Long getIdUser() {
		return idUser;
	}
	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}
	public String getEmailUser() {
		return emailUser;
	}
	public void setEmailUser(String emailUser) {
		this.emailUser = emailUser;
	}
	public String getEcoleUser() {
		return ecoleUser;
	}
	public void setEcoleUser(String ecoleUser) {
		this.ecoleUser = ecoleUser;
	}
	public String getTelUser() {
		return telUser;
	}
	public void setTelUser(String telUser) {
		this.telUser = telUser;
	}
	public String getPasswordUser() {
		return passwordUser;
	}
	public void setPasswordUser(String passwordUser) {
		this.passwordUser = passwordUser;
	}
	public Set<Event> getMyEvents() {
		return myEvents;
	}
	public void setMyEvents(Set<Event> myEvents) {
		this.myEvents = myEvents;
	}
	public User(String emailUser, String ecoleUser, String telUser, String passwordUser) {
		super();
		this.emailUser = emailUser;
		this.ecoleUser = ecoleUser;
		this.telUser = telUser;
		this.passwordUser = passwordUser;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}


}
