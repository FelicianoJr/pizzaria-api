package com.uds.teste.pizzaria.domain.strategy;

public class StrategyImposto {

	protected Imposto imposto;
	protected int x;

	public StrategyImposto(Imposto imposto) {
		this.imposto = imposto;
	}

	public int calcular() {
		return imposto.calcularImposto();
	}
}
