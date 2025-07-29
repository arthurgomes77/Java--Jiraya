package JavaJiraya.JavaCore.Minterfaces.dominio;

public class DatabaseLoader implements DataLoader, DataRemover{

    @Override
    public void load() {
        System.out.println("Carregando dados do banco de dados");
    }

    @Override
    public void remove() {
        System.out.println("Removendo banco de dados");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checando permissoes em DatabaseLoader");
    }
}
