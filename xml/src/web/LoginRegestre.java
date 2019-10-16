package web;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.fileupload.RequestContext;

import dao.Iuser;
import dao.User;
import dao.userIm;

/**
 * Servlet implementation class LoginRegestre
 */
@WebServlet("/LoginRegestre")
public class LoginRegestre extends HttpServlet {
	private Iuser metier;
	@Override
	public void init() throws ServletException {
		metier=new userIm();
		super.init();
	}

	private static final long serialVersionUID = 1L;
    public LoginRegestre() {
        super();
    }
    @Override
    	  
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    String Email=request.getParameter("email");
	    String Tel=request.getParameter("tel");
	    String Ecole=request.getParameter("ecole");
	    String Password=request.getParameter("password");
	    String Password1=request.getParameter("password1");
	    String action=request.getParameter("submit");
	    if(Password.equals(Password1)&& Email!="" && Ecole!="" && Tel!="" && Password!="" && Password1!="" && action.equals("S'inscrire")) {
	    	metier.Inscription(new User(Email, Ecole, Tel, Password));
	    	String msg="Inscription validée Connecte vous pour Continuer";
	    	request.setAttribute("msg", msg);
	    	request.getRequestDispatcher("/Inscription.jsp").forward(request,response);	
	    }
	    
	    else if(action.equals("connecter")) {
	    	if( metier.SeConnecter(Email, Password) && Email!="" && Password!="") {
	    	HttpSession session=request.getSession();
    		session.setAttribute("email", Email);
    		session.setAttribute("ecole", metier.findUserbymail(Email).getEcoleUser());
    	    session.setAttribute("id", metier.findUserbymail(Email).getIdUser());
    		session.setAttribute("tel", metier.findUserbymail(Email).getTelUser());
    		session.setAttribute("password", metier.findUserbymail(Email).getPasswordUser());

	    		
    		ServletContext app=request.getServletContext();
    		//app.setAttribute("email", Email);
    		//app.setAttribute("ecole", metier.findUserbymail(Email).getEcoleUser());
    		session.setAttribute("id", metier.findUserbymail(Email).getIdUser());
    		session.setAttribute("mesEvent", metier.getMyEvent(metier.findUserbymail(Email).getIdUser()));
    		request.getRequestDispatcher("/Accueil.jsp").forward(request, response);}
	    	
	   
	    	
	    	
	    	else {
	    		String Erreur="Compte introuvable inscrivez vous svp";
	    		request.setAttribute("Erreur", Erreur);
		    	request.getRequestDispatcher("/Login.jsp").forward(request, response);
	    		
	    	}
	    	
	    	}
	    else {
	    	
	    	String Erreur="Erreur de saisi !! Essayer à nouveau";
    		request.setAttribute("Erreur", Erreur);
	    	request.getRequestDispatcher("/Inscription.jsp").forward(request, response);
	    }

	  
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
