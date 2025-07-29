package JavaJiraya.JavaCore.Minterfaces.dominio;

import JavaJiraya.JavaCore.Npolimorfismo.dominio.Produto;

public class Televisao extends Produto {
    public static final double IMPOSTO_PORCENTAGEM = 0.21;
    public Televisao(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public Double calcularImposto() {
        System.out.println("Calculando imposto da televisao");
        return this.valor * IMPOSTO_PORCENTAGEM;
    }
}
