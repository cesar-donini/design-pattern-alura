package com.design.pattern.model;

import java.util.ArrayList;
import java.util.List;

import com.design.pattern.state.EmAprovacao;
import com.design.pattern.state.EstadoOrcamento;

public class Orcamento {

	private double valor;
	private List<Item> itens;
	private EstadoOrcamento estadoOrcamento;
	
	public Orcamento(double valor) {
		this.valor = valor;
		this.itens = new ArrayList<>();
		this.estadoOrcamento = new EmAprovacao();
	}
	
	public List<Item> getItens() {
		return itens;
	}
	
	public double getValor() {
		return valor;
	}
	
	public void setEstadoOrcamento(EstadoOrcamento estadoOrcamento) {
		this.estadoOrcamento = estadoOrcamento;
	}

	public void desconta(double valor) {
		this.valor -= valor;
	}
	
	public void add(Item item) {
		this.itens.add(item);
	}
	
	public void aplicaDescontoExtra() {
		this.estadoOrcamento.aplicaDescontoExtra(this);
	}
	
	public void aprova() {
		estadoOrcamento.aprova(this);
	}
	
	public void reprova() {
		estadoOrcamento.reprova(this);
	}
	
	public void finaliza() {
		estadoOrcamento.finaliza(this);
	}
}
