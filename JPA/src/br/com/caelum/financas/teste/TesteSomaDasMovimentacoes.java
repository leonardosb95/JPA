package br.com.caelum.financas.teste;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.caelum.financas.util.JPAUtil;

public class TesteSomaDasMovimentacoes {
	
	
	public static void main(String[] args) {
		
		EntityManager em = new JPAUtil().getEntityManager();
		String jpql="select avg(m.valor) from Movimentacao m";
		
		TypedQuery<Double> query=em.createQuery(jpql,Double.class);
		Double somaDasMovimentacoes=query.getSingleResult();
		
		System.out.println("A soma das movimentacoes é "+somaDasMovimentacoes);
		
		em.getTransaction().commit();
		em.close();
		
		
	}

}
