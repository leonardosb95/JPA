package br.com.caelum.financas.teste;

import javax.persistence.EntityManager;

import br.com.caelum.financas.modelo.Categoria;
import br.com.caelum.financas.util.JPAUtil;

public class TesteCategoria {

	
	public static void main(String[] args) {
		
		Categoria categoria= new Categoria();
		categoria.setNome("Futebol");
		categoria.setEndereco("Morumbi");
		categoria.setProfissao("Jogador de futebol");
		
		EntityManager em=new JPAUtil().getEntityManager();
		em.getTransaction().begin();
		em.persist(categoria);
		em.getTransaction().commit();
		
		
		
		
		
	}
	
}
