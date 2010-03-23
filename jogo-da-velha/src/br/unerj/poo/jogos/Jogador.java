package br.unerj.poo.jogos;

public class Jogador {
	Peca[] pecas;
	Jogo jogo;
	
	private String valor;

	public Jogador() {
		super();
	}
	
	public Jogador(String string) {
		this();
		valor = string;
	}
	
	public String getValor() {
		return valor;
	}

}
