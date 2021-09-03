package aulaPoo;

public class CanetaPOO {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Tampada: " + this.tampada);
    }

    void rabiscar() {
        if(this.tampada) {
            System.out.println("Não posso rabiscar, estou tampada.");
        } else {
            System.out.println("Estou rabiscando");
        }
    }

    void destampar() {
        this.tampada = false;
    }

    void tampar() {
        this.tampada = true;
    }

}
