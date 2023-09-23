package br.com.aula.heranca.main;

import br.com.aula.heranca.model.CarroGasolina;

public class Main {
	public static void main(String[] args) {
		CarroGasolina carroGasolina = new CarroGasolina() ;
		carroGasolina.ligarCarro();
		carroGasolina.ligarCarro();
		carroGasolina.acelerarCarro();
		carroGasolina.setCombustivel(abastecerCarro);
		carroGasolina.setCor("Branco");
		
		
		
		
		
		
		
		
		
		
		
	
		System.out.println(calculaSomaDeDoisValores(10,20));
	}
	
 	// implemente um método que calcule 1 + 1;

	public static int calculaSomaDeDoisValores(int primeiroNumero, int segundoNumero) {
		return primeiroNumero + segundoNumero;
	}
				
	// Implemente um metodo que multiplique dois valores
	public static int calculaMultiplicacaoDeDoisValore(int primeiroNumero, int segundoNumero) {
		return primeiroNumero * segundoNumero;
	}
	
	
}
