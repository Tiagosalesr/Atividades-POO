package Exec;

import Dominio.Elevador;

public class ExecElevator {
    public static void main(String[] args) {
        Elevador elevador01 = new Elevador(1, 500.0,15);

       elevador01.imprimeStatus();
       elevador01.ligaDesliga();

       elevador01.imprimeDados();

       elevador01.upTo(459);
       elevador01.imprimeDados();
       elevador01.downTo(900);
       elevador01.imprimeDados();
    }
}
