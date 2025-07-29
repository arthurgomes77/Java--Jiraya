package JavaJiraya.JavaCore.Npolimorfismo.teste;

import JavaJiraya.JavaCore.Minterfaces.dominio.Televisao;
import JavaJiraya.JavaCore.Npolimorfismo.dominio.Computador;
import JavaJiraya.JavaCore.Npolimorfismo.dominio.Tomate;
import JavaJiraya.JavaCore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTeste01 {
    public static void main(String[] args) {
        Computador computador = new Computador("MEU", 12000);
        Tomate tomate = new Tomate("Tahiti", 10);
        Televisao televisao = new Televisao("Samgung 50", 5000);

        CalculadoraImposto.calcularImposto(computador);
        System.out.println("==========================");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("==========================");
        CalculadoraImposto.calcularImposto(televisao);
    }
}
