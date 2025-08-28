package JavaJiraya.JavaCore.Minterfaces.dominio;

import JavaJiraya.JavaCore.Npolimorfismo.dominio.Produto;

public class Televisao  {
    public static final double IMPOSTO_PORCENTAGEM = 0.21;
    private Double valor;

    public Double calcularImpostosos() {
        System.out.println("Calculando imposto da televisao");
        return this.valor * IMPOSTO_PORCENTAGEM;
    }
}
