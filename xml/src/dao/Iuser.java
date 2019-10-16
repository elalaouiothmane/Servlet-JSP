package dao;

import java.util.List;

public interface Iuser {
	public void Inscription(User user);
	public boolean SeConnecter(String Email,String Password);
	public void Ajouter_Event(Long Id_User,Event event);
	public void Update_Event(Event event);
	public void Supprimer_Event(Long Id_Event);
	public void Update_Profile(User user);
	public List<Event> getAllEvent();
	public User findUserbymail(String Email);
	public List<Event> getMyEvent(Long i);
	public User findUserbyId(Long id);
	public Event getEventbyId(Long id);
	public User getUserbyEvent(Long i);
    public  List<String> getAllEmail();
}
