package br.com.caelum.financas.teste;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.caelum.financas.modelo.Conta;
import br.com.caelum.financas.util.JPAUtil;

public class TesteTodasAsMovimentacoesDasContas {
	
	
	public static void main(String[] args) {
		
		EntityManager em = new JPAUtil().getEntityManager();
        em.getTransaction().begin();

        String jpql = "select distinct c from Conta c left join fetch c.movimentacoes";//Tira o comportamento Lazy, e junta a conta com a movimentação

        Query query = em.createQuery(jpql);
        
        List<Conta> todasAsContas = query.getResultList();//Pega o resultado da busca
        
        for (Conta conta : todasAsContas) {
            System.out.println("Titular: " + conta.getTitular());
            System.out.println("Movimentacoes: ");
            System.out.println(conta.getMovimentacoes());
        }
		
		
	}

}
