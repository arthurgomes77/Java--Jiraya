package JavaJiraya.JavaCore.BintroducaoMetodos.teste;

import JavaJiraya.JavaCore.BintroducaoMetodos.dominio.Estudante;
import JavaJiraya.JavaCore.BintroducaoMetodos.dominio.ImpressoraEstudante;

public class EstudanteTeste01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante01.nome = "Arthur";
        estudante01.idade = 20;
        estudante01.sexo = 'M';

        estudante02.nome = "Bruna";
        estudante02.idade = 19;
        estudante02.sexo = 'F';

//        System.out.println("Estudante 01");
//        System.out.println(estudante01.nome);
//        System.out.println(estudante01.idade);
//        System.out.println(estudante01.sexo);
//
//        System.out.println("\nEstudante 02");
//        System.out.println(estudante02.nome);
//        System.out.println(estudante02.idade);
//        System.out.println(estudante02.sexo);

        impressora.imprimir(estudante01);
        impressora.imprimir(estudante02);
    }
}
