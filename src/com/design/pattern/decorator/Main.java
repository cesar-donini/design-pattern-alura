package com.design.pattern.decorator;

import com.design.pattern.model.Orcamento;
import com.design.pattern.strategy.ICMS;
import com.design.pattern.strategy.ISS;
import com.design.pattern.strategy.Imposto;

public class Main {

	public static void main(String[] args) {
		Imposto impostos = new ISS(new ICMS());

        Orcamento orcamento = new Orcamento(500.0);

        System.out.println(impostos.calcula(orcamento));
	}

}
