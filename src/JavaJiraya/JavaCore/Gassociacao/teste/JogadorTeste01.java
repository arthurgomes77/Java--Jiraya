package JavaJiraya.JavaCore.Gassociacao.teste;

import JavaJiraya.JavaCore.Gassociacao.dominio.Jogador;

public class JogadorTeste01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pele");
        Jogador jogador2 = new Jogador("Neymar");
        Jogador jogador3 = new Jogador("Cafu");

        Jogador[] jogadores = {jogador1, jogador2, jogador3};
        for (Jogador jogador : jogadores){
            jogador.imprimir();
    }

    }
}
