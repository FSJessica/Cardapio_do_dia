package br.com.cardapio_do_dia;

import br.com.cardapio_do_dia.control.Controle;
import br.com.cardapio_do_dia.model.Alimento;

public class Principal {

	public static void main(String[] args) {
		Alimento alimento = Controle.criarAlimento("arroz", "carboidrato");
		alimento.mostraAlimento();
	}

}
