CREATE DATABASE DHtube;

USE DHtube;

CREATE TABLE playlist (
	idPlaylist INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(45),
    dataCriacao DATETIME,
    privado SMALLINT(6),
    Usuario_idUsuario INT(11) NOT NULL
);

CREATE TABLE usuario (
	idUsuario INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(45),
    email VARCHAR(45),
    senha VARCHAR(45),
    dataNascimento DATETIME,
    cep VARCHAR(45),
    Pais_idPais INT(11) NOT NULL,
    Avatar_idAvatar INT(11) NOT NULL
);

CREATE TABLE avatar (
	idAvatar INT(11) AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(45),
	urlimagem VARCHAR(100)
);

CREATE TABLE playlist_video (
	Video_idVideo INT(11) NOT NULL,
    Playlist_idPlaylist INT(11) NOT NULL
);

CREATE TABLE pais (
	idPais INT(11) AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100)
);

CREATE TABLE canal (
	idCanal INT(11) AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(45),
    descricao TEXT,
    dataCriacao DATETIME,
    Usuario_idUsuario INT(11) NOT NULL
);

CREATE TABLE video (
	idVideo INT(11) AUTO_INCREMENT PRIMARY KEY,
    Usuario_idUsuario INT(11) NOT NULL,
    titulo VARCHAR(100),
    descricao TEXT,
    tamanho DOUBLE,
    nomeArquivo VARCHAR(100),
    duracao DOUBLE,
    imagem VARCHAR(100),
    qtdReproducoes INT(11),
    qtdLikes INT(11),
    qtdDislikes INT(11),
    privado SMALLINT(6),
    dataPublicacao DATETIME
);

ALTER TABLE playlist ADD FOREIGN KEY (Usuario_idUsuario) REFERENCES usuario(idUsuario);
ALTER TABLE usuario ADD FOREIGN KEY (Pais_idPais) REFERENCES pais(idPais);
ALTER TABLE usuario ADD FOREIGN KEY (Avatar_idAvatar) REFERENCES avatar(idAvatar);
ALTER TABLE playlist_video ADD FOREIGN KEY (Video_idVideo) REFERENCES video(idVideo);
ALTER TABLE playlist_video ADD FOREIGN KEY (Playlist_idPlaylist) REFERENCES playlist(idPlaylist);
ALTER TABLE canal ADD FOREIGN KEY (Usuario_idUsuario) REFERENCES usuario(idUsuario);
ALTER TABLE video ADD FOREIGN KEY (Usuario_idUsuario) REFERENCES usuario(idUsuario);