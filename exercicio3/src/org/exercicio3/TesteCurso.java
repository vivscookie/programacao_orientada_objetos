package org.exercicio3;
import java.util.Scanner;
public class TesteCurso {
	public static void main (String[] args) {
		Curso curso1 = new Curso ();
		Scanner entrada = new Scanner(System.in);
		String nomec;
		double valorc;
		
		System.out.println("Digite o nome do curso ");
		nomec = entrada.nextLine();
		
		curso1.exibeMensagem(nomec);
		
		System.out.println("Digite o valor da mensalidade ");
		valorc = entrada.nextDouble();
		
		curso1.exibeMensalidade(valorc);
	}
}
