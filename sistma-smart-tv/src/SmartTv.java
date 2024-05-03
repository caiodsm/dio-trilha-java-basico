public class SmartTv {
    boolean ligadaTv = false;
    int canal = 1;
    int volume  = 25;


    public void ligar() {
        if (ligadaTv == false)
            ligadaTv = true;
        else
            ligadaTv =true;

    }
    
    public void desligar() {
        if (ligadaTv == true)
            ligadaTv = false;
        else
            ligadaTv =true;

    }

    public void statusLigada() {

        if (ligadaTv == true)
            System.err.println("Tv ligada");
        else
            System.out.println("Tv desligada");
    }
    public void mudarCanal (int novoCanal) {
        canal = novoCanal; 
    }

    public void aumentarCanal () {
        canal++;
        System.out.println(canal);
    }

    public void diminuirCanal () {
        canal--;
        System.out.println(canal);
    }

    public void aumentarVolume () {
        volume++;
        System.out.println("Aumentando volume para: " + volume);
    }

    public void diminuirVolume () {
       volume--;
       System.out.println("Diminuindo volume para: " + volume);

    }
}   