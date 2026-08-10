package org.desafio1;
import java.util.Scanner;
public class TesteCliente {
	public static void main (String[] args) {
		
		Cliente cliente1 = new Cliente();
		Scanner entrada = new Scanner(System.in);
		cliente1.nome = "Lucas";
		cliente1.conta = 10067;
		double deposito;

		
		System.out.println("Quantidade depositada: ");
		deposito = entrada.nextDouble();
		
		cliente1.exibeSaldo(deposito);
	}

}