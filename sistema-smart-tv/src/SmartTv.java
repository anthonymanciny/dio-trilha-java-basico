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

    public void aumentarcanal(){
        canal++;
    }
    
    public void diminuircanal(){
        canal--;
    }

    public void aumentarvolume(){
        volume++;
    }

    public void diminuirvolume(){
        volume--;
    }
}
