package com.design.pattern.templatemethod;

import com.design.pattern.model.Item;
import com.design.pattern.model.Orcamento;

public class IKCV extends TemplateCalculadorImposto {

	@Override
	protected double calculaMenorValor(Orcamento orcamento) {
		return orcamento.getValor() * 0.06;
	}

	@Override
	protected double calculaMaiorValor(Orcamento orcamento) {
		return orcamento.getValor() * 0.1;
	}

	@Override
	protected boolean deveCalcularMaiorValor(Orcamento orcamento) {
		return orcamento.getValor() > 500 && temItemMaiorQue100(orcamento);
	}
	
	private boolean temItemMaiorQue100(Orcamento orcamento) {
		for (Item item : orcamento.getItens()) {
			if (item.getValor() > 100) {
				return true;
			}
		}
		return false;
	}

}
