package org.carros;

public class TesteVeiculos {

	public static void main(String[] args) {
		Veiculos carro = new Veiculos();
		
		carro.modelo = "Yaris";
		carro.marca = "Toyota";
		carro.ano = 2023;
		
		Veiculos carro2 = new Veiculos();
		carro2.modelo = "Strada";
		carro2.marca = "Fiat";
		carro2.ano = 2019;
		
		System.out.println("Carro: " + carro.modelo);
		System.out.println("Fabricante: " + carro.marca);
		System.out.println("Ano: " + carro.ano);
		
		System.out.println("Carro: " + carro2.modelo);
		System.out.println("Fabricante: " + carro2.marca);
		System.out.println("Ano: " + carro2.ano);

	}

}
