public class Usuario {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        SmartTv smartTv = new SmartTv();

        smartTv.statusLigada();
        System.out.println("TV Ligada ? " + smartTv.ligadaTv);
        smartTv.ligar();
        smartTv.statusLigada();
        System.out.println("TV Ligada ? " + smartTv.ligadaTv);


        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();


        System.out.println("Canal Atual :" + smartTv.canal);

        smartTv.mudarCanal(13);
        System.out.println("Canal Atual :" + smartTv.canal);
    

        
        System.out.println("TV Ligada ? " + smartTv.ligadaTv);
        System.out.println("Canal Atual :" + smartTv.canal);
        System.out.println("Volume Atual :" + smartTv.volume);


    }
}
