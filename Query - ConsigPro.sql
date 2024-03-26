-USE consigpro;

CREATE TABLE cd_cliente(
	cod_cliente INT AUTO_INCREMENT PRIMARY KEY,
    nome_cliente VARCHAR (80),
    dt_nascimento DATE,
    cpf VARCHAR (11),
    sexo VARCHAR (1),
    naturalidade VARCHAR (50),
    uf_cliente VARCHAR (2),
    num_rg VARCHAR (15),
    orgao_emissor VARCHAR (5),
    uf_emissao_rg VARCHAR (2),
	dt_emissao_rg DATE,
    nome_mae VARCHAR (100),
    nome_pai VARCHAR (100)
);

CREATE TABLE cd_contato(
	cod_contato INT AUTO_INCREMENT PRIMARY KEY,
    telefone_1 INT,
	telefone_2 INT,
	telefone_3 INT,
    email_1 VARCHAR (80),
    email_2 VARCHAR (80),

    cod_cliente_contato INT,
	FOREIGN KEY (cod_cliente_contato) REFERENCES cd_cliente(cod_cliente)
);

CREATE TABLE cd_beneficio(
	cod_beneficio INT AUTO_INCREMENT PRIMARY KEY,
	num_especie INT,
    descricao_beneficio VARCHAR (100),
    uf_beneficio VARCHAR (2),
    matricula_1 INT (11),
    matricula_2 INT (11),
    senha_1 VARCHAR (20),
    senha_2 VARCHAR (20),
    salario_1 INT (10),
	salario_2 INT (10),
    
    cod_cliente_beneficio INT,
    FOREIGN KEY (cod_cliente_beneficio) REFERENCES cd_cliente(cod_cliente)
);

CREATE TABLE cd_endereco(
	cod_endereco INT AUTO_INCREMENT PRIMARY KEY,
    cep_endereco VARCHAR (10),
	endereco VARCHAR (100),
    numero VARCHAR (5),
	complemento VARCHAR (50),
    bairro VARCHAR (30),
    cidade VARCHAR (50),
    uf_endereco VARCHAR (2),
    
    cod_cliente_endereco INT,
    FOREIGN KEY (cod_cliente_endereco) REFERENCES cd_cliente(cod_cliente)
);

CREATE TABLE cd_dados_bancarios(
	cod_dadosbancarios INT AUTO_INCREMENT PRIMARY KEY,
    numero_banco INT (4),
    descricao_banco VARCHAR (100),
    num_agencia INT(4),
    dv_agencia INT (1),
    num_conta INT (10),
    dv_conta INT (1),
    tp_conta VARCHAR (50), -- Conta corrente, poupança, salário, etc)
    tp_pagamento VARCHAR (50), -- Conta corrente, OP, saque, boleto, etc)
    
    cod_cliente_dadosbancarios INT,
    FOREIGN KEY (cod_cliente_dadosbancarios) REFERENCES cd_cliente(cod_cliente)
);

CREATE TABLE cd_contrato(
	cod_contrato INT AUTO_INCREMENT PRIMARY KEY,
	num_banco INT (4),
    parcelas_pagas INT (3),
    total_parcelas INT (3),
    percent_pago INT (3),
    parcelas_restantes INT (3),
    valor_parcela INT (8),
    saldo_devedor INT (20),
    tac INT (5),
    coeficiente DOUBLE,
    
    cod_cliente_contrato INT,
    FOREIGN KEY (cod_cliente_contrato) REFERENCES cd_cliente(cod_cliente)
);