package org.exercicio;

public class TesteAula {

	public static void main(String[] args) {
		//instância da Classe Aula1 = criar um objeto
		Aula1 aula = new Aula1();
		
		aula.nome = "Lucas";
		aula.disciplina = "POO";
		aula.qtd_aulas = 80;
		
		System.out.println("Nome: " + aula.nome);
		System.out.println("Disciplina: " + aula.disciplina);
		System.out.println("Quantidade de aulas: " + aula.qtd_aulas);
		
		aula.exibeMensagem();
	}

}
