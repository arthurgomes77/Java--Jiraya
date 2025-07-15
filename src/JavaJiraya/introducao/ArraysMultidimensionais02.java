package JavaJiraya.introducao;

public class ArraysMultidimensionais02 {
    public static void main(String[] args) {
        int [][] arrayInt = new int[3][]; // Não é preciso definir o tamanho dos Arrays internos, pois pode definir cada um de forma individual, mostrado logo abaixo

        arrayInt[0] = new int[2]; // Cada Array Multidimensional pode ter tamanhos independentes
        arrayInt[1] = new int[] {1,2,3,4,5}; // Definindo o array multidimensional com um tamanho específico, e com valores internos especifico
        arrayInt[2] = new int[4];

        int [][] arraysMulti = {{1,2}, {11,22,33}, {111,222,333,444}}; // Definindo um array multidimensional já com os valores preenchidos

        for (int [] arrayInteiros : arrayInt){
            System.out.println("-------");
            for (int num : arrayInteiros){
                System.out.println(num);
            }
        }
    }
}
