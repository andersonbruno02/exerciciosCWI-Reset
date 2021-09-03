package aulaPoo;

public class Caneta {
    protected String modelo;
    protected String cor;
    protected float ponta;
    public int carga;
    private boolean tampada = true;

    public void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Tampada: " + this.tampada);
    }

    public void rabiscar() {
        if(this.tampada) {
            System.out.println("Não posso rabiscar, estou tampada.");
        } else {
            System.out.println("Estou rabiscando");
        }
    }

    public void destampar() {
        this.tampada = false;
    }

    public void tampar() {
        this.tampada = true;
    }

}
