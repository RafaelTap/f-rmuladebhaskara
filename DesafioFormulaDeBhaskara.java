package Desafios;

import java.util.Scanner;

public class DesafioFormulaDeBhaskara {
	
	public static void main(String[] args) {
		//equacão do segundo grau: ax² + bx + c = 0
		//fómula de Bhaskara: x = (- b +- raíz de b² - 4 * a *c)/2 * a 
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o valor a.");
		double a = entrada.nextDouble();
		
		System.out.println("Digite o valor b.");
		double b = entrada.nextDouble();
		
		System.out.println("Digite o valor c.");
		double c = entrada.nextDouble();
		
		var numero1 = -b;
		var numero2 = Math.pow(b, 2);
		var numero3 = 4 * a * c;
		var numero4 = numero2 - Math.signum(numero3);
		var numero5 = Math.sqrt(numero4); 
		var numero6 = numero1 + numero5; // x1
		var numero6a = numero1 - numero5; // x2
		var numero7 = 2 * a; 
		
		var resultadox1 = numero6 / numero7;
		System.out.printf("%s %.5f", "x'= ", resultadox1);
		
		var resultadox2 = numero6a / numero7;
		System.out.printf("%s %.5f ", "\nx''= ", resultadox2);

		
		entrada.close();
	}

}
