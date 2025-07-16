package JavaJiraya.JavaCore.BintroducaoMetodos.dominio;

public class Pessoa {

    private String name;
    private int age;

    public void imprime(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    public void setName(String name) {
        if (name == null){
            System.out.println("Dado inválido");
            return;
        }
        this.name = name; // O this usa a refencia NAME, que é a variavel criada dentro da Classe "Linha 5", e passa o nome recebido como parametro como valor da variavel
    }
    public void setAge(int age){
        if (age <= 0) {
            System.out.println("Idade inválida");
            return;
        }
        this.age = age;
    }
    public String getName(){
        return this.name;
    }

    public int getAge() {
        return this.age;
    }
    // setName ou setAge == Serve para receber o dado do usuario, getName e getAge serve para mostrar o dado do usuario
}
