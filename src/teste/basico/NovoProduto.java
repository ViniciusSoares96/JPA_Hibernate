package teste.basico;

import infra.DAO;
import modelo.basico.Produto;

public class NovoProduto {

	public static void main(String[] args) {
		
		DAO<Produto> dao = new DAO<>(Produto.class);
		
		Produto produto = new Produto("Notebook", 2984.90);
		
		dao.abriT().incluir(produto).fechaT().fechar();
		
		System.out.println("ID do produto : " + produto.getId());
	}
}
