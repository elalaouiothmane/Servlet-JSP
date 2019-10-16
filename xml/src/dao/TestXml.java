package dao;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.SimpleFormatter;

import com.ibm.icu.text.SimpleDateFormat;

import util.HibernateUtil;

public class TestXml {

	public static void main(String[] args) throws ParseException {
		HibernateUtil.getSessionFactory();
		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
		//String dateString = format.format( new Date()   );
		//Date   date1       = format.parse ( "4-09-2019" ); 
		//Date   date2       = format.parse ( "6-09-2019"  ); 
		userIm u=new userIm();
       User p=new User("alaoui@gmail.com", "Inpt", "0612345678", "alaoui123");
	     User p1=new User("alaoui2@gmail.com", "ensias", "02255555", "alaoui123");
		//u.Inscription(p1);

		//u.Inscription(p);
      // u.Ajouter_Event(1l, new Event(date1, date2, "ensias", "les idees inov", "bla bla bla"));
      //u.Ajouter_Event(2l, new Event(date1, date2, "inpt", "les khra", "bla bla bla"));

		//System.out.println(u.getAllEvent());
	     //boolean r=u.SeConnecter("othmane@gmail.com", "123");
         // System.out.println(r);
          //String f= u.findUserbymail("othmane@gmail.com").getEcoleUser();
          //System.out.println(f);
          //for(int i=0;i<u.getMyEvent(u.findUserbymail("alaoui@gmail.com").getIdUser()).size();i++) {
          // System.out.println(u.getMyEvent(u.findUserbymail("alaoui@gmail.com").getIdUser()).get(i).getLieuEvent());
      
	   System.out.println(u.getAllEmail());  
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	}}


