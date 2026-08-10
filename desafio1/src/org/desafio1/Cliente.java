package org.desafio1;

public class Cliente {
	public String nome;
	public int conta;
	public double saldo = 350;
	
	public void exibeSaldo (double deposito) {
		System.out.printf("Saldo: R$ %.2f\n", (saldo + deposito) );
	}
	
}
