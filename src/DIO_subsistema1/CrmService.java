package DIO_subsistema1;

public class CrmService {
    private  CrmService(){
        super();
    }
    public static void gravarCliente(String nome, String cep,String cidade, String estado){
        System.out.println("Cliente incluso no sistema CRM");
        System.out.println(nome);
        System.out.println(cep);
        System.out.println(cidade);
        System.out.println(estado);
    }

}
