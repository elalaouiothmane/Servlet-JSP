<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <title>Login</title>

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
          
<li><a href="Login.jsp">Se Connecter</a></li>
      </ul>
         <ul class="nav navbar-nav navbar-right">
        <li><a href="Inscription.jsp">S'inscrire</a></li>
       
      </ul>
     
   
        
    </div><!-- /.navbar-collapse -->
  </div><!-- /.container-fluid -->
</nav>
     <section class="connecter">
      <div class="container">  
      <center> 
 <form action="LoginRegestre" method="post"> 
     <h2 style="color: red">${Erreur}</h2>
     <h2 style="color: green">${msg}</h2>
          <img src="images/logo2.png">

  <input type=email name=email placeholder="email" class="form-control" style="margin-top: 20px"><br>
  <select name="ecole" class="form-control">
    <option>>>Choisissez</option>
     <option>AIAC</option>
     <option>ECC</option>
     <option>EHTP</option>
     <option>EMI</option>
     <option>ENSEM</option>
     <option>ENSIAS</option>
     <option>ENSMR</option>
     <option>ESI</option>
     <option>EST</option>
     <option>ESITH</option>
     <option>IAV</option>
     <option>INPT</option>
     <option>INSEA</option>
     <option>INSEA</option>
     <option>R.ENSA</option>
     <option>R.ENSAM</option>
     <option>R.ENSET</option>
     <option>R.FST</option>
     <option>Université</option>
     </select><br> 
       <input type="number" name="tel" placeholder="telephone" class="form-control" min="0"  maxlength="10" pattern="^((\+\d{1,3}(-| )?\(?\d\)?(-| )?\d{1,5})|(\(?\d{2,6}\)?))(-| )?(\d{3,4})(-| )?(\d{4})(( x| ext)\d{1,5}){0,1}$"
       required><br>

  <input type=password name="password" placeholder="password" class="form-control"><br>
  <input type=password name="password1" placeholder="confirmer le mot de passe" class="form-control"><br>
 
  
          <input type=submit name="submit" value="S'inscrire" class="btn btn-info">

  </form>         
     </center>    
         </div>
      </section>
         
    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://code.jquery.com/jquery-1.12.4.min.js" integrity="sha384-nvAa0+6Qg9clwYCGGPpDQLVpLNn0fRaROjHqs13t4Ggj3Ez50XnGQqc/r8MhnRDZ" crossorigin="anonymous"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.js"></script>
    <script src="js/plugins.js"></script>

  </body>
</html>