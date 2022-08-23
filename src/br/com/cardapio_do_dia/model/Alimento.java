package br.com.cardapio_do_dia.model;

public class Alimento {
	
	public String nome;
	public String categoria;
	public Float valorNutricional;
	
	public void mostraAlimento() {
		System.out.println("O alimento " + nome + " é da categoria " + categoria);
	}
	
}
