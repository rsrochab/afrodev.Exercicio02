package Triangulo;
import java.util.*;

public class Exercicio02 {

	
	public static void main(String[] args) {
		
		Triangulo t1 = new Triangulo();
		Scanner scan = new Scanner(System.in);
		t1.calculaBase(scan);
		
		Triangulo t2 = new Triangulo();
		t2.calculaBase(scan);
		
		Triangulo t3 = new Triangulo();
		t3.calculaBase(scan);
		
		System.out.println("----------------------------");
		System.out.println("RESULTADO FINAL");
		System.out.println(" A área do primeiro triangulo é: " + t1.getTotal() + 
				" \n A área do segundo triangulo é: " + t2.getTotal() + 
				" \n A área do terceiro triangulo é: " + t3.getTotal());
		System.out.println("----------------------------");
	}
}
