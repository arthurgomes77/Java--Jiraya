package JavaJiraya.JavaCore.CsobrecargaMetodos.teste;

import JavaJiraya.JavaCore.Dconstrutores.dominio.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Arthur");
        anime.init("Naruto", "TV", 12, "Ação");
        anime.imprimir();
    }
}
