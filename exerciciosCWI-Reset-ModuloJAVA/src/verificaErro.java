import java.util.Scanner;

public class verificaErro {
    public static void main(String[] args) {

        boolean dadosCorretos = false;
        Scanner lerTeclado = new Scanner(System.in);

        while (!dadosCorretos) {
            System.out.println("Digite uma nota de 0 a 10:");
            float nota = lerTeclado.nextFloat();

            if (nota >= 0 && nota <= 10) {
                System.out.println(nota);
                dadosCorretos = true;
            } else {
                System.out.println("Número inválido");
            }
        }
    }
}

