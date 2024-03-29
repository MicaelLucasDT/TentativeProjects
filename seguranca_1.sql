CREATE DATABASE seguranca_1;

USE seguranca_1;

CREATE TABLE usuario (
	nome VARCHAR(500),
	cpf VARCHAR(15) primary KEY,
	telefone VARCHAR (15)
);

CREATE TABLE nivel (
	id INT auto_increment primary KEY,
	descricao VARCHAR(100)
);

CREATE TABLE login (
	id INT auto_increment primary KEY,
	cpf VARCHAR(15),
	login VARCHAR (15),
	senha VARCHAR (100),
	nivel INT,
	CONSTRAINT fk_usuario FOREIGN KEY (cpf) REFERENCES usuario (cpf),
	CONSTRAINT fk_nivel FOREIGN KEY (nivel) REFERENCES nivel (id)
);

INSERT INTO usuario (nome, cpf, telefone)
VALUES 
('admininstrador', '12345678989', '83912345678');

INSERT INTO nivel (descricao)
VALUES
('Administrador'),
('Gerente'),
('Usuário');

INSERT INTO login (cpf, login, senha, nivel)
VALUES
('12345678989', 'admin', 'admin', 1);

UPDATE login SET senha = MD5 (senha)
WHERE login = 'admin' 


SELECT * FROM login;


CREATE TABLE LOG (
id INT AUTO_INCREMENT PRIMARY KEY, 
cpf VARCHAR (15),
cpf_alterado VARCHAR(15),
DATA TIMESTAMP,
novo_nivel INTEGER,
CONSTRAINT fk_cpf_log FOREIGN KEY (cpf) REFERENCES usuario (cpf), 
CONSTRAINT fk_cpf_alterado FOREIGN KEY (cpf_alterado) REFERENCES usuario (cpf),
CONSTRAINT fk_nivel_novo FOREIGN KEY (novo_nivel) REFERENCES nivel (id)
);

SELECT * FROM log;












