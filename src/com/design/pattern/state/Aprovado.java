package com.design.pattern.state;

import com.design.pattern.model.Orcamento;

public class Aprovado implements EstadoOrcamento {

	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		orcamento.desconta(orcamento.getValor() * 0.02);
	}

	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("O orçamento já está aprovado");
	}

	@Override
	public void reprova(Orcamento orcamento) {
		throw new RuntimeException("O orçamento não pode ser reprovado após ser aprovado");
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		orcamento.setEstadoOrcamento(new Finalizado());
	}

}
