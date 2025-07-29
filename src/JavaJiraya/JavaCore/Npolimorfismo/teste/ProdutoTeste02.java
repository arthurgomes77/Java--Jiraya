package JavaJiraya.JavaCore.Npolimorfismo.teste;

import JavaJiraya.JavaCore.Npolimorfismo.dominio.Computador;
import JavaJiraya.JavaCore.Npolimorfismo.dominio.Produto;

public class ProdutoTeste02 {
    public static void main(String[] args) {
        Produto produto = new Computador("Intel I5", 1200);
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
    }
}
