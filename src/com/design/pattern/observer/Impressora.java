package com.design.pattern.observer;

public class Impressora implements PosNotaFiscalExecutor {

	@Override
	public void execute() {
		System.out.println("imprimindo nf");		
	}
	
}
