package com.design.pattern.templatemethod;

import com.design.pattern.model.Orcamento;

public class ICPP extends TemplateCalculadorImposto {

	@Override
	protected double calculaMenorValor(Orcamento orcamento) {
		return orcamento.getValor() * 0.05;
	}

	@Override
	protected double calculaMaiorValor(Orcamento orcamento) {
		return orcamento.getValor() * 0.07;
	}

	@Override
	protected boolean deveCalcularMaiorValor(Orcamento orcamento) {
		return orcamento.getValor() > 500;
	}

}
