import java.util.Scanner;

public class AlunoResetLeituraTeclado {
    public static void main(String[] args) {

        Scanner leituraTeclado = new Scanner(System.in);
        System.out.println("Digite Seu nome:");
        String nome = leituraTeclado.nextLine();
        System.out.println("Sou aluno do Level 1 do CWI Reset! Me chamo " + nome);

    }
}
