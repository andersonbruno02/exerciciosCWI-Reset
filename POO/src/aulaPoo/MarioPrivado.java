package aulaPoo;

public class MarioPrivado {

    private String nome;
    private double altura;
    private int idade;
    private int estamina;

    public MarioPrivado() {
        this.nome = "Mario Bros";
        this.altura = 1.5;
        this.idade = 40;
        this.estamina = 100;
    }

    public MarioPrivado(String nome, double altura, int idade, int estamina) {
        this.nome = nome;
        this.altura = altura;
        this.idade = idade;
        this.estamina = estamina;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getEstamina() {
        return estamina;
    }

    public void setEstamina(int estamina) {
        this.estamina = estamina;
    }

    public void perderEstamina() {
        this.setEstamina((this.getEstamina() - 10));
        if (this.getEstamina() < 0) {
            this.setEstamina(0);
        }
    }

    public void ganharEstamina() {
        this.setEstamina((this.getEstamina() + 5));
        if (this.getEstamina() > 100) {
            this.setEstamina(100);
        }
    }

    public void crescer() {
        if (this.getAltura() < 2) {
            this.setAltura((this.getAltura() * 2));
        }
    }

    public void status() {
        System.out.println(this.nome);
        System.out.println(this.altura);
        System.out.println(this.idade);
        System.out.println(this.estamina);

    }

}
