package com.design.pattern.observer;

public class EnviadorEmail implements PosNotaFiscalExecutor {

	@Override
	public void execute() {
		System.out.println("enviando email nf");		
	}
	
}
