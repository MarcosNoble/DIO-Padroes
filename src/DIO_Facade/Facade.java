package DIO_Facade;

import DIO_subsistema1.CrmService;
import DIO_subsistema2.CepApi;

public class Facade {
    public  void  migrarCliente(String nome, String cep){
        String cidade = CepApi.getInstancia().recuperaCidade(cep);
        String estado = CepApi.getInstancia().recuperaEstado(cep);
        CrmService.gravarCliente(nome, cep, cidade,estado);
    }
}
