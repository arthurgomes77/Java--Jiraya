package JavaJiraya.Exercicios.Associacao.Entidades;

public class Aluno {
    private String nome;
    private int idade;
    private Seminario[] seminario;

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Seminario[] getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario[] seminario) {
        this.seminario = seminario;
    }

    public void imprimir(){
        System.out.println("=====ALUNO=====");
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade() + "\n");
        if (seminario.length > 1){
            System.out.println("O aluno pode participar de apenas UM seminário...");
            return;
        }
        System.out.println("Aluno inscrito no Seminário: ");
        for (Seminario semarios : seminario){
            System.out.println(semarios.getTitulo());
        }
    }
}
