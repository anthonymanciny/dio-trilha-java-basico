public class Usuario {
    

    public static void main(String[] args) {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("TV Ligada?:" + smartTv.ligada);
        
        System.out.println("Canal Atual: " + smartTv.canal);
        
        System.out.println("Volume atual: " + smartTv.volume);
        
        smartTv.ligar();
        System.out.println("TV Ligada?:" + smartTv.ligada);

        smartTv.aumentarcanal();
        System.out.println("Canal Atual: " + smartTv.canal);
        
        smartTv.aumentarcanal();
        System.out.println("Canal Atual: " + smartTv.canal);

        smartTv.aumentarcanal();
        System.out.println("Canal Atual: " + smartTv.canal);

        smartTv.aumentarcanal();
        System.out.println("Canal Atual: " + smartTv.canal);







    }
}
