package br.com.caelum.financas.teste;

import javax.persistence.EntityManager;

import br.com.caelum.financas.modelo.Cliente;
import br.com.caelum.financas.modelo.Conta;
import br.com.caelum.financas.util.JPAUtil;

public class TestaContaCliente {
	
	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
        cliente.setNome("Leonardo");
        cliente.setEndereco("Rua Fulano, 123");
        cliente.setProfissao("Professor");

        
        Cliente cliente2 = new Cliente();
        cliente2.setNome("Leonardo");
        cliente2.setEndereco("Rua Fulano, 123");
        cliente2.setProfissao("Professor");
        
        Cliente cliente3 = new Cliente();
        cliente3.setNome("Leonardo");
        cliente3.setEndereco("Rua Fulano, 123");
        cliente3.setProfissao("Professor");
        
        Cliente cliente4 = new Cliente();
        cliente4.setNome("Leonardo");
        cliente4.setEndereco("Rua Fulano, 123");
        cliente4.setProfissao("Professor");
        
        Cliente cliente5 = new Cliente();
        cliente5.setNome("Leonardo");
        cliente5.setEndereco("Rua Fulano, 123");
        cliente5.setProfissao("Professor");
      
        Conta conta = new Conta();
        conta.setId(1);
        
        Conta conta2 = new Conta();
        conta2.setId(2);
        
        Conta conta3 = new Conta();
        conta3.setId(3);
        
        Conta conta4 = new Conta();
        conta4.setId(4);
        
        Conta conta5 = new Conta();
        conta5.setId(5);
        
        cliente.setConta(conta);
        cliente2.setConta(conta2);
        cliente3.setConta(conta3);
        cliente4.setConta(conta4);
        cliente5.setConta(conta5);
       
        EntityManager em = new JPAUtil().getEntityManager();
        em.getTransaction().begin();

        //em.persist(cliente);
        em.persist(cliente2);
        em.persist(cliente3);
        em.persist(cliente4);
        em.persist(cliente5);

        em.getTransaction().commit();  
		
	}
}
