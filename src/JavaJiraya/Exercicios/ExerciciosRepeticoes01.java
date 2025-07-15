package JavaJiraya.Exercicios;

import java.util.Scanner;

public class ExerciciosRepeticoes01 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Qual é o seu salário anual(Euro)?");
        double salarioAnual = scanner.nextDouble();
        double taxes;
        double impostoAnual;
        if (salarioAnual <= 34712){
            taxes = 9.7 / 100;
            impostoAnual = taxes * salarioAnual;
        } else if (salarioAnual <= 68507){
            taxes = 37.35 / 100;
            impostoAnual = taxes * salarioAnual;
        } else {
            taxes = 49.5 / 100;
            impostoAnual = taxes * salarioAnual;
        }
        System.out.printf("O imposto que voce deverá pagar é de  E %s", impostoAnual);
    }
}
