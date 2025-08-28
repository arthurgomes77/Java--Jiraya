package JavaJiraya.JavaCore.Npolimorfismo.servico;

import JavaJiraya.JavaCore.Npolimorfismo.dominio.Computador;

public class CalcularImpostos {
    public void calcularImpostoComputador(Computador computador){
        System.out.println("Relátorio de impostos do computador");
        double imposto = computador.calcularImpostos();

    }
}
