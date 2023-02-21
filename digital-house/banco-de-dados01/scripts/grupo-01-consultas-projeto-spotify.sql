/* GRUPO 01
Sabrina Freiberger
Laiane Barbalho
Guilherme Santos
Lucas Werner
Osmar Franco
*/
/*01*/
USE projeto_spotify;

/*02*/
SELECT titulo FROM cancao WHERE titulo LIKE '%z%';

/*03*/
SELECT titulo FROM cancao WHERE titulo LIKE '_a%s';

/*04*/
SELECT titulo AS 'Título', qtdcancoes AS 'Quantidade de Canções'
FROM playlist
ORDER BY qtdcancoes DESC
LIMIT 1;

/*05*/
SELECT * FROM usuario ORDER BY Data_nac LIMIT 5 OFFSET 10;

/*06*/
SELECT * FROM cancao ORDER BY qtdreproducao DESC LIMIT 5;

/*07*/
SELECT * FROM album ORDER BY titulo ASC;

/*08*/
SELECT * FROM album WHERE imagemcapa IS NULL ORDER BY titulo ASC;

/*09*/
INSERT INTO usuario (idUsuario, Nomeusuario, NomeCompleto, senha, Data_nac, sexo, Cod, Pais_idPais) 
VALUES (20, 'novousuariodespotify@gmail.com', 'Elmer Santos', 'S4321m', '1991-11-15', 'M', null, 9);

/*10*/
DELETE FROM generoxcancao WHERE IdGenero = 9;

/*11*/
SET SQL_SAFE_UPDATES = 0;

UPDATE artista
SET imagem = 'Imagem em falta'
WHERE imagem IS NULL;


