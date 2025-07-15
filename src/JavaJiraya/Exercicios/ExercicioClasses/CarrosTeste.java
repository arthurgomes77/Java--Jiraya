package JavaJiraya.Exercicios.ExercicioClasses;

public class CarrosTeste {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro2 = new Carro();

        carro.nome = "BMW";
        carro.modelo = "320i";
        carro.ano = 2024;

        carro2.nome = "Mercedes Benz";
        carro2.modelo = "CLS 300";
        carro2.ano = 2022;

        System.out.println("Marca: " + carro.nome + "\n Modelo: " + carro.modelo + "\n Ano de Fabricação: " + carro.ano);
        System.out.println("Marca: " + carro2.nome + "\n Modelo: " + carro2.modelo + "\n Ano de Fabricação: " + carro2.ano);
    }
}
