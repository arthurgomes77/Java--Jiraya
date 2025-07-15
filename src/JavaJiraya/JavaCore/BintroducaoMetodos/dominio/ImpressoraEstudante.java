package JavaJiraya.JavaCore.BintroducaoMetodos.dominio;

public class ImpressoraEstudante {
    public void imprimir(Estudante estudante){
        System.out.println("\nEstudante 02");

        estudante.nome = "Gohan";

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}
