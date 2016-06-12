package pe.edu.utp.hrserviceapp.models;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.io.Serializable;

/**
 * Created by GrupoUTP on 11/06/2016.
 */
public class ServiceBean implements Serializable {
    HRService service;
    InitialContext context;

    public ServiceBean(){
        try {
            context = new InitialContext();
            service = new HRService(context);
        } catch (NamingException e) {
            e.printStackTrace();
        }
    }

    public InitialContext getContext(){
        if(context == null){
            try {
                context = new InitialContext();
            } catch (NamingException e) {
                e.printStackTrace();
            }
        }else{
            return context;
        }
        return null;
    }

    public int getRegionsCount(){
        if(getContext() == null){
            return 0;
        }
        return service.findAllRegions().size();
    }

    public int getCountriesCount(){
        return service.findAllCountries().size();
    }
}
