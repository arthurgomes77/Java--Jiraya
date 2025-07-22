package JavaJiraya.JavaCore.Gassociacao.teste;

import JavaJiraya.JavaCore.Gassociacao.dominio.Escola;
import JavaJiraya.JavaCore.Gassociacao.dominio.Professor;

public class Escola01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Arthur");
        Professor[] professores = {professor1};
        Escola escola = new Escola("FIAP", professores);

        escola.imprimir();
    }
}
