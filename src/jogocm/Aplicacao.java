package jogocm;

import jogocm.modelo.Tabuleiro;
import jogocm.visao.TabuleiroConsole;

public class Aplicacao {
    public static void main(String[] args) {


        Tabuleiro tabuleiro = new Tabuleiro(6,6,6);
        new TabuleiroConsole(tabuleiro);
    }
}
