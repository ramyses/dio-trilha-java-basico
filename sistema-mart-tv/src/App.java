public class App {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("TV Ligada " +  smartTv.ligada);
        System.out.println("Canal Atual : " +  smartTv.canal);
        System.out.println("Volume Atual : " +  smartTv.volume);

        smartTv.ligar ();
        System.out.println("Novo status: TV Ligada : " +  smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo status: TV Ligada : " +  smartTv.ligada);


        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        

        smartTv.reduzirVolume();
        



        smartTv.mudarCanal(13);
        System.out.println("Canal Atual : " + smartTv.canal);
    }
}
