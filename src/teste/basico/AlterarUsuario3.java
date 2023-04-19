package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AlterarUsuario3 {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Usuario usuario = em.find(Usuario.class, 4L);
		em.detach(usuario);	//tirando o usuario de estado gerenciado
		System.out.println("Nome do usuario: " + usuario.getNome());
		
		usuario.setNome("Thainá Lisboa"); 
		
		System.out.println("O nome foi alterado para: " + usuario.getNome());
		
		em.merge(usuario); //só sera alterado no banco de dados se houver um merge
		
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}

}
