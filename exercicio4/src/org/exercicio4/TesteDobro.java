package org.exercicio4;

import java.util.Scanner;

public class TesteDobro {

	public static void main(String[] args) {
		
		Dobro valor1 = new Dobro();
		
		Scanner ler = new Scanner(System.in);

	System.out.println("Número inteiro: ");
	 valor1.inteiro = ler.nextInt();
	 
	 valor1.calculaDobroInt(valor1.inteiro);
	 
	 System.out.println("Número real: ");
	 valor1.real = ler.nextDouble();
	 
	 valor1.calculaDobroReal(valor1.real);
	}

}
