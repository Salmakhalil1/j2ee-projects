package ws;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

import java.util.List;

@WebService(serviceName = "BanqueWS")

public class BanqueService {
    @WebMethod(operationName = "Convert")
    public double conversion(double mt){
        return mt*10.54;
    }
    public Compte getCompte(int code){
        return new Compte (code,Math.random()*9888);

    }
    public List<Compte> listComptes(){
        return List.of(
                new Compte (1,Math.random()*9888),
                new Compte (2,Math.random()*9888),
                new Compte (3,Math.random()*9888)

                

        );

    }

}
