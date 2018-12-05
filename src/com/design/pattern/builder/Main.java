package com.design.pattern.builder;

import com.design.pattern.model.NotaFiscal;

public class Main {

	public static void main(String[] args) {

		NotaFiscal notaFiscal = NotaFiscalBuilder
			.get()
			.withRazaoSocial("Cesar Donini")
			.withCnpj("12.345.678/0001-00")
			.withDataHoje()
			.withObservacao("Observações")
			.withDataHoje()
			.build();
		
		System.out.println(notaFiscal);
		
	}

}
