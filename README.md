ProjetoCadCurriculo
===================

Sistema para cadastro de curriculos
-Entidades (empresa, candidato, vaga):
	
Abstração-----------------Nomes no Formulario(Front-end)

Empresa

	Nome ------------------- nome
	CNPJ ------------------- cnpj
	Telefone --------------- telefone
	Email ------------------ email
	Local_Funcionamento ---- end

Candidato

	Nome ------------------- nome
	CPF -------------------- cpf
	email ------------------ email
	Telefone --------------- telefone
	Endereço --------------- end
	Data de nascimento ----- nasc
	Escolaridade ----------- escolaridade
	Experiência ------------ exp
	Área de atuação -------- area
	Apendices -------------- apendices

Vaga
	Carga Horária ---------- carga-horaria
	Remuneração ------------ remuneracao
	Requesitos ------------- requisitos
	Descrição -------------- desc

-Funcionalidades		

Nome da func. ------------- Padrão da URL

Listar Candidato ---------- /candidato/index
Cadastrar Candidato ------- /candidato/cadastrar
Editar Candidato ---------- /candidato/editar
Pesquisar Candidato ------- /candidato/pesquisar
Gerar Curriculo Candidato - /candidato/gerar-curriculo

Listar Empresa ------------ /empresa/index
Cadastrar Empresa --------- /empresa/cadastrar
Editar Empresa ------------ /empresa/editar

Listar Vagas -------------- /vaga/index
Cadastrar Vagas ----------- /vaga/cadastrar
Editar Vagas -------------- /vaga/editar
Pesquisar Vagas ----------- /vaga/pesquisar
Vincular interesse Vaga --- /vaga/vincular   
Desvincular interesse Vaga  /vaga/desvincular


Exibir vagas (público geral)

Funcionalidade que não tem interface com o usuário:

Enviar email para candidatos no ato do cadastramento de uma vaga que condiz com o perfil dele.
