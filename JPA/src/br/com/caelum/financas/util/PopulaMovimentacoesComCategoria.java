package br.com.caelum.financas.util;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Calendar;

import javax.persistence.EntityManager;

import br.com.caelum.financas.modelo.Categoria;
import br.com.caelum.financas.modelo.Conta;
import br.com.caelum.financas.modelo.Movimentacao;
import br.com.caelum.financas.modelo.TipoMovimentacao;
import br.com.caelum.financas.util.JPAUtil;

public class PopulaMovimentacoesComCategoria {

	public static void main(String[] args) {
		
		Categoria categoria1 = new Categoria();
        categoria1.setNome("viagem");

        Categoria categoria2 = new Categoria();
        categoria2.setNome("neg�cios");
        
        Conta conta= new Conta();
        conta.setId(2);
        
        Calendar amanha=Calendar.getInstance();
        amanha.add(Calendar.DAY_OF_MONTH, 1);
        
        
        
        
        Movimentacao movimentacao1 = new Movimentacao();
        movimentacao1.setData(Calendar.getInstance()); //hoje
        movimentacao1.setDescricao("Viagem � SP");
        movimentacao1.setTipo(TipoMovimentacao.SAIDA);
        movimentacao1.setValor(new BigDecimal("100.0"));
        movimentacao1.setCategorias(Arrays.asList(categoria1, categoria2));
        
        
        Movimentacao movimentacao2 = new Movimentacao();
        movimentacao2.setData(Calendar.getInstance()); // hoje
        movimentacao2.setDescricao("Viagem ao RJ");
        movimentacao2.setTipo(TipoMovimentacao.SAIDA);
        movimentacao2.setData(amanha);
        movimentacao2.setValor(new BigDecimal("300.0"));
        movimentacao2.setCategorias(Arrays.asList(categoria1, categoria2));//Adiciona as duas categorias na tabela movimenta��o
        
        

        EntityManager em=new JPAUtil().getEntityManager();
        em.getTransaction().begin();
        
        em.persist(categoria1); // Agora a 'categoria1' � Managed
        em.persist(categoria2); // Agora a 'categoria2' � Managed
        
        
        em.persist(movimentacao1);
        em.persist(movimentacao2);
        
        em.getTransaction().commit();    
        em.close();  
		
		
		
	}
	
	
}
