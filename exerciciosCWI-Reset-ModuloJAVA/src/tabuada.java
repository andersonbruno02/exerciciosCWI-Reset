import java.util.Scanner;

public class tabuada {
    public static void main(String[] args) {


        boolean dadosCorretos = false;
        Scanner lerTeclado = new Scanner(System.in);

        while (!dadosCorretos) {
            System.out.println("Digite um numero de 0 a 10 para receber a tabuada:");
            int numero = lerTeclado.nextInt();

            if (numero >= 0 && numero <= 10) {
                System.out.println("Tabuada do " + numero + "\n");
                for (int i = 1; i <= 10; i++) {
                    System.out.println(numero + " x " + i + " = " + i * numero);
                }
                dadosCorretos = true;
            } else {
                System.out.println("Número inválido");
            }
        }

    }
}
