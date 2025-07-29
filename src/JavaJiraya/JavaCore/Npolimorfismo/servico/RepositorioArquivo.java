package JavaJiraya.JavaCore.Npolimorfismo.servico;

import JavaJiraya.JavaCore.Npolimorfismo.repositorio.Repositorio;

public class RepositorioArquivo implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em Repositorio Arquivo");
    }
}
