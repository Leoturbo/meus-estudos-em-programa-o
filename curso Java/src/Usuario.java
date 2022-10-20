public class Usuario{
    public static void main(String[] args) throws Exception {

        SmarTv smarTv = new SmarTv();

        smarTv.ligar();
        System.out.println("Novo Status -> TV ligada ? "+smarTv.ligada);


        smarTv.diminuirVolume();
        smarTv.diminuirVolume();
        smarTv.diminuirVolume();
        smarTv.aumentarVolume();
        System.out.println("Volume Atual: "+ smarTv.volume);


        System.out.println("Canal Atual : "+smarTv.canal);
        smarTv.mudarCanal(13);


        System.out.println("------------------");
        System.out.println("TV Ligada? " + smarTv.ligada);
        System.out.println("Canal Atual: "+ smarTv.canal);
        System.out.println("Volume Atual: "+ smarTv.volume);
        System.out.println("------------------");

        smarTv.desligar();
        System.out.println("Novo Status -> TV ligada ? "+smarTv.ligada);

    }
    
}