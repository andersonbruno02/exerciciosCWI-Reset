import java.util.Scanner;

public class vetorCinco {

    public static void main(String[] args) {

        Scanner lerTeclado = new Scanner(System.in);
        double[] numeros = new double[5];
        double[] numerosVezesDois = new double[5];
        for (int index = 0; index < numeros.length; index++) {
            System.out.println("Digite o " + (index + 1) + "º valor:");
            numeros[index] = lerTeclado.nextDouble();
            numerosVezesDois[index] = numeros[index] * 2;
        }
        System.out.println("\nPrimeiro Vetor:");
        for (double numero : numeros) {
            System.out.println(numero);
        }
        System.out.println("\n1Segundo Vetor:");
        for (double numero : numerosVezesDois) {
            System.out.println(numero);
        }


    }
}
