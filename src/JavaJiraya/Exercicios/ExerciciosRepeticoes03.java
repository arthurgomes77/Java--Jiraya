package JavaJiraya.Exercicios;

public class ExerciciosRepeticoes03 {
    public static void main(String[] args) {
        double valorTotal = 40000;
        double numeroParcelas;
        for (int parcelas = 1; parcelas < valorTotal; parcelas++) {
            double valorParcelas = valorTotal / parcelas;
            if (valorParcelas >= 1000){
                System.out.printf("Parcela %s, valor da parcela %s \n", parcelas, valorParcelas);
            }
            else {
                break; // Caso não utilize o break, a operação seria feita até o exibição do valor total
            }
            System.out.println("Fora do IF, mas dentro do FOR " + parcelas);
        }
    }
}
