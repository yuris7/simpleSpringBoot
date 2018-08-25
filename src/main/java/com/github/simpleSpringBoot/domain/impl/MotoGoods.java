package com.github.simpleSpringBoot.domain.impl;

import java.math.BigDecimal;

import com.github.simpleSpringBoot.domain.Goods;

public class MotoGoods implements Goods{

	@Override
	public String getName() {
		return "9 Jamakasi";
	}

	@Override
	public BigDecimal  getPrice() {
		return BigDecimal.valueOf(49);
	}

	@Override
	public Integer getWeight() {
		return 54;
	}
	
	public String sayNothing() {
		return "9";
	}
	
	@Override
	public String toString() {
		return "Moto: " + getName();
	}

}
