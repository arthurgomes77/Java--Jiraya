package JavaJiraya.introducao;

public class Arrays02 {
    public static void main(String[] args) {
        String [] nomes = new String[4];
        nomes[0] = "Goku";
        nomes[1] = "Neymar";
        nomes[2] = "Naruto";
//        nomes[3] = "Kakashi";
        for (int i = 0; i < nomes.length; i++){
            System.out.println((i+1) + " - " + nomes[i]);
        }
    }
}
