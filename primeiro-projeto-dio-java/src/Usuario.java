public class Usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();

        smartTv.ligar();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.mudarCanal(13);
        

        System.out.println(smartTv.ligada);
        System.out.println(smartTv.canal);
        System.out.println(smartTv.volume);
    }
}
