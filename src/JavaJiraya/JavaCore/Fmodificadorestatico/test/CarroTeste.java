package JavaJiraya.JavaCore.Fmodificadorestatico.test;

import JavaJiraya.JavaCore.Fmodificadorestatico.domain.Carro;

public class CarroTeste {
    public static void main(String[] args) {
        Carro c1 = new Carro("BMW", 280);
        Carro c2 = new Carro("Mercedes", 275);
        Carro c3 = new Carro("Audi", 290);
        Carro.setVelocidadeLimite(180);
//        Carro.velocidadeLimite = 180; // Afetara todos objetos criados a partir da classe Carro

        c1.imprime();
        c2.imprime();
        c3.imprime();
    }
}
