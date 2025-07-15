package JavaJiraya.Exercicios;

public class SwitchExercicio {
    public static void main(String[] args) {
        int dia = 1;
        switch (dia){
            case 1 :
            case 7 :
                System.out.println("Final de semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia de semana");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
    }
}
