package JavaJiraya.JavaCore.Oexceptions.exception.teste;

public class ExceptionTeste02 {
    public static void main(String[] args) {

        System.out.println(divisao(1, 0));
    }
    private static int divisao(int a, int b){
        if (b == 0){
            throw new IllegalArgumentException("Argumento inválido, não dividir por 0");
        }
        return a/b;
    }
}
