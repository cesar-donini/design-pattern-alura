package com.design.pattern.strategy;

import com.design.pattern.model.Orcamento;

public class ICCC extends Imposto {

	public ICCC(Imposto outroImposto) {
		super(outroImposto);
	}

	public ICCC() {}
	
	@Override
	public double calcula(Orcamento orcamento) {
		
		if (orcamento.getValor() < 1000) {
			return orcamento.getValor() * 0.05;
		}
		
		if (orcamento.getValor() >= 1000
				&& orcamento.getValor() >= 3000) {
			return orcamento.getValor() * 0.07;
		}
		
		return orcamento.getValor() * 0.08 + 30;
	}

}
