import java.util.Scanner;

public class exercicioOperadores {
    public static void main(String[] args) {

        Scanner lerTeclado = new Scanner(System.in);
        System.out.println("Qual o tamanho do arquivo que sera baixado(medida em MB):");
        int tamanhoArquivo = lerTeclado.nextInt();
        System.out.println("Qual a velocidade da Internet(valores em Mbps)");
        int velocidadeInternet = lerTeclado.nextInt();
        //Convertendo para MB/s
        velocidadeInternet = velocidadeInternet/8;
        double tempo = tamanhoArquivo/velocidadeInternet;
        System.out.println("Tempo de download " + tempo + " segundos");

    }
}
