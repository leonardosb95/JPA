package br.com.caelum.financas.teste;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import br.com.caelum.financas.modelo.Conta;

public class TesteRelatorioDasMovimentacoes {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("alura");
		EntityManager em=emf.createEntityManager();
		
		String jpql="select c from Conta c left join fetch c.movimentacoes";
		
		TypedQuery<Conta> query=em.createQuery(jpql,Conta.class);
		
		List<Conta> contas=query.getResultList();//Lista de contas
		
		for (Conta conta : query.getResultList()) {
			System.out.println("Titular "+conta.getTitular());
			System.out.println("Agencia "+conta.getAgencia());
			System.out.println("Numero "+conta.getNumero());
			
		}
		
		
		
		
		
		
		

	}

}
