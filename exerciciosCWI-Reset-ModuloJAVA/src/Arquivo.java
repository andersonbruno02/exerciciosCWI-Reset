import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Arquivo {
    public static void lerTexto(String nomeArquivo) {
        try {
            File arquivo = new File(nomeArquivo);
            Scanner scan = new Scanner(arquivo);
            while(scan.hasNextLine()) {
                System.out.println(scan.nextLine());
            }

            scan.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
    public static void main(String[] args) {
        lerTexto("teste.txt");
    }
}
