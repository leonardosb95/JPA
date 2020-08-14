package br.com.caelum.financas.teste;

import javax.persistence.EntityManager;

import br.com.caelum.financas.modelo.Conta;
import br.com.caelum.financas.util.JPAUtil;

public class TesteConta {

	public static void main(String[] args) {
		
		Conta conta = new Conta();
		//conta.setId(1);
		conta.setTitular("Leonardo");
		conta.setBanco("Caixa Economica");
		conta.setAgencia("123");
		conta.setNumero("456");
		
		
		Conta conta2 = new Conta();
		//conta.setId(1);
		conta2.setTitular("Leonardo");
		conta2.setBanco("Caixa Economica");
		conta2.setAgencia("123");
		conta2.setNumero("456");
		
		Conta conta3 = new Conta();
		//conta.setId(1);
		conta3.setTitular("Leonardo");
		conta3.setBanco("Caixa Economica");
		conta3.setAgencia("123");
		conta3.setNumero("456");
		
		Conta conta4 = new Conta();
		//conta.setId(1);
		conta4.setTitular("Leonardo");
		conta4.setBanco("Caixa Economica");
		conta4.setAgencia("123");
		conta4.setNumero("456");
		
		Conta conta5 = new Conta();
		//conta.setId(1);
		conta5.setTitular("Leonardo");
		conta5.setBanco("Caixa Economica");
		conta5.setAgencia("123");
		conta5.setNumero("456");
		
		EntityManager manager= new JPAUtil().getEntityManager();
		
		manager.getTransaction().begin();//Inicia a transação
		//conta=manager.find(Conta.class,1);
		
		//manager.remove(conta);//Removed
		manager.persist(conta);
		manager.persist(conta2);
		manager.persist(conta3);
		manager.persist(conta4);
		manager.persist(conta5);
		manager.getTransaction().commit();//commita
		manager.close();//fecha as conexão
		
		
	}
	
	
	
	
}
