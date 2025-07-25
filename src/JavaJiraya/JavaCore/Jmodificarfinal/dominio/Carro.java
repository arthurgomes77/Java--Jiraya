package JavaJiraya.JavaCore.Jmodificarfinal.dominio;

public class Carro { // Final aqui, nao deixa a Classe ser utilizada na herança
    private String nome;
    public static final double VELOCIDADE_LIMITE = 250; // Uppercase com underscore para viriaveis constantes (Quem não terão seus valores alterados)
    public final Comprador COMPRADOR = new Comprador();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
