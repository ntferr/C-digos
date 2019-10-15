//Questão 4

public void insertProduto(ProdutoEntity produto)
	{
		entityManager.createNativeQuery("INSERT INTO produto (nome, preco) VALUES (?, ?)")
			.setParameter(1, produto.getNome())
			.setParameter(2, produto.getPreco())
			.executeUpdate();
	}
