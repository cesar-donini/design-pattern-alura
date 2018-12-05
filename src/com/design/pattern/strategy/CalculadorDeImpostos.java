package com.design.pattern.strategy;

import com.design.pattern.model.Orcamento;

public class CalculadorDeImpostos {

	public void calculaImposto(Orcamento orcamento, Imposto imposto) {
		System.out.println("Valor do imposto: " + imposto.calcula(orcamento));
	}
	
}
