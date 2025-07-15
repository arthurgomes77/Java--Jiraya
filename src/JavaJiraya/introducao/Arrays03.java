package JavaJiraya.introducao;

public class Arrays03 {
    public static void main(String[] args) {
        int [] numeros = new int[3]; //Inicializando um array vazio
        int [] numeros2 = {11,22,33,44,55}; // Inicializando um array com valores
        int [] numeros3 = new int[] {1,2,3,4,5};

//        for (int i = 0; i < numeros3.length ; i++) {
//            System.out.println(numeros3[i]);
//        }

        for (int num : numeros3){
            System.out.println(num);
        }
    }
}
