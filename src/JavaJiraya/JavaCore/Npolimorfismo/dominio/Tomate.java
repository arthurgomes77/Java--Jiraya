package JavaJiraya.JavaCore.Npolimorfismo.dominio;

public class Tomate extends Produto{
    public static final double IMPOSTO = 0.06;

    public Tomate(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImpostos() {
        System.out.println("Calculando impostos do Tomate");
        return this.valor * IMPOSTO;
    }
}
