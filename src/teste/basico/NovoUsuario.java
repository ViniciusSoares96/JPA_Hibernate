package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class NovoUsuario {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();
		
		Usuario novoUsuario = new Usuario("Thiago","thiago@email.com");
		Usuario novoUsuario2 = new Usuario("Stenio","stenio@email.com");
		Usuario novoUsuario3 = new Usuario("Jefersson","jefersson@email.com");
		Usuario novoUsuario4 = new Usuario("Taina","taina@email.com");
		Usuario novoUsuario5 = new Usuario("Roberta","roberta@email.com");
		
		em.getTransaction().begin();
		em.persist(novoUsuario);
		em.persist(novoUsuario2);
		em.persist(novoUsuario3);
		em.persist(novoUsuario4);
		em.persist(novoUsuario5);
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}
}
