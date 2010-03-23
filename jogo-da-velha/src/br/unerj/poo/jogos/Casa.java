package br.unerj.poo.jogos;

public class Casa {
	Peca peca;
	
	public boolean isVazia() {
		return peca == null;
	}
	
	public void setPeca(Peca p) {
		peca = p;
		p.setCasa(this);
	}
	
	public Peca getPeca() {
		return peca;
	}

}
