package br.unerj.poo.jogos;

public class Jogo {
	Jogador[] jogadores;
	Tabuleiro tabuleiro;
	Dado[] dado;
	private Jogador vez;
	
	public Jogo() {
		tabuleiro = new Tabuleiro();
		jogadores = new Jogador[2];
		jogadores[0] = new Jogador("O");
		jogadores[1] = new Jogador("X");
		
		vez = jogadores[0];
	}
	
	public boolean jogar(int x, int y) {
		// a jogada so pode ser executada se a casa estiver 
		// vazia
		
		boolean jogadaEhValida = 
			tabuleiro.getCasa(x, y).isVazia(); 
		
		if (jogadaEhValida) {
			tabuleiro.setCasa(x, y, new Peca(vez));
		}
//aqui tinha um R que foi retirado
		
		return jogadaEhValida;
	}
	
	
}
