package aulaPoo;

public class UsaCaneta {
    public static void main(String[] args) {

        CanetaPOO c1 = new CanetaPOO();
        c1.carga = 90;
        c1.cor = "Preta";
        c1.modelo = "compactor";
        c1.tampada = true;

        CanetaPOO c2 = new CanetaPOO();
        c2.carga = 100;
        c2.cor = "Azul";
        c2.modelo = "compactor";
        c2.tampada = false;
        c1.destampar();
        c1.rabiscar();
        //c2.rabiscar();
    }
}
