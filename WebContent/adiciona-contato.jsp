<!DOCTYPE html>
<html>
<head>
<link rel="icon" type="image/png" href="assets/iconeproject.png" />
<meta charset="UTF-8">
<link crossorigin="anonymous"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	rel="stylesheet">
<link crossorigin="anonymous"
	href="https://use.fontawesome.com/releases/v5.3.1/css/all.css"
	integrity="sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU"
	rel="stylesheet">
<link crossorigin="anonymous"
	href="https://use.fontawesome.com/releases/v5.3.1/css/all.css"
	integrity="sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU"
	rel="stylesheet">
<title>Adicionar contato</title>
</head>

<body>
	<div class="text-center">
		<h1 class="display-2">Formulário de cadastro</h1><br><br><br>
	</div>

	<div class="container ">
		<div class="card">
			<div class="card-body">
				<form action="cadastra-usuario" id="form-produto">
					<div class="form-row">
						<div class="form-group col-md-12">
							<label for="nome">Nome:</label> <input type="text" value="${param.nome}"
								class="form-control" id="nome" name="nome" placeholder="Nome"
								required="required">
						</div>
					</div>

					<div class="form-row">
						<div class="form-group col-md-2">
							<label for="telefone">Telefone:</label> <input type="text" value="${param.telefone}"
								class="form-control" id="telefone" name="telefone" placeholder="Telefone"
								data-mask="(99)99999-9999">
						</div>

						<div class="form-group col-md-2">
							<label for="email">E-mail:</label> <input type="email" value="${param.email}"
								class="form-control" id="email" name="email"
								placeholder="E-mail">
						</div>

						<div class="form-group col-md-6">
							<label for="endereco">Endereço:</label> <input type="text" value="${param.endereco}"
								class="form-control" id="endereco" name="endereco"
								placeholder="Endereço">
						</div>

						<div class="form-group col-md-6">
							<button class="btn btn-success" id="btnSalvar" type="submit">Enviar</button>
						</div>

					</div>
				</form>
			</div>

		</div>
	</div>

	<script src="js/jquery.js" type="text/javascript"></script>
	<script src="js/bootstrap.js" type="text/javascript"></script>
	<script src="js/inputMask.js"></script>
</body>
</html>