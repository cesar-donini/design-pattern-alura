package com.design.pattern.chainofresponsability;

import com.design.pattern.model.Item;
import com.design.pattern.model.Orcamento;

public class Main {

	public static void main(String[] args) {
		
		CalculadorDesconto calculadorDescontoService = new CalculadorDesconto();
				
		Orcamento orcamento = new Orcamento(500);
		orcamento.add(new Item("Item 1", 50));
		orcamento.add(new Item("Item 2", 50));
		orcamento.add(new Item("Item 3", 100));
		orcamento.add(new Item("Item 4", 100));
		orcamento.add(new Item("Item 5", 100));
		orcamento.add(new Item("Item 6", 100));
		
		double desconto = calculadorDescontoService.calculaDesconto(orcamento);
		
		System.out.println(desconto);
		
		orcamento = new Orcamento(700);
		
		desconto = calculadorDescontoService.calculaDesconto(orcamento);
		
		System.out.println(desconto);
		
		orcamento = new Orcamento(50);
		
		desconto = calculadorDescontoService.calculaDesconto(orcamento);
		
		System.out.println(desconto);
		
	}
	
}
