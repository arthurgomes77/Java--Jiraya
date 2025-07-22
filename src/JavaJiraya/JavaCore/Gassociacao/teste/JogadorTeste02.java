package JavaJiraya.JavaCore.Gassociacao.teste;

import JavaJiraya.JavaCore.Gassociacao.dominio.Jogador;
import JavaJiraya.JavaCore.Gassociacao.dominio.Time;

public class JogadorTeste02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Arthur");
        Time time1 = new Time("Santos FC");

        jogador1.setTime(time1);
        jogador1.imprimir();
    }
}
