package com.design.pattern.templatemethod;

import com.design.pattern.model.Item;
import com.design.pattern.model.Orcamento;

public class Main {

	public static void main(String[] args) {

		Orcamento orcamento = new Orcamento(500);
		
		IKCV ikcv = new IKCV();
		ICPP icpp = new ICPP();
		
		System.out.println(ikcv.calcula(orcamento));
		System.out.println(icpp.calcula(orcamento));
		
		orcamento = new Orcamento(800);
		orcamento.add(new Item("Item 1", 800));
		
		System.out.println(ikcv.calcula(orcamento));
		System.out.println(icpp.calcula(orcamento));
		
	}

}
