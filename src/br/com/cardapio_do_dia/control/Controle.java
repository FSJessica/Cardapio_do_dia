package br.com.cardapio_do_dia.control;

import br.com.cardapio_do_dia.model.Alimento;

public class Controle {
	
	public static Alimento criarAlimento(String nome, String categoria) {
		Alimento alimento = new Alimento();
		alimento.nome = nome;
		alimento.categoria = categoria;
		return alimento;
	}

}
