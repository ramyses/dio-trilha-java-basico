public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }

    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
    }
    public void aumentarCanal() {
        canal++;
    }
    public void reduzirCanal() {
        canal--;
    }

    public void aumentarVolume(){
        volume ++;
        System.out.println("Volume: " + volume);
    }
    public void reduzirVolume(){
        volume --;
        System.out.println("Volume: " + volume);
    }
}
