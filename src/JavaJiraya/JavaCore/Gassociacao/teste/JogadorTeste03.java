package JavaJiraya.JavaCore.Gassociacao.teste;

import JavaJiraya.JavaCore.Gassociacao.dominio.Jogador;
import JavaJiraya.JavaCore.Gassociacao.dominio.Time;

public class JogadorTeste03 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Arthur");
        Jogador jogador2 = new Jogador("Pele");
        Time time = new Time("Santos");

        Jogador[] jogadores = {jogador, jogador2};

        jogador.setTime(time);
        time.setJogadores(jogadores);

        System.out.println("=======Jogador==========");
        jogador.imprimir();
        System.out.println("=======Time==========");
        time.imprime();
    }
}
