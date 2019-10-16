<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->

    <title>Tout les �venements</title>

    <!-- Bootstrap -->
    <link rel="stylesheet" href="css/bootstrap.css">
    <link rel="stylesheet" href="css/style.css">

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>
    
  <body>
<nav class=" navbar-inverse navbar-fixed-top" style="background-color: #0000CD">
  <div class="container-fluid">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="#"><img src="images/icon.png"></a>
    </div>

    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav navbar-right">
       <li class="dropdown">
         
        </li>
          
          <li><a href="EventManager?action=Logout">Deconnexion</a></li>

      </ul>
         <ul class="nav navbar-nav navbar-right">
        <li><a href="EventManager?action=Other">Liste d'�venement</a></li>
       
      </ul>
     
      <ul class="nav navbar-nav navbar-right">
          <li><a href="Profile.jsp">Mon Profile</a></li>
      </ul>
        
      <ul class="nav navbar-nav navbar-right">
        <li><a href="Accueil.jsp">Publier un Event</a></li>


       
      </ul>
        
        
    </div><!-- /.navbar-collapse -->
  </div><!-- /.container-fluid -->
</nav>
      
      <section class="demandes">
      <div class="input-group" style="margin-left: 600px;margin-right:300px">
      <span class="input-group-btn">
      </span>
             </div><br>  
          <center>
          <h5 style="margin: 0px">Bienvenue:</h5> <h3 stype="color:green">${sessionScope.ecole}</h3> <br>
          
      </center>
     <table class="table table-bordered text-center">
          <thead class="text-center">
<tr>
    <th>ID</th>
    <th>Titre</th>
    <th>Description</th>
    <th>Date de d�but</th>
    <th>Date de fin</th>
    <th>Lieu</th>

          </tr>
          </thead>
          
             
  <c:forEach items="${evt}" var="e">
 <tr>         
<td>${e.idEvent}</td>
<td>${e.titreEvent}</td>
<td>${e.descreptionEvent}</td>
<td>${e.dateDebut}</td>
<td>${e.dateFin}</td>
<td>${e.lieuEvent}</td> 
          </tr>
              </c:forEach>

</table>
          
      
      </section>
      
      
      
        <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://code.jquery.com/jquery-1.12.4.min.js" integrity="sha384-nvAa0+6Qg9clwYCGGPpDQLVpLNn0fRaROjHqs13t4Ggj3Ez50XnGQqc/r8MhnRDZ" crossorigin="anonymous"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.js"></script>
    <script src="js/plugins.js"></script>

  </body>
</html>