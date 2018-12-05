package com.design.pattern.chainofresponsability;

import com.design.pattern.model.Orcamento;

public class DescontoMaisCincoItens implements Desconto {

	private Desconto descontoService;
	
	public DescontoMaisCincoItens(Desconto descontoService) {
		super();
		this.descontoService = descontoService;
	}

	@Override
	public double desconta(Orcamento orcamento) {
		
		if (orcamento.getItens().size() > 5) {
			return orcamento.getValor() * 0.10;
		}
		
		return descontoService.desconta(orcamento);
	}
}
