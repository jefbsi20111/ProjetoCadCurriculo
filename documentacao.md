ProjetoCadCurriculo
===================

Sistema para cadastro de curriculos
-Entidades (Empresa, Candidato, Vaga):
	
ENTIDADE.ATRIBUTO -------------- NOME NO FORM(Front-end)

Empresa(nome_empresa,email_empresa,senha_empresa,cnpj_empresa,telefone_empresa,end_empresa):

	Nome_Fantasia ---------- nome_empresa
	Email ------------------ email_empresa
	Senha ------------------ senha_empresa
	CNPJ ------------------- cnpj_empresa
	Telefone --------------- telefone_empresa
	Local_Funcionamento ---- end_empresa
	

Candidato(nome_candidato,email_candidato,senha_candidato,data_nasc_candidato,cpf_candidato,end_candidato,telefone_candidato,escolaridade_candidato,exp,area_candidato,apendices_candidato):

	Nome ------------------- nome_candidato
	Email ------------------ email_candidato
	Senha ------------------ senha_candidato
	Data de nascimento ----- data_nasc_candidato
	CPF -------------------- cpf_candidato
	Endereço --------------- end_candidato
	Telefone --------------- telefone_candidato
	Escolaridade ----------- escolaridade_candidato
	Experiência ------------ exp_candidato
	Área de atuação -------- area_atuacao_candidato
	Apendices -------------- apendices_candidato
	

Vaga(carga_horaria_vaga,remuneracao_vaga,requisitos_vaga,desc_vaga):

	Carga Horária ---------- carga_horaria_vaga
	Remuneração ------------ remuneracao_vaga
	Requisitos ------------- requisitos_vaga
	Descrição -------------- descricao_vaga


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

Para escolaridade código:

	value="0">Ensino Médio Imcompleto
    value="1">Ensino Médio Completo
    value="2">Ensino Superior Imcompleto
    value="3">Ensino Superior Completo

    /**Se o id é 0, é candidato. Se o id for diferente de 0 é empresa.**/
    O id de cada objeto é gerado automaticamente pelo comando "IDENTITY(1,1)";

    Para utilizar o banco de dados da aplicação, execute o camondo "source C:\caminhoDoBanco\..." e
    depois "use banco;"

    