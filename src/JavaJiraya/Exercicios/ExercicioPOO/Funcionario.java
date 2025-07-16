package JavaJiraya.Exercicios.ExercicioPOO;

public class Funcionario {
    private String name;
    private int age;
    private double[] salarios;
    private double mediaSalarial;

    public void imprimirDados() {
        System.out.printf("Dados do Funcionário: %s \n", this.name);
        System.out.printf("Idade: %s \n", this.age);
        if (salarios != null) {
            for (int i = 0; i < salarios.length; i++) {
                System.out.printf("Salário %s - R$ %s\n", (i + 1), salarios[i]);
            }
        } else {
            return;
        }
        imprimeMediaSalarial();
    }

    public void imprimeMediaSalarial() {
        if (salarios == null){
            return;
        }
        for (double salario : salarios){
            mediaSalarial += salario;
        }
        mediaSalarial /= salarios.length;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public double getMediaSalarial() {
        return mediaSalarial;
    }
}
