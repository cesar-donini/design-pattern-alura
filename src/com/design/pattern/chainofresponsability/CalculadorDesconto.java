package com.design.pattern.chainofresponsability;

import com.design.pattern.model.Orcamento;

public class CalculadorDesconto {

	public double calculaDesconto(Orcamento orcamento) {
		SemDesconto semDescontoService = new SemDesconto();
		DescontoMaisQuinhentosReais descontoMaisQuinhentosReaisService =
				new DescontoMaisQuinhentosReais(semDescontoService);

		DescontoMaisCincoItens cincoItensService =
				new DescontoMaisCincoItens(descontoMaisQuinhentosReaisService);				

		return cincoItensService.desconta(orcamento);
	}
	
}
