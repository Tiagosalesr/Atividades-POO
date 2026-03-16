package Dominio;

public class Elevador {
    private int numero;
    private double pesoLimite;
    private int qntdAndares;
    private boolean status;
    private int  andaratual;

    public Elevador(int num, double pesoLimite, int qntdAndares) {
        this.numero = num;
        this.pesoLimite = pesoLimite;
        this.qntdAndares = qntdAndares;
        this.status = false;
        this.andaratual = 1;

    }

    public void imprimeStatus(){
        if (this.status){
            System.out.println("Elavador está ligado!!");
        } else {
            System.out.println("Elavador está desligado!!");
        }
    }

    public void imprimeDados(){
        imprimeStatus();
        System.out.println("------------------\n"+"Andar atual: "+this.andaratual+"\nNúmero de andares: "+qntdAndares+"\n------------------\n");
    }

    public void ligaDesliga(){
        this.status = !this.status;
    }

    public int downTo(int andaresDescer){
        if (this.status) {
            if (andaresDescer > this.andaratual){
                this.andaratual = 0;
            } else {
                this.andaratual -= andaresDescer;
            }
            return this.andaratual;
        } else {
            System.out.println("Elevador desligado!!");
            return 0;
        }
    }

    public int upTo(int andaresSubir){
       if (this.status) {
           if ((andaresSubir + this.andaratual) > qntdAndares) {
               this.andaratual = qntdAndares;
           } else {
               this.andaratual += andaresSubir;
           }
           return this.andaratual;
       } else {
           System.out.println("Elevador desligado!!");
           return 0;
       }
    }
}
