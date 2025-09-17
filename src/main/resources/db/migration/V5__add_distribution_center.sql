-- Adiciona a coluna distribution_center na tabela product
ALTER TABLE product ADD COLUMN distribution_center VARCHAR(255);

-- Cria uma CTE (Common Table Expression) pra gerar os números e atualizar
WITH numbered_products AS (
    SELECT id, ROW_NUMBER() OVER (ORDER BY id) AS row_num
    FROM product
)
UPDATE product p
SET distribution_center = CASE
    WHEN (SELECT row_num FROM numbered_products np WHERE np.id = p.id) % 3 = 1 THEN 'Mogi das Cruzes'
    WHEN (SELECT row_num FROM numbered_products np WHERE np.id = p.id) % 3 = 2 THEN 'Recife'
    ELSE 'Porto Alegre'
END
WHERE p.distribution_center IS NULL;