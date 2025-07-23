package JavaJiraya.Exercicios.Associacao;

import JavaJiraya.Exercicios.Associacao.Entidades.Aluno;
import JavaJiraya.Exercicios.Associacao.Entidades.Local;
import JavaJiraya.Exercicios.Associacao.Entidades.Professor;
import JavaJiraya.Exercicios.Associacao.Entidades.Seminario;

public class DesafioTeste {
    public static void main(String[] args) {
        Professor professor = new Professor("Dojo", "Matematica");
        Aluno aluno = new Aluno("Arthur", 20);
        Aluno aluno2 = new Aluno("Bruna", 19);
        Local local =  new Local("Rua Marquês de Abrantes, 72");
        Seminario seminario1 = new Seminario("EspceX");
        Seminario seminario2 = new Seminario("Objetivo");
        Seminario seminario3 = new Seminario("Lumiere");
        Seminario[] seminariosProfessor = {seminario1, seminario2, seminario3};
        Seminario[] seminariosAluno = {seminario1};
        Aluno[] alunos = {aluno, aluno2};

        seminario1.setLocal(local);
        seminario1.setProfessor(professor);
        seminario1.setAluno(alunos);
        seminario1.imprimir();

        aluno.setSeminario(seminariosAluno);
        aluno.imprimir();

        professor.setSeminario(seminariosProfessor);
        professor.imprimir();
    }
}
