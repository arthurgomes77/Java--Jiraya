package JavaJiraya.JavaCore.Npolimorfismo.teste;

import JavaJiraya.JavaCore.Npolimorfismo.repositorio.Repositorio;
import JavaJiraya.JavaCore.Npolimorfismo.servico.RepositorioArquivo;
import JavaJiraya.JavaCore.Npolimorfismo.servico.RepositorioBancoDeDados;
import JavaJiraya.JavaCore.Npolimorfismo.servico.RepositorioMemoria;

public class RespositorioTeste01 {
    public static void main(String[] args) {
        Repositorio repositorioBancoDeDados = new RepositorioMemoria();
        repositorioBancoDeDados.salvar();
    }
}
