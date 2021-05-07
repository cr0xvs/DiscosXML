package com.mycompany.discos;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class UtilXML {
    
    public static void getXmlDisco(Discos discos){
        try{
            JAXBContext contexto = JAXBContext.newInstance(Discos.class); 
            Marshaller marshaller = contexto.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            marshaller.marshal(discos, System.out);
        } catch (JAXBException ex) {
            System.out.println("Error: " + ex.toString());
        }
        
    }
    
}
