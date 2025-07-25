package JavaJiraya.JavaCore.Kenum.teste;

import JavaJiraya.JavaCore.Kenum.dominio.Cliente;
import JavaJiraya.JavaCore.Kenum.dominio.Cliente.TipoPagamento;
import JavaJiraya.JavaCore.Kenum.dominio.TipoCliente;

public class ClienteTeste01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Arthur", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        Cliente cliente2 = new Cliente("Bruna", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);

        System.out.println(cliente1);
        System.out.println(cliente2);

    }
}
