package JavaJiraya.JavaCore.Oexceptions.runtime;

import javax.swing.*;
import java.io.FileNotFoundException;
import java.sql.SQLException;

public class RuntimeExceptio04 {
    public static void main(String[] args) {
        try {
            throw new ArrayIndexOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException e) {
            System.out.println("Dentro do Array IndexOut");
        } catch (IndexOutOfBoundsException i) {
            System.out.println("Dentro do IndexOut");
        } catch (RuntimeException e) {
            System.out.println("Dentro do Runtime");
        }

        try {
            talvezLance();
        } catch (SQLException | FileNotFoundException e){
            System.out.println("\nErro: " + e);
            e.printStackTrace();
        }
    }
    private static void talvezLance() throws SQLException, FileNotFoundException {
        throw new FileNotFoundException();
    }

}
