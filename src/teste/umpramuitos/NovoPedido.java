package teste.umpramuitos;

import infra.DAO;
import modelo.basico.Produto;
import modelo.umpramuitos.ItemPedido;
import modelo.umpramuitos.Pedido;

public class NovoPedido {

	public static void main(String[] args) {
		
		DAO<Object> dao = new DAO<>();
		
		Pedido pedido = new Pedido();
		Produto prod = new Produto("Playstation", 4750.00);
		ItemPedido item = new ItemPedido(pedido, prod, 1);
		
		dao.abriT()
		.incluir(prod)
		.incluir(pedido)
		.incluir(item)
		.fechaT()
		.fechar();
	}

}
