import java.util.Scanner;

public class intervaloNumeros {
    public static void main(String[] args) {

        int numero1;
        int numero2;
        Scanner lerTeclado = new Scanner(System.in);
        do {
            System.out.println("Digite dois números para ver o intervalo entre eles: ");
            numero1 = lerTeclado.nextInt();
            numero2 = lerTeclado.nextInt();
            if (numero2 >= numero1) {
                System.out.println("O segundo número precisa ser menor que o primeiro");
            } else {
                for (int i = --numero1; i > numero2; i--) {
                    System.out.println(i);
                }
            }

        } while ((numero2 >= numero1));

    }
}
