package br.com.improving.demo.jackpot.processor;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

@Stateless
public class SomeTransactional {
	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
	public void doSomething() {
		
	}
}
