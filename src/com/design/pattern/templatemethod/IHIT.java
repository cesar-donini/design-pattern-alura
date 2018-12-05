package com.design.pattern.templatemethod;

import com.design.pattern.model.Item;
import com.design.pattern.model.Orcamento;

public class IHIT extends TemplateCalculadorImposto {

	@Override
	protected double calculaMenorValor(Orcamento orcamento) {
		return orcamento.getValor() * orcamento.getItens().size() / 100;
	}

	@Override
	protected double calculaMaiorValor(Orcamento orcamento) {
		return orcamento.getValor() * 0.13 + 100;
	}

	@Override
	protected boolean deveCalcularMaiorValor(Orcamento orcamento) {
		
		for (Item item : orcamento.getItens()) {
			if (temItemIgual(item, orcamento)) {
				return false;
			}
		}
		
		return true;
	}

	private boolean temItemIgual(Item item, Orcamento orcamento) {
		return orcamento.getItens().stream()
				.filter(i -> i.getNome().equals(item.getNome()))
				.findFirst().isPresent();
	}

}
