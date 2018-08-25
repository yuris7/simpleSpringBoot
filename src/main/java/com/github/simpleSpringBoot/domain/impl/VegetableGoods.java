package com.github.simpleSpringBoot.domain.impl;

import java.math.BigDecimal;

import com.github.simpleSpringBoot.domain.Goods;

public class VegetableGoods implements Goods{

	@Override
	public String getName() {
		return "5 Ivo Bobul " + super.toString();
	}

	@Override
	public BigDecimal  getPrice() {
		return BigDecimal.valueOf(8.9);
	}

	@Override
	public Integer getWeight() {
		return 900;
	}
	
	public String sayHello() {
		return "Bubble";
	}

	@Override
	public String toString() {
		return sayHello() + " Tratata " + getName();
	}
	
}
