package JavaJiraya.JavaCore.Minterfaces.dominio;

public interface DataLoader {
    public abstract void load();
    default void checkPermission(){
        System.out.println("Checando permissoes"); // Para criar metodos em interfaces sem obrigar seus filhos a herdarem o metodo
    }
}
