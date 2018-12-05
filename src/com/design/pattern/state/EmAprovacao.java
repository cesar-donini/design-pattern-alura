package com.design.pattern.state;

import com.design.pattern.model.Orcamento;

public class EmAprovacao implements EstadoOrcamento {

	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		orcamento.desconta(orcamento.getValor() * 0.05);

	}

	@Override
	public void aprova(Orcamento orcamento) {
		orcamento.setEstadoOrcamento(new Aprovado());
	}

	@Override
	public void reprova(Orcamento orcamento) {
		orcamento.setEstadoOrcamento(new Reprovado());
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		throw new RuntimeException("O orçamento não pode ser finalizado antes de aprovado e reprovado");
	}

}
