ProjetoCadCurriculo
===================

Sistema para cadastro de curriculos
-Entidades (Empresa, Candidato, Vaga):
	
ENTIDADE.ATRIBUTO -------------- NOME NO FORM(Front-end)

Empresa(nome,cnpj,telefone,email,end):

	Razão_Social ----------- razaoSocial
	Nome_Fantasia ---------- nomeFantasia
	CNPJ ------------------- cnpj
	Telefone --------------- telefone
	Email ------------------ email
	Local_Funcionamento ---- end

Candidato(nome,cpf,telefone,email,end,nasc,escolaridade,exp,area,apendices):

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

Vaga(cargaHoraria,remuneracao,requisitos,desc):
	Carga Horária ---------- cargaHoraria
	Remuneração ------------ remuneracao
	Requisitos ------------- requisitos
	Descrição -------------- descricao


-NOME DA FUNC. -------------------- PADRÃO DA URL

FuncionalidadesCandidato:		

	Listar Candidato ---------- /candidato/index
	Cadastrar Candidato ------- /candidato/cadastrar
	Editar Candidato ---------- /candidato/editar
	Pesquisar Candidato ------- /candidato/pesquisar
	Gerar Curriculo Candidato - /candidato/gerar-curriculo

FuncionalidadesEmpresa:

	Listar Empresa ------------ /empresa/index
	Cadastrar Empresa --------- /empresa/cadastrar
	Editar Empresa ------------ /empresa/editar

FuncionalidadesVaga:
	Listar Vagas -------------- /vaga/index
	Cadastrar Vagas ----------- /vaga/cadastrar
	Editar Vagas -------------- /vaga/editar
	Pesquisar Vagas ----------- /vaga/pesquisar
	Vincular interesse Vaga --- /vaga/vincular   
	Desvincular interesse Vaga  /vaga/desvincular


Exibir vagas (público geral)

Funcionalidade que não tem interface com o usuário:

Enviar email para candidatos no ato do cadastramento de uma vaga que condiz com o perfil dele.
