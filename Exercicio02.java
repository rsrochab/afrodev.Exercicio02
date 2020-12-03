package Triangulo;
import java.util.*;
//Desenvolvido por Rodrigo Brito
public class Exercicio02 {

	
	public static void main(String[] args) {
		//Criando objetos e instanciando o método da classe Triangulo
		Triangulo t1 = new Triangulo();
		Scanner scan = new Scanner(System.in);
		t1.calculaBase(scan);
		
		Triangulo t2 = new Triangulo();
		t2.calculaBase(scan);
		
		Triangulo t3 = new Triangulo();
		t3.calculaBase(scan);
		
		//Exibindo resultado final para o usuário
		System.out.println("----------------------------");
		System.out.println("RESULTADO FINAL");
		System.out.println(" A área do primeiro triangulo é: " + t1.getTotal() + 
				" \n A área do segundo triangulo é: " + t2.getTotal() + 
				" \n A área do terceiro triangulo é: " + t3.getTotal());
		System.out.println("----------------------------");
	}
}
