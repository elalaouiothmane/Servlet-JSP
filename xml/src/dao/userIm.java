package dao;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

import util.HibernateUtil;

public class userIm implements Iuser {

	@Override
	public void Inscription(User user) {
	     Session session=(Session)HibernateUtil.getSessionFactory().getCurrentSession();
		 session.beginTransaction();
		 try {
			session.save(user);
		} catch (HibernateException e) {
			session.getTransaction().rollback();
		}
	     session.getTransaction().commit();
		
		
	}

	@Override
	public boolean SeConnecter(String Email, String Password) {
		Session session=(Session) HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Query req=session.createQuery("select passwordUser from User where emailUser=:x");
		req.setParameter("x", Email);
		if(req.list().contains(Password)) {
			return true;
		}
		return false;
		
	}

	@Override
	public void Ajouter_Event(Long Id_User, Event event) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		User user = (User) session.get(User.class,Id_User);
		user.getMyEvents().add(event);
		event.setUtilisateur(user);
		if(event.getDateDebut().compareTo(event.getDateFin())<0 && event.getDateDebut().compareTo(new Date())>0) {
			event.setUtilisateur(user);
			session.save(event);
			session.getTransaction().commit();	
			
			
		}
			

		
	}

	@Override
	public void Update_Event(Event event) {
		Session session=(Session) HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.update(event);
		//session.evict(event);
		session.getTransaction().commit();			
	}

	@Override
	public void Supprimer_Event(Long Id_Event) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Event event=(Event) session.get(Event.class,Id_Event);
		session.delete(event);
		session.getTransaction().commit();		
	}

	@Override
	public void Update_Profile(User user) {
		Session session=(Session) HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.update(user);
		session.getTransaction().commit();			
	}

	

	@Override
	public List<Event> getAllEvent() {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Query req = session.createQuery("select p from Event p");
		 List<Event> events=req.list();
	     session.getTransaction().commit();		
		 return events;
	}

	@Override
	public User findUserbymail(String Email) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Query req = session.createQuery("select p from User p where emailUser like :x");
		 req.setParameter("x", Email);
		 User user =(User) req.uniqueResult();
	     session.getTransaction().commit();		
		  return user;
	}

	@Override
	public List<Event> getMyEvent(Long i) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Query req = session.createQuery("select e from Event e where utilisateur.idUser =:x");
		 req.setParameter("x", i);
		 List<Event> events=req.list();
		 return events;
	}

	@Override
	public User findUserbyId(Long id) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Query req = session.createQuery("select p from User p where idUser =:x");
		 req.setParameter("x", id);
		 User user =(User) req.uniqueResult();
	     session.getTransaction().commit();		
		  return user;
	}

	@Override
	public Event getEventbyId(Long id) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Query req = session.createQuery("select p from Event p where idEvent =:x");
		 req.setParameter("x", id);
		 Event event=(Event) req.uniqueResult();
	     session.getTransaction().commit();		
		  return event;
	}

	@Override
	public User getUserbyEvent(Long i) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Query req = session.createQuery("select utilisateur from Event where idEvent =:x");
		 req.setParameter("x", i);
		 User user =(User) req.uniqueResult();
	     session.getTransaction().commit();		
		  return user;
	}

	@Override
	public List<String> getAllEmail() {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Query req = session.createQuery("select emailUser from User");
		 List<String> emails=req.list();
		 return emails;
	}

}
	
