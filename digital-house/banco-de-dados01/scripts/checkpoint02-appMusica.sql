/* CHECKPOINT 02 -> APP MUSICA
Aluno: Osmar Franco
Turma: 01 - Part Time
- Este é um projeto da etapa inicial um app simples de streaming de músicas;
- Nessa primeira fase apenas os dados referentes às músicas e artistas foram adicionados. */

# FASE 01: CRIAÇÃO DAS TABELAS E SUAS RELAÇÕES
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
    duracao TIME NOT NULL
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

CREATE TABLE albuns_musicas (
	id INT AUTO_INCREMENT PRIMARY KEY,
    id_album INT NOT NULL,
    id_musica INT NOT NULL
);

ALTER TABLE albuns_musicas ADD FOREIGN KEY (id_album) REFERENCES albuns(id_album);
ALTER TABLE albuns_musicas ADD FOREIGN KEY (id_musica) REFERENCES musicas(id_musica);

CREATE TABLE musicas_generos (
	id INT AUTO_INCREMENT PRIMARY KEY,
    id_musica INT NOT NULL,
    id_genero INT NOT NULL
);

ALTER TABLE musicas_generos ADD FOREIGN KEY (id_musica) REFERENCES musicas(id_musica);
ALTER TABLE musicas_generos ADD FOREIGN KEY (id_genero) REFERENCES generos(id_genero);

#FASE 02: OPERAÇÕES CRUD
-- INSERÇÃO DE DADOS
INSERT INTO artistas(nome, foto, bio)
VALUES
('Ozzy Osbourne', 'avatar-ozzy.jpg', 'John Michael Osbourne, conhecido como Ozzy Osbourne, é um músico, compositor e vocalista britânico. Famoso tanto por seu trabalho como vocalista da banda britânica Black Sabbath, como por sua carreira solo.'),
('Black Sabbath', 'avatar-black-sabbath.jpg', 'Black Sabbath foi uma banda de heavy metal britânica formada no ano de 1968 em Birmingham pelo guitarrista e principal compositor Tony Iommi, o baixista e principal letrista Geezer Butler, o vocalista Ozzy Osbourne e o baterista Bill Ward.'),
('Foo Fighters', 'avatar-foo-fighters.jpg', 'Foo Fighters é uma banda de rock americana formada em 1994, em Seattle, Washington. A banda foi fundada pelo ex-baterista do Nirvana, Dave Grohl, como um projeto de um homem só, após a dissolução do Nirvana, devido ao suicídio de Kurt Cobain.'),
('Sepultura', 'avatar-sepultura.jpg', 'Sepultura é uma banda de heavy metal criada em 1984 pelos irmãos Max e Igor Cavalera em Belo Horizonte, Minas Gerais.'),
('Jinjer', 'avatar-jinjer.jpg', 'Jinjer é uma banda ucraniana de metal progressivo formada em 2009. O seu estilo músical incorpora elementos do death metal, metalcore e nu-metal.'),
('Nightwish', 'avatar-nightwish.jpg', 'sem bio'),
('AC/DC', 'sem foto', 'AC/DC é uma banda australiana de rock formada em Sydney, Austrália em 1973, pelos irmãos escoceses Malcolm e Angus Young. O estilo musical da banda é normalmente classificado como hard rock e até mesmo blues rock. Mas seus membros sempre classificaram a sua música simplesmente como "rock and roll".'),
('Krisiun', 'avatar-krisiun.jpg', 'Krisiun é uma banda brasileira de death metal, formada em 1990, na cidade de Ijuí, no Rio Grande do Sul. O nome da banda deriva de um mar lunar nomeado "Mare Crisium".'),
('Arch Enemy', 'avatar-arch-enemy.jpg', 'Arch Enemy é uma banda sueca de death metal melódico com influências de power metal, formada em 1995. Tem uma distinção das outras bandas do gênero, por ter uma mulher como vocalista, o que é muito raro nas bandas de death metal sendo que o vocal é gutural.'),
('Lacuna Coil', 'avatar-lacuna-coil.jpg', 'Lacuna Coil é uma banda de metal gótico e metal alternativo formada na cidade de Milão, Itália, em 1994. Outros nomes da banda, antes de chegar ao atual, foram Sleep of Right e Ethereal.'),
('Immortal', 'avatar-immortal.jpg', 'Immortal é uma banda de black metal de Bergen, Noruega, formada em 1990. Considerada uma das pioneiras do estilo, a banda foi fundada por Demonaz e Abbath, sendo encarregados de escrever todas as músicas e letras.'),
('The Gathering', 'avatar-gathering.jpg', 'The Gathering é uma banda holandesa de Gothic Metal/Doom Metal formada em 1989.'),
('ACDC', 'avatar-acdc.jpg', 'AC/DC é uma banda australiana de rock formada em Sydney, Austrália em 1973, pelos irmãos escoceses Malcolm e Angus Young. O estilo musical da banda é normalmente classificado como hard rock e até mesmo blues rock. Mas seus membros sempre classificaram a sua música simplesmente como "rock and roll".');

-- ATUALIZAÇÃO DE DADOS
SET SQL_SAFE_UPDATES = 0;
UPDATE artistas SET bio = 'Nightwish é uma banda finlandesa de metal sinfônico formada em 1996 na cidade de Kitee pelo tecladista e compositor Tuomas Holopainen.'
WHERE bio = 'sem bio';

UPDATE artistas SET foto = 'avatar-ac-dc.jpg'
WHERE foto = 'sem foto';

-- EXCLUSÃO DE DADOS
DELETE FROM artistas WHERE nome = 'ACDC';

-- SELEÇÃO DE DADOS
SELECT nome, bio FROM artistas
ORDER BY nome ASC;