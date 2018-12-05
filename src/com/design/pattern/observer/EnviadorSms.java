package com.design.pattern.observer;

public class EnviadorSms implements PosNotaFiscalExecutor {

	@Override
	public void execute() {
		System.out.println("enviando sms nf");		
	}
	
}
