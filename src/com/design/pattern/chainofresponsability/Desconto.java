package com.design.pattern.chainofresponsability;

import com.design.pattern.model.Orcamento;

public interface Desconto {

	double desconta(Orcamento orcamento);
	
}
