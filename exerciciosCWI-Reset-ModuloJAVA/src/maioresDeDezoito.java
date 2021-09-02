import java.util.Scanner;

public class maioresDeDezoito {

    public static void main(String[] args) {

        int[] idades = new int[10];
        int maioresDeDezoito = 0;
        Scanner lerTeclado = new Scanner(System.in);
        System.out.println("Digite 10 idades diferentes:");

        for (int index = 0; index < idades.length; index++) {
            System.out.println("Digite a " + (index + 1) + "º idade:");
            idades[index] = lerTeclado.nextInt();
            if (idades[index] >= 18) {
                maioresDeDezoito++;
            }
        }
        System.out.println("\nLista de Idades:");
        for (int idade : idades) {
            System.out.println(idade);
        }
        System.out.println("\nQuantidade de maior de 18 anos: " + maioresDeDezoito);
    }
}
