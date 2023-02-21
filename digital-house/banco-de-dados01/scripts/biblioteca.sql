CREATE DATABASE biblioteca;
USE biblioteca;

CREATE TABLE associados (
	id_associado INT AUTO_INCREMENT PRIMARY KEY,
    rg CHAR(10) NOT NULL,
    nome VARCHAR(25) NOT NULL,
    sobrenome VARCHAR(40) NOT NULL,
    telefone_contato CHAR(11) NOT NULL,
    endereco VARCHAR(100) NOT NULL
    );
CREATE TABLE livros (
	id_livro INT AUTO_INCREMENT PRIMARY KEY,
	titulo VARCHAR(80) NOT NULL,
    id_autor INT NOT NULL,
	ano_escrito CHAR(4) NOT NULL,
	ano_publicado CHAR(4) NOT NULL,
	id_editora INT NOT NULL,
    isbn CHAR(13) NOT NULL
    );
CREATE TABLE copias_condicao (
	id_copia INT PRIMARY KEY,
    id_livro INT NOT NULL,
	condicao_livro VARCHAR(150) NOT NULL
    );
CREATE TABLE editora (
	id_editora INT AUTO_INCREMENT PRIMARY KEY,
	nome_comercial VARCHAR(50) NOT NULL,
	telefone_editora CHAR(11) NOT NULL
    );
CREATE TABLE autor (
	id_autor INT AUTO_INCREMENT PRIMARY KEY,
	nome_autor VARCHAR(80) NOT NULL
    );
CREATE TABLE emprestimo (
	id_emprestimo INT AUTO_INCREMENT PRIMARY KEY,
	id_associado INT NOT NULL,
    id_copia INT NOT NULL,
	data_retirada DATE NOT NULL,
	data_devolucao DATE NOT NULL,
	data_real_devolucao DATE NOT NULL
    );
ALTER TABLE livros ADD FOREIGN KEY (id_autor) REFERENCES autor(id_autor);
ALTER TABLE livros ADD FOREIGN KEY (id_editora) REFERENCES editora(id_editora);
ALTER TABLE copias_condicao ADD FOREIGN KEY (id_livro) REFERENCES livros(id_livro);
ALTER TABLE emprestimo ADD FOREIGN KEY (id_associado) REFERENCES associados(id_associado);
ALTER TABLE emprestimo ADD FOREIGN KEY (id_copia) REFERENCES copias_condicao(id_copia);