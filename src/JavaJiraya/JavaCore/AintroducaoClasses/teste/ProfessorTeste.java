package JavaJiraya.JavaCore.AintroducaoClasses.teste;

import JavaJiraya.JavaCore.AintroducaoClasses.dominio.Professor;

public class ProfessorTeste {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "William";
        professor.idade = 32;
        professor.sexo = 'M';

        System.out.println("Nome: " + professor.nome + " Sexo: " + professor.sexo + " Idade: " + professor.idade);
    }

}
