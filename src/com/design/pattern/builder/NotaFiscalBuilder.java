package com.design.pattern.builder;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import com.design.pattern.model.Item;
import com.design.pattern.model.NotaFiscal;
import com.design.pattern.observer.PosNotaFiscalExecutor;

public class NotaFiscalBuilder {

	private String razaoSocial;
	private String cnpj;
    private Calendar dataDeEmissao;
    private double valorBruto;
    private double impostos;
    private List<Item> itens;
    private String observacoes;
    private List<PosNotaFiscalExecutor> posNotaFiscalExecutors;    
    
    public NotaFiscalBuilder() {
    	this.valorBruto = 0;
    	this.impostos = 0;
    	this.itens = new ArrayList<>();
    	this.posNotaFiscalExecutors = new ArrayList<>();
	}
	
	public static NotaFiscalBuilder get() {
		return new NotaFiscalBuilder();
	}
	
	public NotaFiscalBuilder addAcaoPosSalvar(PosNotaFiscalExecutor posNotaFiscalSalva) {
		this.posNotaFiscalExecutors.add(posNotaFiscalSalva);
		return this;
	}
	
	public NotaFiscalBuilder withRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
		return this;
	}
	
	public NotaFiscalBuilder withCnpj(String cnpj) {
		this.cnpj = cnpj;
		return this;
	}
	
	public NotaFiscalBuilder withDataHoje() {
		this.dataDeEmissao = Calendar.getInstance();
		return this;
	}
	
	public NotaFiscalBuilder withItem(Item item) {
		this.itens.add(item);
		this.valorBruto += item.getValor();
		this.impostos = valorBruto * 0.05;
		return this;
	}
	
	public NotaFiscalBuilder withObservacao(String observacao) {
		this.observacoes = observacao;
		return this;
	}
	
	public NotaFiscal build() {
		
		for (PosNotaFiscalExecutor posNotaFiscalExecutor : posNotaFiscalExecutors) {
			posNotaFiscalExecutor.execute();
		}
		
		return new NotaFiscal(razaoSocial, cnpj, dataDeEmissao, valorBruto, impostos, itens, observacoes);
	}
}
