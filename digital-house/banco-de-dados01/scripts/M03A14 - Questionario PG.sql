USE musimundos;
-- 1
SELECT cancoes.nome, cancoes.compositor, id_album, id_genero, albuns.titulo, generos.nome
FROM cancoes
INNER JOIN albuns ON id_album = albuns.id
INNER JOIN generos ON id_genero = generos.id
WHERE cancoes.compositor LIKE 'Willie Dixon' AND generos.nome LIKE 'Blues';
-- 2
SELECT cancoes.nome, id_genero, generos.nome
FROM cancoes
INNER JOIN generos ON id_genero = generos.id
WHERE generos.nome LIKE 'Rock';
-- 3
SELECT albuns.titulo, artistas.nome
FROM albuns
INNER JOIN artistas ON id_artista = artistas.id;
-- 4
SELECT cancoes.nome, id_tipo_de_arquivo, tipos_de_arquivo.nome
FROM cancoes
INNER JOIN tipos_de_arquivo ON id_tipo_de_arquivo = tipos_de_arquivo.id
WHERE tipos_de_arquivo.nome LIKE 'MPEG audio file';
-- 5
SELECT DISTINCT * FROM empregados;
-- 6 ???? (5a posição é Princess of the Dawn)
SELECT DISTINCT id_cancao AS musica, id_playlist AS playlist
FROM cancoes_playlists
INNER JOIN playlists ON playlists.id = cancoes_playlists.id_playlist
INNER JOIN cancoes ON cancoes.id = cancoes_playlists.id_cancao;
-- 7
SELECT CONCAT('A música ', nome, ' foi composta por ', compositor) AS texto
FROM cancoes;
-- 8
SELECT COALESCE(estado_cobranca, pais_cobranca, cep_cobranca)
FROM faturas;
-- 9
SELECT FLOOR(DATEDIFF(data_contratacao, data_nascimento)/365)
FROM  empregados;
-- 10
SELECT id_cliente, EXTRACT(MONTH FROM data_fatura) as mes
FROM faturas
WHERE id_cliente = 2
ORDER BY mes DESC;