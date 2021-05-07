package com.mycompany.discos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UtilDiscos {
    
    public static Discos crear() {
        Disco disco1 = new Disco("B01N19IDS9", "Martes 13", "Natos y Waor", 44.21, 12.00, true, LocalDate.of(2015, 10, 13));
        
        Disco disco2 = new Disco();
        disco2.setId("1231232");
        disco2.setTituloDisco("Konbanwa");
        disco2.setFecLanzamiento(LocalDate.parse("26/06/2020", DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        
        Discos discos = new Discos();
        discos.getListaDiscos().add(disco1);
        discos.getListaDiscos().add(disco2);
        
        return discos;
    }
    
}
