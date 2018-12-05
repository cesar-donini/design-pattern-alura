package com.design.pattern.strategy;

import java.util.Objects;

import com.design.pattern.model.Orcamento;

public abstract class Imposto {

	private Imposto outroImposto;

	public Imposto(Imposto outroImposto) {
		this.outroImposto = outroImposto;
	}
	
	public Imposto() {}
	
	public abstract double calcula(Orcamento orcamento);
	
	protected double calculaOutroImposto(Orcamento orcamento) {

		if (Objects.isNull(outroImposto)) {
			return 0;
		}
		
		return outroImposto.calcula(orcamento);
	}
	
}
