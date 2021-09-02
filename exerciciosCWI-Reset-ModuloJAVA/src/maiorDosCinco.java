import java.util.Scanner;

public class maiorDosCinco {
    public static void main(String[] args) {

        int numero;
        int maior = Integer.MIN_VALUE;
        Scanner lerTeclado = new Scanner(System.in);
        System.out.println("Digite 5 números e receba o maior de volta");
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um número:");
            numero = lerTeclado.nextInt();
            if (numero > maior) {
                maior = numero;
            }
        }
        System.out.println(maior);
    }
}
