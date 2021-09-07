package aulaPoo;

public class SistemaBanco {
    public static void main(String[] args) {

        ContaBanco conta1 = new ContaBanco();
        conta1.setNumConta(2);
        conta1.setDono("Bruno");
        conta1.abrirConta("cc");
        conta1.depositar(3000);
        conta1.sacar(200);
        conta1.pagarMensalidade();

        conta1.estadoAtual();

        ContaBanco conta2 = new ContaBanco();
        conta2.setNumConta(3);
        conta2.setDono("Karol");
        conta2.depositar(50);
        conta2.abrirConta("cp");
        conta2.depositar(5000);
        conta2.sacar(500);
        conta2.estadoAtual();
        conta2.fecharConta();
    }
}
