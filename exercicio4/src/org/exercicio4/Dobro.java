package org.exercicio4;

public class Dobro {
	public int inteiro;
	public double real;
	
	public void calculaDobroInt(int inteiro){
		System.out.println("Dobro: " + (inteiro*2));
	}
	
	public void calculaDobroReal(double real) {
		System.out.printf("Dobro: %.2f", (real*2));
	}
}
