package com.design.pattern.observer;

import com.design.pattern.builder.NotaFiscalBuilder;

public class Main {

	public static void main(String[] args) {

		NotaFiscalBuilder.get()
			.addAcaoPosSalvar(new EnviadorEmail())
			.addAcaoPosSalvar(new EnviadorSms())
			.addAcaoPosSalvar(new Impressora())
			.addAcaoPosSalvar(new NotaFiscalDAO())
			.build();
		
	}

}
