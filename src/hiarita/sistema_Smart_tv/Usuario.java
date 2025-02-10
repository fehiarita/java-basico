package hiarita.sistema_Smart_tv;

public class Usuario {
    public static void main(String[] args) {
        hiarita.sistema_Smart_tv.SmartTv tv  = new hiarita.sistema_Smart_tv.SmartTv();

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
