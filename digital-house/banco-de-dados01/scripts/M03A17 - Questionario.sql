USE musimundos;

#1
CREATE VIEW FATURAS_NACIONAIS AS
SELECT f.id, f.data_fatura, f.id_cliente, c.nome, c.sobrenome, f.valor_total
FROM faturas AS f
INNER JOIN clientes AS c
ON f.id_cliente = c.id
WHERE pais_cobranca LIKE 'Brazil';

SELECT * FROM faturas_nacionais;

SELECT f.id, f.data_fatura, f.id_cliente, c.nome, c.sobrenome, f.valor_total, f.pais_cobranca
FROM faturas AS f
INNER JOIN clientes AS c
ON f.id_cliente = c.id
WHERE pais_cobranca LIKE 'Brazil'
GROUP BY c.nome;
-- o enunciado não falava nada sobre o agrupamento dos clientes, mas foi a única forma de encontrar uma resposta que batia com as alternativas

#2
CREATE VIEW LATINOS AS
SELECT	artistas.nome AS 'Artista',
		albuns.titulo AS 'Album',
        cancoes.nome AS 'Música',
        generos.nome AS 'Gênero'
FROM cancoes
INNER JOIN albuns ON cancoes.id_album = albuns.id
INNER JOIN artistas ON albuns.id_artista = artistas.id
INNER JOIN generos ON cancoes.id_genero = generos.id
WHERE cancoes.id_genero = 7
ORDER BY artistas.nome, cancoes.nome;

SELECT * FROM latinos;

#3
CREATE VIEW FATURAS_BRAZIL AS
SELECT	clientes.nome AS 'Nome',
		clientes.sobrenome AS 'Sobrenome',
        faturas.pais_cobranca AS 'País',
        SUM(faturas.valor_total) AS 'Total Faturas'
FROM faturas
INNER JOIN clientes ON faturas.id_cliente = clientes.id
WHERE faturas.pais_cobranca LIKE 'Brazil'
GROUP BY faturas.id_cliente
ORDER BY clientes.nome ASC;

SELECT * FROM faturas_brazil;

SELECT	clientes.nome AS 'Nome',
		clientes.sobrenome AS 'Sobrenome',
        faturas.pais_cobranca AS 'País',
        SUM(faturas.valor_total) AS 'Total Faturas'
FROM faturas
INNER JOIN clientes ON faturas.id_cliente = clientes.id
WHERE faturas.pais_cobranca LIKE 'Brazil'
GROUP BY faturas.id_cliente
ORDER BY clientes.nome ASC;