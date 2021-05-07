package com.mycompany.discos;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Discos {
    
    private ArrayList<Disco> listaDiscos = new ArrayList<>();
    
    public Discos() {
        
    }
    
    public ArrayList<Disco> getListaDiscos() {
        return listaDiscos;
    }
    
    @XmlElement(name = "disco")
    public void setListaDiscos(ArrayList<Disco> listaDiscos) {
        this.listaDiscos = listaDiscos;
    }
}
