USE filmes_db;

-- 01
SELECT COUNT(*) FROM filmes;

-- 02
SELECT titulo, premios FROM filmes
GROUP BY premios
HAVING premios BETWEEN 3 AND 7;

-- 03
SELECT titulo, premios, avaliacao FROM filmes
GROUP BY premios
HAVING premios BETWEEN 3 AND 7;

-- 04
SELECT COUNT(id), genero_id FROM filmes
GROUP BY genero_id;

-- 05
SELECT COUNT(id), genero_id FROM filmes
GROUP BY genero_id
HAVING SUM(premios) > 5;