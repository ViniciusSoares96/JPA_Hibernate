package teste.heranca;

import infra.DAO;
import modelo.heranca.Aluno;
import modelo.heranca.AlunoBolsista;

public class NovoAluno {

	public static void main(String[] args) {
		DAO<Aluno> alunoDAO = new DAO<>();
		
		Aluno Vinicius = new Aluno(20201014040041L, "Vinicius Vasconcelos");
		AlunoBolsista Antonio = new AlunoBolsista(20211014040024L, "Antonio Junior", 100000);
		
		alunoDAO.abriT().incluir(Antonio).incluir(Vinicius).fechaT().fechar();
		
	}

}
