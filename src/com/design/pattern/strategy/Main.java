package com.design.pattern.strategy;

import com.design.pattern.model.Orcamento;

public class Main {

	public static void main(String[] args) {		

		Orcamento orcamento = new Orcamento(60);
		
		Imposto icms = new ICMS();
		Imposto iss = new ISS();
		Imposto iccc = new ICCC();
		
		CalculadorDeImpostos calculadorDeImpostos = new CalculadorDeImpostos();
		
		calculadorDeImpostos.calculaImposto(orcamento, icms);
		calculadorDeImpostos.calculaImposto(orcamento, iss);
		calculadorDeImpostos.calculaImposto(orcamento, iccc);
		
	}
	
}
