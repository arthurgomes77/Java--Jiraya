package JavaJiraya.JavaCore.Minterfaces.teste;

import JavaJiraya.JavaCore.Minterfaces.dominio.DatabaseLoader;
import JavaJiraya.JavaCore.Minterfaces.dominio.FileLoader;

public class DataLoaderTeste01 {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileloader = new FileLoader();
        databaseLoader.load();
        fileloader.load();
        System.out.println("-----------------------");
        databaseLoader.remove();
        fileloader.remove();
        System.out.println("-----------------------");
        databaseLoader.checkPermission();
        fileloader.checkPermission();
    }
}
