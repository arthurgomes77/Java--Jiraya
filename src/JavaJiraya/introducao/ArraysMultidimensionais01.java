package JavaJiraya.introducao;

public class ArraysMultidimensionais01 {
    public static void main(String[] args) {
        int [][] meses = new int[3][3];
        meses[0][0] = 1;
        meses[0][1] = 2;
        meses[0][2] = 3;
        meses[1][0] = 4;
        meses[1][1] = 5;
        meses[1][2] = 6;
        meses[2][0] = 7;
        meses[2][1] = 8;
        meses[2][2] = 9;

        for (int i = 0; i < meses.length; i++) {
            for (int j = 0; j < meses[i].length; j++) {
                System.out.println(meses[i][j]);
            }

        }
        System.out.println("-----------------------------");

        for (int [] arrayBase: meses) { // int [] arrayBase - Demonstra que o Array, é montado por Arrays de Inteiros
            for (int num : arrayBase){ // Utiliza o Array de inteiros para pegar os valores dentro de cada Array
                System.out.println(num);
            }
        }

    }
}
