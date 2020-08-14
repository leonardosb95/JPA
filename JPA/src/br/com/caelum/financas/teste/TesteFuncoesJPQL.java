package br.com.caelum.financas.teste;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import br.com.caelum.financas.dao.MovimentacaoDao;
import br.com.caelum.financas.modelo.Conta;
import br.com.caelum.financas.modelo.TipoMovimentacao;
import br.com.caelum.financas.util.JPAUtil;

public class TesteFuncoesJPQL {

	public static void main(String[] args) {

		
		MovimentacaoDao dao= new MovimentacaoDao();
		
		Conta conta= new Conta();
		conta.setId(3);
		
		//String jpql = "select sum(m.valor) from Movimentacao m where m.conta = :pConta" + " and m.tipo = :pTipo";
		
		
		
		List<Double> medias= dao.getMediasPorDia(TipoMovimentacao.SAIDA,conta);

		//Query query = em.createQuery(jpql);
		
		
		//BigDecimal soma = (BigDecimal)query.getSingleResult();
		
		//Double media = (Double)query.getSingleResult();
		
		

		//System.out.println("A média é: " + media);
		
		System.out.println("A média do dia 26 é: " + medias.get(0));
		

		

	}

}
