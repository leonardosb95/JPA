package br.com.caelum.financas.util;

import javax.persistence.EntityManager;

import br.com.caelum.financas.modelo.Conta;

public class TesteBuscaConta {
	
	public static void main(String[] args) {
		
		EntityManager em= new JPAUtil().getEntityManager();
		em.getTransaction().begin();
		
		
		Conta conta=em.find(Conta.class, 1);//Buscar a conta de id 1
		
		System.out.println(conta.getTitular());
		
		em.getTransaction().commit();
		
		
	}
	
	
	

}
