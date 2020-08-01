package jose.bieco.cm;

import jose.bieco.cm.modelo.Tabuleiro;
import jose.bieco.cm.visao.TabuleiroTerminal;

public class Aplicacao {

	public static void main(String[] args) {
		
		Tabuleiro tabuleiro = new Tabuleiro(6, 6, 3);
		new TabuleiroTerminal(tabuleiro);
	}
}
