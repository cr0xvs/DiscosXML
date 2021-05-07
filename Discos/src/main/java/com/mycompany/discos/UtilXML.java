package com.mycompany.discos;

import java.io.File;
import java.io.StringWriter;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class UtilXML {
    
        public static String getXMLDiscos(Discos discos) throws JAXBException{
        JAXBContext contexto = JAXBContext.newInstance(Discos.class);
        Marshaller marshaller = contexto.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,Boolean.TRUE);
        StringWriter sw = new StringWriter();
        marshaller.marshal(discos, sw);
        String result = sw.toString();
        return result;
    }
    
    public static void discosToXML(Discos discos) throws JAXBException{
        File fileXml = new File("discos.xml");
        JAXBContext contexto = JAXBContext.newInstance(Discos.class);
        Marshaller marshaller = contexto.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,Boolean.TRUE);
        marshaller.marshal(discos, fileXml);
    }
    
    public static  Discos procesarArchivosXmlDiscos(File file) throws JAXBException{
        JAXBContext contexto = JAXBContext.newInstance(Discos.class);
        Unmarshaller unmarshaller = contexto.createUnmarshaller();
        Discos discos = (Discos)unmarshaller.unmarshal(file);
        return discos; 
    }
}
    

