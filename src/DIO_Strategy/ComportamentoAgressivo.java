package DIO_Strategy;

public class ComportamentoAgressivo implements Comportamento {
    @Override
    public  void mover(){
        System.out.println("em movimento com raiva");
    }
}
