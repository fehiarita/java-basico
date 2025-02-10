public class Usuario {
    public static void main(String[] args) {
        SmartTv tv  = new SmartTv();

        tv.diminuirVolume();
        tv.diminuirVolume();
        tv.diminuirVolume();
        tv.aumentarVolume();

        System.out.println("Canal atual: "+tv.canal);
        tv.mudarDeCanal(13);
        System.out.println("Canal atual: "+tv.canal);

        System.out.println("Tv ligada? "+tv.ligada);
       
        
        tv.ligar();
        System.out.println("Tv ligada? "+tv.ligada);
        
        tv.desligar();
        System.out.println("Tv ligada? "+tv.ligada);

    }
}
