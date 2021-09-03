package aulaPoo;

public class PooCaneta {
    public static void main(String[] args) {

        Caneta caneta1 = new Caneta();
        caneta1.modelo = "Compactor";
        caneta1.cor = "Preta";

        caneta1.status();
        caneta1.destampar();
        caneta1.rabiscar();
        caneta1.tampar();
        caneta1.status();

    }

}
