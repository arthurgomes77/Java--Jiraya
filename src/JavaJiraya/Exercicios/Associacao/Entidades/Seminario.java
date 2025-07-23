package JavaJiraya.Exercicios.Associacao.Entidades;

public class Seminario {
    private String titulo;
    private Aluno[] alunos;
    private Local local;
    private Professor professor;

    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    public Seminario(String titulo, Aluno[] alunos, Local local, Professor professor) {
        this.titulo = titulo;
        this.alunos = alunos;
        this.local = local;
    }

    public String getTitulo() {
        return titulo;
    }


    public void setLocal(Local local) {
        this.local = local;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public void setAluno(Aluno[] aluno) {
        this.alunos = aluno;
    }

    public void imprimir() {
        System.out.println("=====SEMINARIO=====");
        System.out.println("Nome: " + this.getTitulo());
        System.out.printf("Professor Responsavel: %s - Especialidade: %s\n\n", professor.getNome(), professor.getEspecialidade());
        System.out.println("Participantes: ");
        if (alunos.length == 0) {
            System.out.println("Seminário vazio...");
            return;
        }
        for (int i = 0; i < alunos.length; i++) {
                System.out.printf("%s. %s\n", (i + 1), alunos[i].getNome());
        }
        System.out.println("\nLocal: " + local.getEndereco() + "\n");

    }
}
