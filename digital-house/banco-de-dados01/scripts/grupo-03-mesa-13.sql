USE musimundos;

-- 01
SELECT MAX(valor_total), cidade_cobranca FROM faturas
GROUP BY cidade_cobranca
HAVING cidade_cobranca = 'Oslo';

-- 02
SELECT MIN(valor_total) FROM faturas;

-- 03
SELECT AVG(valor_total), pais_cobranca FROM faturas
GROUP BY pais_cobranca
HAVING pais_cobranca = 'Canada';

-- 04
SELECT COUNT(id), pais_cobranca FROM faturas
GROUP BY pais_cobranca
HAVING pais_cobranca = 'Canada';

-- 05
SELECT SUM(valor_total) AS total FROM faturas;

-- 06
SELECT id, data_fatura, valor_total FROM faturas
WHERE valor_total < (SELECT AVG(valor_total) FROM faturas)
ORDER BY valor_total;

-- 07
SELECT MAX(data_nascimento) FROM empregados;

-- 08
SELECT MIN(data_nascimento) FROM empregados;

-- 09
SELECT DATE_FORMAT(data_nascimento, "%d %M %Y") AS data_nascimento FROM empregados;

-- 10
SELECT COUNT(id), compositor FROM cancoes
GROUP BY compositor
HAVING compositor = 'AC/DC';

-- 11
SELECT AVG(duracao_milisegundos) AS media_duracao FROM cancoes;

-- 12
SELECT AVG(bytes), compositor FROM cancoes
GROUP BY compositor
HAVING compositor = 'AC/DC';

-- 13
SELECT COUNT(id) AS total_clientes, cidade FROM clientes
GROUP BY cidade
HAVING cidade = 'São Paulo';

-- 14
SELECT COUNT(id) AS total_clientes, cidade FROM clientes
GROUP BY cidade
HAVING cidade = 'Paris';

-- 15
SELECT COUNT(email) AS total_emails_yahoo FROM clientes
WHERE email LIKE '%yahoo%';

-- 1 - Selecione o nome dos artistas(tabela artistas)  com o nome de seus albuns (tabela albuns) ordenado por id do artista.
SELECT artistas.nome, albuns.titulo, albuns.id_artista 
FROM albuns
INNER JOIN artistas
ON albuns.id_artista = artistas.id
ORDER BY artistas.id;

-- 2 - Selecione o nome do cliente (clientes) e suas faturas (faturas), porém somente as faturas com valor maior de 5 ordenados pelo valor da fatura decrescente.
SELECT clientes.nome, faturas.valor_total, faturas.id_cliente
FROM faturas
INNER JOIN clientes
ON faturas.id_cliente = clientes.id
WHERE faturas.valor_total > 5
ORDER BY faturas.valor_total DESC;

-- 3 Selecione o nome das cancoes (tabela cancoes) e o tipo de arquivo (tabela tipos_de_arquivos) e exiba o nome da canção e o tipo ordenado pelo id da canção.
SELECT cancoes.nome, cancoes.id_tipo_de_arquivo, tipos_de_arquivo.id, tipos_de_arquivo.nome 
FROM cancoes  
INNER JOIN tipos_de_arquivo
ON cancoes.id_tipo_de_arquivo = tipos_de_arquivo.id
ORDER BY cancoes.id;