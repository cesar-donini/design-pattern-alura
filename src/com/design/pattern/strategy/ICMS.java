package com.design.pattern.strategy;

import com.design.pattern.model.Orcamento;

public class ICMS extends Imposto {

	public ICMS(Imposto outroImposto) {
		super(outroImposto);
	}
	
	public ICMS() {}
	
	@Override
	public double calcula(Orcamento orcamento) {
		return 0.05 * orcamento.getValor() + 50 + calculaOutroImposto(orcamento);
	}

}
