package modelo.heranca;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE) /*juntar tudo numa só tabela deixando campos nulos*/
public class Aluno {
	
	@Id
	private Long matricula;
	
	private String nome;

	public Aluno() {
		super();
	}

	public Aluno(Long matricula, String nome) {
		super();
		this.matricula = matricula;
		this.nome = nome;
	}

	public Long getMatricula() {
		return matricula;
	}

	public void setMatricula(Long matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
}
