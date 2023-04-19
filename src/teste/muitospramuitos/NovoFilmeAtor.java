package teste.muitospramuitos;

import infra.DAO;
import modelo.muitospramuitos.Ator;
import modelo.muitospramuitos.Filme;

public class NovoFilmeAtor {

	public static void main(String[] args) {
		
		Filme filme1 = new Filme("Star Wars", 8.9);
		Filme filme2 = new Filme("O Fugitivo", 8.1);
		Filme filme3 = new Filme("Indiana jones",8.5);
		Filme filme4 = new Filme("O Senhor dos aneis", 9.0);
		
		Ator ator1 = new Ator("Harrison Ford");
		Ator atriz1 = new Ator("Carrie Fisher");
		Ator ator2 = new Ator("Viggo Mortensen");
		filme1.adicionarAtor(ator1);
		filme1.adicionarAtor(atriz1);
		
		filme2.adicionarAtor(ator1);
		filme3.getAtores().add(ator1);
		filme4.getAtores().add(ator2);
		
		
		DAO<Filme> dao = new DAO<Filme>();
		
		dao.incluirAtomico(filme3);
		dao.incluirAtomico(filme4);
		
	}

}
