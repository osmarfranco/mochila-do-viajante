CREATE DATABASE app_musica;
USE app_musica;

CREATE TABLE artistas (
	id_artista INT AUTO_INCREMENT PRIMARY KEY,
	nome VARCHAR(80) NOT NULL,
	foto TEXT NOT NULL,
    bio TEXT(800) NOT NULL
);

CREATE TABLE musicas (
	id_musica INT AUTO_INCREMENT PRIMARY KEY,
    titulo_musica VARCHAR(80) NOT NULL,
    duracao TIME NOT NULL,
    id_album INT NOT NULL
);

CREATE TABLE albuns (
	id_album INT AUTO_INCREMENT PRIMARY KEY,
    titulo_album VARCHAR(80) NOT NULL,
    capa TEXT NOT NULL,
    ano_lancamento CHAR(4) NOT NULL
);

CREATE TABLE generos (
	id_genero INT AUTO_INCREMENT PRIMARY KEY,
    genero VARCHAR(40) NOT NULL
);

ALTER TABLE musicas ADD FOREIGN KEY (id_album) REFERENCES albuns(id_album);

CREATE TABLE artista_generos (
	id INT AUTO_INCREMENT PRIMARY KEY,
    id_artista INT NOT NULL,
    id_genero INT NOT NULL
);

ALTER TABLE artista_generos ADD FOREIGN KEY (id_artista) REFERENCES artistas(id_artista);
ALTER TABLE artista_generos ADD FOREIGN KEY (id_genero) REFERENCES generos(id_genero);

CREATE TABLE artista_musicas (
	id INT AUTO_INCREMENT PRIMARY KEY,
    id_artista INT NOT NULL,
    id_musica INT NOT NULL
);

ALTER TABLE artista_musicas ADD FOREIGN KEY (id_artista) REFERENCES artistas(id_artista);
ALTER TABLE artista_musicas ADD FOREIGN KEY (id_musica) REFERENCES musicas(id_musica);

CREATE TABLE artista_albuns (
	id INT AUTO_INCREMENT PRIMARY KEY,
    id_artista INT NOT NULL,
    id_album INT NOT NULL
);

ALTER TABLE artista_albuns ADD FOREIGN KEY (id_artista) REFERENCES artistas(id_artista);
ALTER TABLE artista_albuns ADD FOREIGN KEY (id_album) REFERENCES albuns(id_album);

CREATE TABLE albuns_generos (
	id INT AUTO_INCREMENT PRIMARY KEY,
    id_album INT NOT NULL,
    id_genero INT NOT NULL
);

ALTER TABLE albuns_generos ADD FOREIGN KEY (id_album) REFERENCES albuns(id_album);
ALTER TABLE albuns_generos ADD FOREIGN KEY (id_genero) REFERENCES generos(id_genero);

CREATE TABLE musicas_generos (
	id INT AUTO_INCREMENT PRIMARY KEY,
    id_musica INT NOT NULL,
    id_genero INT NOT NULL
);

ALTER TABLE musicas_generos ADD FOREIGN KEY (id_musica) REFERENCES musicas(id_musica);
ALTER TABLE musicas_generos ADD FOREIGN KEY (id_genero) REFERENCES generos(id_genero);