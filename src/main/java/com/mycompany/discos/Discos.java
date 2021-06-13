package com.mycompany.discos;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Discos {
    
    // Creamos una lista donde guardamos todo lo de la clase disco
    private ArrayList<Disco> listaDiscos = new ArrayList<>();
    
    // Método para obtener la lista que tiene discos
    public ArrayList<Disco> getListaDiscos() {
        return listaDiscos;
    }
    
    // Método para cambiar la lista de los discos
    @XmlElement(name = "disco")
    public void setListaDiscos(ArrayList<Disco> listaDiscos) {
        this.listaDiscos = listaDiscos;
    }
}
