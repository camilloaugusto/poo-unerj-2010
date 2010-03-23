package br.unerj.poo.jogos;

public class Tabuleiro {
	Casa[][] casas;
	
	public Tabuleiro() {
		casas = new Casa[3][3];
		preencheTabuleiroComCasasVazias();
	}
	private void preencheTabuleiroComCasasVazias() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				casas[i][j] = new Casa(); 
			}
		}
	}
	public Casa getCasa(int x, int y) {
		return casas[x][y];
	}
	public void setCasa(int x, int y, Peca peca) {
		casas[x][y].setPeca(peca);
	}

}
