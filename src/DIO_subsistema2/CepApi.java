package DIO_subsistema2;

import DIO_Singleton.SingletonEager;

public class CepApi {
    private  static CepApi instancia = new CepApi();
    private CepApi(){
        super();
    }
    public static CepApi getInstancia(){
        return  instancia;
    }
    public  String recuperaCidade(String cep){
        return  "uma_cidade";

    }public  String recuperaEstado(String cep){
        return  "EO";
    }
}
