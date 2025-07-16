package JavaJiraya.Exercicios.ExercicioPOO;

public class FuncionarioTeste {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setName("Arthur");
        funcionario.setAge(20);
        funcionario.setSalarios(new double[]{1000, 2000, 3000, 4000, 5000, 6000});


        funcionario.imprimirDados();
        System.out.println("\nMédia: R$ " + funcionario.getMediaSalarial());
    }
}
