package br.unerj.poo.jogos;

public class Peca {
	private Casa casa;
	private Jogador jogador;
	
	public Peca(Jogador j) {
		jogador = j; 
	}
	public void setCasa(Casa c) {
		casa = c;
	}
	public Casa getCasa() {
		return casa;
	}
	public void setJogador(Jogador j){
		jogador = j;
	}
	public Jogador getJogador() {
		return jogador;
	}
	
}
