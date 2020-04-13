package com.uds.teste.pizzaria.domain;

import org.junit.Test;

import com.uds.teste.pizzaria.domain.strategy.Imposto;
import com.uds.teste.pizzaria.domain.strategy.ImpostoCeara;
import com.uds.teste.pizzaria.domain.strategy.StrategyImposto;

public class StrategyTest {

	@Test
	public void test_() {

		Imposto imposto = new ImpostoCeara();
		StrategyImposto strategyImposto = new StrategyImposto(imposto);
		final int x = strategyImposto.calcular();
		System.out.println(x);
	}
}
