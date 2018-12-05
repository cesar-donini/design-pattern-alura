package com.design.pattern.chainofresponsability;

import com.design.pattern.model.Orcamento;

public class DescontoMaisQuinhentosReais implements Desconto {

	private Desconto proximoDescontoService;
	
	public DescontoMaisQuinhentosReais(Desconto proximoDescontoService) {
		super();
		this.proximoDescontoService = proximoDescontoService;
	}

	@Override
	public double desconta(Orcamento orcamento) {

		if (orcamento.getValor() > 500) {
			return orcamento.getValor() * 0.07;
		}
		
		return proximoDescontoService.desconta(orcamento);
	}
	
}
