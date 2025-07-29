package JavaJiraya.JavaCore.Npolimorfismo.servico;

import JavaJiraya.JavaCore.Npolimorfismo.repositorio.Repositorio;

public class RepositorioBancoDeDados implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em Banco de dados");
    }
}
