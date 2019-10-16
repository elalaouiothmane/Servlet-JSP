package web;

import java.io.IOException;
import java.sql.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.Event;
import dao.Iuser;
import dao.User;
import dao.userIm;

@WebServlet("/EventManager")
public class EventManager extends HttpServlet {
	private Iuser metier;
	private static final long serialVersionUID = 1L;
     @Override
    public void init() throws ServletException {
    	 metier=new userIm();
    	super.init();
    }
    public EventManager() {
        super();
    }

	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email=request.getParameter("emailur");
			String tel=request.getParameter("telur");
	      	String password1=request.getParameter("passwordur1");
	      	String password2=request.getParameter("passwordur2");	
		
		
		HttpSession session=request.getSession();
		String action1=request.getParameter("save");
		String titre=request.getParameter("titre");
      	String id1=request.getParameter("id1");
      	String lieu=request.getParameter("lieu");
      	String description=request.getParameter("description");
      	String dated=request.getParameter("dated");
      	String datef=request.getParameter("datef");
      	Long id2=(Long) session.getAttribute("id");
      	String action=request.getParameter("action");
      	
  		if(action1!=null && action1.equals("Enregistrer") && titre!="" && lieu!="" && description!="" && dated!="" && datef!="") {
  		metier.Ajouter_Event(id2, new Event(Date.valueOf(dated), Date.valueOf(datef), lieu, titre, description));	
  		}
  		
  		else if(action!=null && action.equals("supp")) {
  			Long id3=Long.parseLong(request.getParameter("idEvent"));
  			metier.Supprimer_Event(id3);	
  		}
  		else if(action!=null && action.equals("Edit")) {
  			Long id4=Long.parseLong(request.getParameter("idevenement"));
  			Event ev=metier.getEventbyId(id4);
  			request.setAttribute("ev", ev);

  			
  		}else if(action1!=null && action1.equals("update")) {
  			Long id11=Long.parseLong(request.getParameter("idEventt"));
  			String titre1=request.getParameter("titre");
  	      	String lieu1=request.getParameter("lieu");
  	      	String description1=request.getParameter("description");
  	      	String dated1=request.getParameter("dated");
  	      	String datef1=request.getParameter("datef");
  	      	Event evv=new Event(Date.valueOf(dated1), Date.valueOf(datef1), lieu1, titre1, description1);
  	      	evv.setIdEvent(id11);
  	        evv.setUtilisateur(metier.getUserbyEvent(id11));
  	      	metier.Update_Event(evv);
  			
  		}else if(action!=null && action.equals("Other")) {
  			List<Event> evt=metier.getAllEvent();
  			session.setAttribute("evt", evt);
  			request.getRequestDispatcher("/OtherEvent.jsp").forward(request,response);

  			
  		}
  		else if(action!=null && action.equals("Logout")) {
  			session.invalidate();
  			request.getRequestDispatcher("/Login.jsp").forward(request,response);

  			
  		}else if(action1!=null && action1.equals("updateProfile") && email!=null && password1!=null && password2!=null && tel!=null && email!="" && tel!="" && password1!="" && password2!="") {
  			String info ;
  			if(session.getAttribute("password").equals(password1)) {
  				User ur=new User(email, (String) session.getAttribute("ecole"), tel, password2);
  				ur.setIdUser((Long) session.getAttribute("id"));
  				metier.Update_Profile(ur);
  		        info="le profile est actualisé";
  			}else {
  				info="L'ancien mot de passe n'est pas valide";
  			}
  			request.setAttribute("info", info);
  			request.getRequestDispatcher("/Profile.jsp").forward(request, response);
  			
  			
  			
  			
  		}
  		
  		
  		
  		session.setAttribute("mesEvent", metier.getMyEvent(metier.findUserbyId(id2).getIdUser()));
		request.getRequestDispatcher("/Accueil.jsp").forward(request, response);
		}
  	
	
	
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		
	}

}
