package JavaJiraya.JavaCore.Oexceptions.runtime;

public class RuntimeExceptio03 {
    public static void main(String[] args) {
        abrirConexao();
    }
    private static String abrirConexao(){
        try{
            System.out.println("Abrindo o arquivo");
            System.out.println("Escrevendo dados no arquivo");
            return "Conexão aberta";
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            System.out.println("Fechando recurso");
        }
        return null;
    }
}
