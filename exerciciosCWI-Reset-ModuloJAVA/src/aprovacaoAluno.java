import java.util.Scanner;

public class aprovacaoAluno {
    public static void main(String[] args) {

        Scanner lerTeclado = new Scanner(System.in);
        System.out.println("Digite as 4 notas do aluno:");
        float nota1 = lerTeclado.nextFloat();
        float nota2 = lerTeclado.nextFloat();
        float nota3 = lerTeclado.nextFloat();
        float nota4 = lerTeclado.nextFloat();
        float media = (nota1 + nota2 + nota3 + nota4)/4;

        if(media == 10) {
            System.out.println("Aluno aprovado com louvores");
        } else if(media>=7) {
            System.out.println("Aluno aprovado");
        } else {
            System.out.println("Aluno reprovado");
        }


    }
}
