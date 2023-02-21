USE musimundos;

SELECT COUNT(pais), pais FROM clientes
GROUP BY pais;

SELECT COUNT(id), id_genero FROM cancoes
GROUP BY id_genero;

SELECT SUM(valor_total), valor_total FROM faturas;

SELECT AVG(duracao_milisegundos), id_album FROM cancoes
GROUP BY id_album;

SELECT MAX(bytes), id FROM cancoes;

SELECT SUM(valor_total) AS total_cliente, id_cliente FROM faturas
GROUP BY id_cliente
HAVING total_cliente > 45;

