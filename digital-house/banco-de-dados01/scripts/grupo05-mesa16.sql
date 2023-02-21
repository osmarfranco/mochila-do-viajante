/* GRUPO 05
Osmar Franco
Everton Silva
Julia Carvalho
Washington Conceição
Washington Betiol
Vinicius Saraiva
Guilherme Santos */
USE emarket;
# PARTE I
SELECT	faturas.FaturaId AS 'Fatura',
		faturas.DataFatura AS 'Data',
		correios.Empresa AS 'Transportadora',
		clientes.Empresa AS 'Cliente',
        categorias.CategoriaNome AS 'Categoria',
        produtos.ProdutoNome AS 'Produto',
        produtos.PrecoUnitario AS 'Preço Unitário',
        detalhefatura.Quantidade AS 'Quantidade'
FROM faturas
INNER JOIN clientes
	ON faturas.ClienteID = clientes.ClienteID
INNER JOIN correios
	ON faturas.FormaEnvio = correios.CorreioID
INNER JOIN detalhefatura
	ON faturas.FaturaId = detalhefatura.FaturaId
INNER JOIN produtos
	ON detalhefatura.ProdutoID = produtos.produtoID
INNER JOIN categorias
	ON produtos.CategoriaID = categorias.CategoriaID;

# PARTE II
-- 01
SELECT	categorias.CategoriaNome AS 'Categoria',
		produtos.ProdutoNome AS 'Produto',
        produtos.QuantidadePorUnidade AS 'Quantidade por Unidade',
        produtos.PrecoUnitario AS 'Preço Unitário'
FROM categorias
LEFT JOIN produtos
	ON categorias.CategoriaID = produtos.CategoriaID
ORDER BY categorias.CategoriaID;

-- 02
SELECT	Empresa, Contato, Titulo, Telefone, Fax, Cidade
FROM clientes
LEFT JOIN faturas
	ON clientes.ClienteID = faturas.ClienteID
WHERE faturas.ClienteID IS NULL;

-- 03
SELECT	produtos.ProdutoNome AS 'Produto',
		categorias.CategoriaNome AS 'Categoria',
        provedores.Empresa AS 'Fornecedor',
        provedores.Contato AS 'Representante',
        provedores.Telefone,
        provedores.Fax
FROM produtos
INNER JOIN categorias
	ON produtos.CategoriaID = categorias.CategoriaID
LEFT JOIN provedores
	ON produtos.ProvedorID = provedores.ProvedorID;

-- 04
SELECT	categorias.CategoriaNome AS 'Categoria',
		(SELECT AVG(PrecoUnitario) FROM produtos GROUP BY CategoriaID)
FROM categorias;

SELECT	categorias.CategoriaNome AS 'Categoria',
		FLOOR(AVG(produtos.PrecoUnitario)) AS 'Preço Unitário Médio'
FROM produtos
INNER JOIN categorias
	ON produtos.CategoriaID = categorias.CategoriaID
GROUP BY produtos.CategoriaID;

-- 05
SELECT	clientes.Empresa AS 'Cliente',
		MAX(faturas.DataFatura) AS 'Última Fatura'
FROM clientes
LEFT JOIN faturas
	ON clientes.ClienteID = faturas.ClienteID
GROUP BY clientes.ClienteID;

-- 06
SELECT	correios.Empresa AS 'Transportadora',
		COUNT(faturas.FormaEnvio) AS 'Quantidade de Faturas'
FROM faturas
RIGHT JOIN correios
	ON faturas.FormaEnvio = correios.CorreioID
GROUP BY correios.CorreioID;