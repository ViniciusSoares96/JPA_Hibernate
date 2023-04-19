package teste.basico;

import java.util.List;

import infra.ProdutoDAO;
import modelo.basico.Produto;

public class ObterProdutos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProdutoDAO prodDAO = new ProdutoDAO();
		List<Produto> produtos = prodDAO.obterTodos();
		
		
		for (Produto produto : produtos) {
			System.out.println("Id: "+ produto.getId() +", Nome : " +
										produto.getNome() +", preço: " +
										produto.getPreco());
		}
		
		double precoTotal = produtos.stream().map(p -> p.getPreco())
										.reduce(0.0, (t,p) -> t + p)
										.doubleValue();
		System.out.println("O valor total é de : R$ " + precoTotal );
		
		prodDAO.fechar();
	}

}
