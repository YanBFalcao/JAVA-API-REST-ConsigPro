USE consigpro;

CREATE TABLE cd_cliente(
	cod_cliente INT AUTO_INCREMENT NOT NULL,
    nome_cliente VARCHAR (80) NOT NULL,
    dt_nascimento_cliente DATE NOT NULL,
    email_cliente VARCHAR (100) NOT NULL,
    cpf_cliente VARCHAR (11) NOT NULL,
    sexo_cliente VARCHAR (1) NOT NULL,
    
    
)

CREATE TABLE cd_cliente_beneficio(
	cod_beneficio INT AUTO_INCREMENT NOT NULL,
	especie_beneficio_cliente INT NOT NULL,
    descricao_beneficio_cliente VARCHAR (100) NOT NULL,
    uf_beneficio_cliente VARCHAR (2) NOT NULL,
    num1_matricula_cliente INT (11) NOT NULL,
    num2_matricula_cliente INT (11) NOT NULL,
    senha_cliente VARCHAR (20) NOT NULL
)


sexo
e-mail
senha conta-cheque 
naturalidade
uf naturalidade
IDENTIDADE - RG
órgão emissor
uf emissão
data emissão
nome do pai
nome da mãe
cep
endereço/logradouro
número
complemento
bairro
cidade
UF endereço
valor salário
telefone residencial
telefone comercial
telefone celular

dados bancários
tipo de pagamento (conta corrente, OP, boleto etc)
banco
recebe cartão benefício
Agência + dv
conta + dv
Tipo de conta (conta corrente, conta poupança, etc)


dados de operação
Banco
parcelas pagas
total parcelas
%pago
parcelas restantes
parcela
valor quitar
valor adiantado
saldo de inadimplencia
margem utilizada
tarifa
tac
coeficiente










