package JavaJiraya.JavaCore.BintroducaoMetodos.dominio;

public class Calculadora {
    public void somaDoisNumeros(){ // Void - não há retorno, apenas mostra o "resulta" do metodo
        System.out.println(10 + 10);
    }
    public void subtraiDoisNumeros(){
        System.out.println(21 - 2);
    }
    public void multiplicaDoisNumeros(int number1, int number2){
        System.out.println(number2 * number1);
    }
    public double divideDoisNumeros(double num1, double num2){ // Pode armazenar o resultado em algum lugar, por isso não se usa o void
        if (num2 == 0){
            return 0;
        }
        return num1/num2;
    }

    public double divideDoisNumeros02(double num1, double num2){ // Pode armazenar o resultado em algum lugar, por isso não se usa o void
        if (num2 != 0){
            return num1/num2;
        }
        return 0;
    }

    public void imprimeDivisaoDeDoisNumeros(double num1, double num2){ // O uso do retorno força o encerramento do IF, sem passar o código para as linhas de baixo...
        if (num2 == 0){
            System.out.println("Não existe divisão por zero");
            return;

        }
        System.out.println(num1/num2);
    }
    public void alteraDoisNumeros(int numero1, int numero2){
        numero1 = 99;
        numero2 = 33;
        System.out.println("Dentro do alteraDoisNumeros");
        System.out.println("Num1 " + numero1);
        System.out.println("Num2 " + numero2);
    }
}
