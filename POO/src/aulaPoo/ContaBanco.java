package aulaPoo;

public class ContaBanco {

    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public ContaBanco() {
        setSaldo(0);
        setStatus(false);
    }

    public void estadoAtual() {
        System.out.println("---------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono:" + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }

    public void abrirConta(String tipo) {
        this.setStatus(true);
        this.setTipo(tipo);
        if (tipo == "cc") {
            this.setSaldo(50);
        } else if (tipo == "cp") {
            this.setSaldo(150);
        }
    }

    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("Não pode fechar a conta com dinheiro");
        } else if (this.getSaldo() < 0) {
            System.out.println("Não pode fechar a conta com débito");
        } else {
            this.setStatus(false);
        }
    }

    public void depositar(double deposito) {
        if (this.getStatus()) {
            this.setSaldo((this.getSaldo() + deposito));
        } else {
            System.out.println("Conta fechada, impossivel depositar");
        }
    }

    public void sacar(double saque) {
        if (this.getStatus()) {
            if (saque <= this.getSaldo()) {
                this.setSaldo((this.getSaldo() - saque));
            } else {
                System.out.println("Saldo insuficiente");
            }
        } else {
            System.out.println("Conta fechada");
        }
    }

    public void pagarMensalidade() {
        if (this.getStatus()) {
            if (this.getTipo() == "cc") {
                this.setSaldo((this.getSaldo() - 12));
            } else if (this.getTipo() == "cp") {
                this.setSaldo((this.getSaldo() - 20));
            }
        } else {
            System.out.println("Conta fechada");
        }
    }
}