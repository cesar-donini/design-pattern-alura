package com.design.pattern.templatemethod;

import com.design.pattern.model.Orcamento;
import com.design.pattern.strategy.Imposto;

public abstract class TemplateCalculadorImposto extends Imposto {

	public TemplateCalculadorImposto(Imposto outroImposto) {
		super(outroImposto);
	}
	
	public TemplateCalculadorImposto() {}
	
	@Override
	public final double calcula(Orcamento orcamento) {
		if (deveCalcularMaiorValor(orcamento)) {
			return calculaMaiorValor(orcamento);
		}
		return calculaMenorValor(orcamento);
	}

	protected abstract double calculaMenorValor(Orcamento orcamento);

	protected abstract double calculaMaiorValor(Orcamento orcamento);

	protected abstract boolean deveCalcularMaiorValor(Orcamento orcamento);

}
