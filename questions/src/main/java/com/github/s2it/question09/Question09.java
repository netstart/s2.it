package com.github.s2it.question09;

public class Question09 {
	private int valor;

	private Question09 pair;
	private Question09 odd;

	public Question09(int valor) {
		this.valor = valor;
	}

	public void add(Question09 node) {
		if (node.valor % 2 == 0) {
			this.pair = node;
		} else {
			this.odd = node;
		}
	}

	public int sum() {
		return sum(this);
	}

	public static int sum(Question09 node) {
		if (node == null) {
			return 0;
		}

		return sum(node.pair) + sum(node.odd) + node.valor;
	}

}
