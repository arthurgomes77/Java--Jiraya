package JavaJiraya.JavaCore.Dconstrutores.teste;

import JavaJiraya.JavaCore.CsobrecargaMetodos.dominio.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Naruto", "TV", 12, "Ação");
        anime.imprimir();
    }
}
