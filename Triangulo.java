package Triangulo;
//Desenvolvido por Rodrigo Brito

import java.util.Scanner;

public class Triangulo {

	int base;
	int altura;
	int total;

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
	
	void calculaBase(Scanner scan) {
		
		System.out.println("----------------------------");
		System.out.println("Digite o valor da base do triangulo:");
		base = scan.nextInt();
		System.out.println("Digite a altura do triangulo: ");
		altura = scan.nextInt();
	}
}
