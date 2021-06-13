package com.mycompany.discos;

import java.time.LocalDate;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class LocalDateAdapter extends XmlAdapter<String, LocalDate> {
    
    // Obtenemos los objetos a partir del XML
    @Override
    public LocalDate unmarshal(String vt) throws Exception {
        return LocalDate.parse(vt);
    }
    
    // Creamos el XML a partir de los objetos
    @Override
    public String marshal(LocalDate bt) throws Exception {
        return bt.toString();
    }
}
