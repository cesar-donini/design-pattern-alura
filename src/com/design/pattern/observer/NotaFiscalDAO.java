package com.design.pattern.observer;

public class NotaFiscalDAO implements PosNotaFiscalExecutor {

	@Override
	public void execute() {
		System.out.println("Salvando nf");		
	}

}
