package com.design.pattern.state;

import com.design.pattern.model.Orcamento;

public class Reprovado implements EstadoOrcamento {

	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		throw new RuntimeException("Não há descontos para aplicar");
	}
	
	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("O orçamento não pode ser aprovado após ser reprovado");
	}

	@Override
	public void reprova(Orcamento orcamento) {
		throw new RuntimeException("O orçamento já está reprovado");
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		orcamento.setEstadoOrcamento(new Finalizado());
	}
}
