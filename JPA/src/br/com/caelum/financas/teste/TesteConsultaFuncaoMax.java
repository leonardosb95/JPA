package br.com.caelum.financas.teste;

import java.math.BigDecimal;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.caelum.financas.modelo.Conta;
import br.com.caelum.financas.modelo.TipoMovimentacao;
import br.com.caelum.financas.util.JPAUtil;

public class TesteConsultaFuncaoMax {

	public static void main(String[] args) {
		
		Conta conta= new Conta();
		conta.setId(3);
		
		
		EntityManager em = new JPAUtil().getEntityManager();
		
		String jpql = "select max(m.valor) from Movimentacao m where m.conta = :pConta" + " and m.tipo = :pTipo";

		Query query = em.createQuery(jpql);
		query.setParameter("pConta", conta);
		query.setParameter("pTipo", TipoMovimentacao.SAIDA);
		
		
		BigDecimal max = (BigDecimal)query.getSingleResult();

		System.out.println("O maior gasto é: " + max);

		em.getTransaction().commit();
		

		em.close();
	}
	
}
