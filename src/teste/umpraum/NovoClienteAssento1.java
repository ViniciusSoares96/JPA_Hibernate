package teste.umpraum;

import infra.DAO;
import modelo.umpraum.Assento;
import modelo.umpraum.Cliente;

public class NovoClienteAssento1 {
	public static void main(String[] args) {
		Assento assento = new Assento("3D");
		Cliente cliente1 = new Cliente("Bruno", assento);
		
		DAO<Object> dao = new DAO<>();

		dao.abriT()
		.incluir(assento)
		.incluir(cliente1)
		.fechaT()
		.fechar();
	}
}
