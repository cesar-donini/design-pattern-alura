package com.design.pattern.chainofresponsability;

import com.design.pattern.model.Orcamento;

public class SemDesconto implements Desconto {
	
	@Override
	public double desconta(Orcamento orcamento) {
		return 0;
	}
}
