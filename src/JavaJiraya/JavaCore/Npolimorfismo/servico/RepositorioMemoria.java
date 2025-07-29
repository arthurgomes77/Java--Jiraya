package JavaJiraya.JavaCore.Npolimorfismo.servico;

import JavaJiraya.JavaCore.Npolimorfismo.repositorio.Repositorio;

public class RepositorioMemoria implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em Memoria");

    }
}
