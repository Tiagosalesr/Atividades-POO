package ListaExercicio02.Exercicio04;

import java.util.Objects;

public class MainRobo {
    public static void main(String[] args) {
        Robo robo01 = new Robo(100);
        Robo robo02 = new Robo(200);

        System.out.println(robo01.toString());
        System.out.println(robo02.toString());

        robo02.ligaDesliga();
        robo01.ligaDesliga();

        System.out.println(robo01.toString());
        System.out.println(robo02.toString());

        robo02.andar(4, 5);
        robo01.andar(2,6);

        System.out.println(robo01.toString());
        System.out.println(robo02.toString());

        robo02.parar();
        robo01.parar();

        System.out.println(robo01.toString());
        System.out.println(robo02.toString());

        robo02.aspirar(150);
        robo01.aspirar(88);

        System.out.println(robo01.toString());
        System.out.println(robo02.toString());

        robo02.aspirar(120);
        robo01.aspirar(68);

        System.out.println(robo01.toString());
        System.out.println(robo02.toString());
    }
}

 class Robo {
    private static int contadorId = 0;
    private int id;
    private String status;
    private int posX;
    private int posY;
    private double qntdPo;
    private double limitePo;

    public Robo(double limitePo) {
        this.id = ++contadorId;
        this.status = "desligado";
        this.posX = 0;
        this.posY = 0;
        this.qntdPo = 0;
        this.limitePo = limitePo;
    }


    public void setStatus(String status) {
        this.status = status;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public void setQntdPo(double qntdPo) {
        this.qntdPo = qntdPo;
    }

    public void setLimitePo(double limitePo) {
        this.limitePo = limitePo;
    }

    public void ligaDesliga() {
        if (Objects.equals(this.status, "desligado")){
            this.status = "ligado";
        } else if (Objects.equals(this.status, "ligado")) {
            this.status = "desligado";
        }
    }

    public void andar(int x, int y){
        if (Objects.equals(this.status, "ligado")||Objects.equals(this.status, "parado")){
            this.posX += x;
            this.posY += y;
            this.status = "andando";
        } else {
            System.out.println("O robô está: " + this.status);
        }
    }

    public void aspirar(double po){
        if (this.qntdPo + po < this.limitePo) {
            qntdPo += po;
        } else {
            this.qntdPo = this.limitePo;
            System.out.println("Limite de pó atingido!! Desligando o Robô: " + this.id + "... \n");
            this.status = "desligado";
        }
    }

    public void parar(){
        this.status = "parado";
    }

    @Override
    public String toString() {
        return "Robo "+ id +
                "\nstatus= " + status +
                "\nposX= " + posX +
                "\nposY= " + posY +
                "\nqntdPo= " + qntdPo +
                "\nlimitePo= " + limitePo + "\n";
    }
}