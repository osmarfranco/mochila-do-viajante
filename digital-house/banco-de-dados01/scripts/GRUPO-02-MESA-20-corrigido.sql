/* GRUPO 02

Felipe Stefani
Francisco Oliveira
Jose Paulo
Osmar Franco
Ricardo Carvalho
Thiago Dorea */

USE sakila;

-- PARTE 01
#01
SELECT	c.cliente_id,
		c.nome,
        COUNT(*) AS 'qtd_locacao',
        SUM(valor) AS 'Total'
FROM cliente AS c
INNER JOIN pagamento AS p
	ON c.cliente_id = p.cliente_id
GROUP BY c.cliente_id, c.nome
ORDER BY 3 DESC
LIMIT 10;

#02
SELECT	c.cliente_id,
		c.nome,
        COUNT(*) AS 'qtd_locacao',
        SUM(valor) AS 'Total'
FROM cliente AS c
INNER JOIN pagamento AS p
	ON c.cliente_id = p.cliente_id
GROUP BY c.cliente_id, c.nome
HAVING SUM(valor) > 150
ORDER BY 4;

#03
SELECT	cliente_id AS 'Cliente',
		COUNT(cliente_id) AS 'qtd_locacao',
        SUM(valor) AS 'Total'
FROM pagamento
WHERE DATE_FORMAT(data_pagamento, '%Y') = '2005'
GROUP BY cliente_id;

#04
SELECT	l.inventario_id,
		COUNT(l.inventario_id) AS 'qtd',
        SUM(p.valor) AS 'Total'
FROM locacao AS l
INNER JOIN pagamento AS p
	ON l.locacao_id = p.locacao_id
GROUP BY l.inventario_id
ORDER BY 2 DESC
LIMIT 5;

-- PARTE 02
#01
SELECT	p.funcionario_id AS 'Funcionário',
		COUNT(p.funcionario_id) AS 'qtd_locacao',
        DATE_FORMAT(data_pagamento, '%m') 'Mês',
        SUM(valor) AS 'Total'
FROM pagamento AS p
GROUP BY p.funcionario_id, DATE_FORMAT(data_pagamento, '%m')
ORDER BY 3;

#02
-- MAIOR RECEITA
SELECT	f.titulo AS 'Filme',
		COUNT(f.titulo) AS 'qtd_locacoes',
		SUM(p.valor) AS 'Receita'
FROM pagamento AS p
INNER JOIN locacao AS l
	ON p.locacao_id = l.locacao_id
INNER JOIN inventario AS i
	ON i.inventario_id = l.inventario_id
INNER JOIN filme AS f
	ON i.filme_id = f.filme_id
GROUP BY f.filme_id
ORDER BY 3 DESC
LIMIT 10;

-- MENOR RECEITA
SELECT	f.titulo AS 'Filme',
		COUNT(f.titulo) AS 'qtd_locacoes',
		SUM(p.valor) AS 'Receita'
FROM pagamento AS p
INNER JOIN locacao AS l
	ON p.locacao_id = l.locacao_id
INNER JOIN inventario AS i
	ON i.inventario_id = l.inventario_id
INNER JOIN filme AS f
	ON i.filme_id = f.filme_id
GROUP BY f.filme_id
ORDER BY 3
LIMIT 10;

#03
SELECT	COUNT(DISTINCT cliente_id) FROM locacao;
SELECT	COUNT(*) FROM cliente;
-- NÃO HÁ

#04
SELECT	f.filme_id,
		f.titulo,
		COUNT(f.titulo) AS 'qtd_locacao'
FROM filme AS f
LEFT JOIN inventario AS i
	ON f.filme_id = i.filme_id
GROUP BY f.filme_id,f.titulo
ORDER BY 3;