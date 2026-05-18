package ListaExercicio02.Exercicio03;

class Televisao{
    private int volume;
    private int canal;

    public Televisao() {
        this.volume = 0;
        this.canal = 0;
    }

    public void aumentarVolumeEm(int vol){
        this.volume += vol;
    }

    public void diminuirVolumeEm(int vol){
        if (vol>this.volume){
            this.volume = 0;
            return;
        }
        this.volume -= vol;
    }

    public void mudarCanal(int canal) {
        this.canal = canal;
    }

    @Override
    public String toString() {
        return "Televisao{" +
                "volume=" + volume +
                ", canal=" + canal +
                '}';
    }
}

public class ControleRemoto {
    public static void main(String[] args) {
        Televisao tv = new Televisao();
        System.out.println(tv.toString());
        tv.aumentarVolumeEm(25);
        System.out.println(tv.toString());
        tv.mudarCanal(23);
        System.out.println(tv.toString());
        tv.diminuirVolumeEm(15);
        System.out.println(tv.toString());
        tv.mudarCanal(47);
        System.out.println(tv.toString());

    }
}
