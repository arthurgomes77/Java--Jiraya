package JavaJiraya.JavaCore.BintroducaoMetodos.teste;

import JavaJiraya.JavaCore.BintroducaoMetodos.dominio.Calculadora;

public class CalculadoraTeste03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.divideDoisNumeros(20,2);
        System.out.println(result);
        calculadora.imprimeDivisaoDeDoisNumeros(20,0);
    }
}
