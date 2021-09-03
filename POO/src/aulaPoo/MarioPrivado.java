package aulaPoo;

public class MarioPrivado {

    protected String nome;
    protected String altura;
    protected String cor;
    private boolean vivo = true;
    protected int vidas;
    private String[] poderes = {"Super Pulo", "Giro da Morte"};

    public void status() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Altura: " + this.altura);
        System.out.println("Cor: " + this.cor);
        System.out.println("Vivo: " + this.vivo);
        System.out.println("Vidas: " + this.vidas);
    }
    public void morrer() {
        System.out.println("Você morreu, restam " + --this.vidas + " vidas.");
        this.vivo = false;
    }

    public void continuar() {
        System.out.println("Vamos lá mais uma vez!!");
        this.vivo = true;
    }

    public void superPoderes() {
        System.out.println("Poderes:");
        for (String poder : this.poderes) {
            System.out.println(poder);
        }
    }
}
