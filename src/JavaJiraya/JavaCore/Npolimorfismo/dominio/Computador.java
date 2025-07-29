package JavaJiraya.JavaCore.Npolimorfismo.dominio;

public class Computador extends Produto{
    public static final double IMPOSTO_PORCENTAGEM = 0.21;
    public Computador(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public Double calcularImposto() {
        System.out.println("Calculando imposto do computador");
        return this.valor * IMPOSTO_PORCENTAGEM;
    }

}
