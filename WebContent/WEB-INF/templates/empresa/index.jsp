<!-- Exibir empresas cadastradas no sistema -->

<!DOCTYPE html>
<html lang="br"><head>
<meta http-equiv="content-type" content="text/html; charset=UTF-8">
    <meta charset="utf-8">
    <title>Estágio Fácil</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <!-- <meta HTTP-EQUIV="refresh" CONTENT="5"> -->

<link rel="stylesheet" type="text/css" href="../bootstrap/css/bootstrap.css">
</head><body>

<div class="container">

<nav class="navbar navbar-inverse" role="navigation">
  <div class="container-fluid">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="#">Estágio Fácil</a>
    </div>

    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav">
        <!-- <li class="active"><a href="#login-empresa" data-toggle="modal" data-target=".login-empresa"></a></li>
        <li><a href="#"></a></li> -->
      </ul>
    </div><!-- /.navbar-collapse -->
  </div><!-- /.container-fluid -->
</nav>
<!-- 
		Nome 			nome
		CNPJ - cnpj
		Telefone- telefone
		Email  email
-->

    <a href="/vagas/cadastrar" class="btn btn-primary">Cadastrar Vaga!</a>

</div> <!-- /.container -->

  <script src="http://code.jquery.com/jquery-latest.js"></script>

  <script src="../bootstrap/js/bootstrap.js"></script>
  <script type="text/javascript" src="../bootstrap/js/jquery-mask-plugin.js"></script>
  
  <script type="text/javascript" src="../bootstrap/js/jquery-validate.js"></script>


   <script>
    $(document).ready(function(){
      
      $("#formCad").validate();

    });
  </script>

</body>