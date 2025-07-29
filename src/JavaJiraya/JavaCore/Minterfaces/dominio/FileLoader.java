package JavaJiraya.JavaCore.Minterfaces.dominio;

public class FileLoader implements DataLoader, DataRemover {

    @Override
    public void load() {
        System.out.println("Carregando um arquivo");
    }

    @Override
    public void remove() {
        System.out.println("Deletando dados de um arquivo");
    }
    @Override
    public void checkPermission() {
        System.out.println("Checando permissoes em FileLoader");
    }
}
