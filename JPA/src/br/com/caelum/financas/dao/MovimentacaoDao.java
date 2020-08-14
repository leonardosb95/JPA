package br.com.caelum.financas.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.caelum.financas.modelo.Conta;
import br.com.caelum.financas.modelo.TipoMovimentacao;
import br.com.caelum.financas.util.JPAUtil;

public class MovimentacaoDao {

	private EntityManager em = new JPAUtil().getEntityManager();

	public List<Double> getMediasPorDia(TipoMovimentacao saida, Conta conta) {

		try {
			
			TypedQuery<Double> query = em.createNamedQuery("MediasPorDiaETipo", Double.class);
			
			query.setParameter("pConta", conta);
			query.setParameter("pTipo", saida);
			
			List<Double> medias = (List<Double>) query.getResultList();
			
			
			return medias;
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}

	

	}

}
