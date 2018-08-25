package com.github.simpleSpringBoot.domain.impl;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

import com.github.simpleSpringBoot.domain.Goods;

public class Run {

	public static void main(String[] args) {
		Goods vegitableGoods = new VegetableGoods();
		
		Map<Integer, Goods> goodsList = new HashMap();
		
		goodsList.put(9,vegitableGoods);
		goodsList.put(5,vegitableGoods);
		goodsList.put(12,new VegetableGoods());
		goodsList.put(1,new VegetableGoods());
		goodsList.put(3, new MotoGoods());
		goodsList.put(7, new MotoGoods());
		
		for (Integer key : goodsList.keySet()) {
			System.out.println("key is: " + key + " value is: " + goodsList.get(key));
		}
	}

}
