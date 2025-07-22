package JavaJiraya.JavaCore.Gassociacao.dominio;

public class Escola {
    private String nome;
    private Professor[] professores;

    public Professor[] getProfessor() {
        return professores;
    }

    public Escola(String nome, Professor[] professores) {
        this.nome = nome;
        this.professores = professores;
    }

    public void imprimir(){
        System.out.println(this.nome);
        if (professores == null){
            return;
        }
        for (Professor professor : professores) {
            System.out.println(professor.getNome());
        }

    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }



    public void setProfessor(Professor[] professor) {
        this.professores = professor;
    }

    public Escola(String nome) {
        this.nome = nome;
    }
}
