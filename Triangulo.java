//Desenvolvido por Rodrigo Brito

package Triangulo;
import java.util.*;
public class Triangulo {
	
	//variaveis
	private int base, altura, total;
	
	//Construtor
	public Triangulo(int base, int altura, int total) {
		
		this.base = base;
		this.altura = altura;
		this.total = total;
	}
	
	//Getters & Setters
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
	
	//método que calcula a área
	void calculaBase(Scanner scan) {
		
		System.out.println("----------------------------");
		System.out.println("Digite o valor da base do triangulo:");
		base = scan.nextInt();
		System.out.println("Digite a altura do triangulo: ");
		altura = scan.nextInt();
		total = (base * altura) / 2;
		System.out.println("O total da área do triangulo é " + total);
	}
}
