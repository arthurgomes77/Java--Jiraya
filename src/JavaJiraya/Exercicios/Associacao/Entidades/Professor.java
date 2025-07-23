package JavaJiraya.Exercicios.Associacao.Entidades;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminario;

    public Professor(String nome, String especialidade) {
        this.especialidade = especialidade;
        this.nome = nome;
    }

    public Professor(String nome, Seminario[] seminario, String especialidade) {
        this.nome = nome;
        this.seminario = seminario;
        this.especialidade = especialidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSeminario(Seminario[] seminario) {
        this.seminario = seminario;
    }

    public String getEspecialidade() {
        return especialidade;
    }


    public void imprimir(){
        System.out.println("=====PROFESSOR=====");
        System.out.printf("Professor : '%s' - Especialidade: %s\n", this.nome, this.especialidade);
        System.out.println("Ministrante nos Seminarios:");
        for (Seminario seminarios: seminario){
            System.out.println(seminarios.getTitulo());
        }
    }
}
