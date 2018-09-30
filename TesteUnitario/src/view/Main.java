package view;

import model.USMoney;

public class Main {

	public static void main(String[] args) {
		USMoney valor1, valor2, soma;
		
		valor1 = new USMoney(10, 50);
		valor2 = new USMoney(5, 50);
		
		soma = valor1.plus(valor2);
		
		System.out.println(soma.toString());
		System.out.println(valor1.toString());
		System.out.println(valor2.toString());
	}

}
