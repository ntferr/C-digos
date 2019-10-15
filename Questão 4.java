//Questão 4

public void insertProduto(ProdutoEntity produto)
	{
		entityManager.createNativeQuery("INSERT INTO produto (nome, preco) VALUES (?, ?)")
			.setParameter(1, produto.getNome())
			.setParameter(2, produto.getPreco())
			.executeUpdate();
	}
-------------------------------------------------------
	public class ClienteService {

	private EntityManager entityManager;
	
	public void insertCliente(ClienteEntity cliente) {
		entityManager.createQuery("INSERT INTO cliente (nome) VALUES (?)")
			.setParameter(1, cliente.getNome())
			.executeUpdate();
	}
}
--------------------------------------------------------
	public class Produto_Venda {

	private EntityManager entityManager;
	
	public void insertProduto(ProdutoVendaEntity produto_venda) {
		entityManager.createQuery("INSERT INTO produto_venda (quantidade, valor) VALUES (?, ?)")
		.setParameter(1, produto_venda.getQuantidade())
		.setParameter(2, produto_venda.getValor())
		.executeUpdate();
	}
}
---------------------------------------------------------
	
	public class VendaService {

	private EntityManager entityManager;
	
	public void insertVenda(VendaEntity venda)
	{
		entityManager.createNativeQuery("INSERT INTO produto (, data) VALUES (?)")
			.setParameter(2, venda.getData())
			.executeUpdate();
	}
}
