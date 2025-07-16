package JavaJiraya.JavaCore.BintroducaoMetodos.teste;

import JavaJiraya.JavaCore.BintroducaoMetodos.dominio.Estudante;
import JavaJiraya.JavaCore.BintroducaoMetodos.dominio.ImpressoraEstudante;

public class EstudanteTeste02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "Arthur";
        estudante01.idade = 20;
        estudante01.sexo = 'M';

        estudante02.nome = "Pedro";
        estudante02.idade = 19;
        estudante02.sexo = 'F';

        estudante01.imprime();
        estudante02.imprime();
    }
}
