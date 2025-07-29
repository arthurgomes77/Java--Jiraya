package JavaJiraya.JavaCore.Npolimorfismo.teste;

import JavaJiraya.JavaCore.Npolimorfismo.dominio.Computador;
import JavaJiraya.JavaCore.Npolimorfismo.dominio.Produto;
import JavaJiraya.JavaCore.Npolimorfismo.dominio.Tomate;
import JavaJiraya.JavaCore.Npolimorfismo.servico.CalculadoraImposto;

import javax.swing.*;

public class ProdutoTeste03 {
    public static void main(String[] args) {
        Produto produto = new Computador("Intel I5", 1200);
        Tomate tomate = new Tomate("Himalaia", 20);
        Tomate.setDataValidade("12/07/2025");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("========================");
        CalculadoraImposto.calcularImposto(produto);
    }
}
