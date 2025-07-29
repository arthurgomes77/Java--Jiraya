package JavaJiraya.JavaCore.Npolimorfismo.servico;

import JavaJiraya.JavaCore.Npolimorfismo.dominio.Produto;
import JavaJiraya.JavaCore.Npolimorfismo.dominio.Tomate;

public class CalculadoraImposto {
    public static void calcularImposto(Produto produto){
        System.out.println("Relatório de imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " + produto.getNome());
        System.out.println(produto.getValor());
        System.out.println("Imposto a ser pago: " + imposto);
        if (produto instanceof Tomate){ // Verifica se o produto passado por parametro realmente é uma instacia da classe que voce fez o Cast
            String dataVaidade = ((Tomate) produto).getDataValidade();
            System.out.println(dataVaidade);
        }
    }
}
