package JavaJiraya.JavaCore.Lclassesabstratas.test;

import JavaJiraya.JavaCore.Lclassesabstratas.dominio.Desenvolvedor;
import JavaJiraya.JavaCore.Lclassesabstratas.dominio.Gerente;

public class FuncionarioTeste01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Bruna", 5000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Arthur", 12000);
        System.out.println(gerente);
        System.out.println(desenvolvedor);
        gerente.imprime();
        desenvolvedor.imprime();
    }
}
