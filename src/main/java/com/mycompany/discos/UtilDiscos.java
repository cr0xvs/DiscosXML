package com.mycompany.discos;

import java.time.LocalDate;

public class UtilDiscos {
    
    public static Discos crear() {
        // Opción para crear los discos
        Disco disco1 = new Disco("111111111", "Martes 13", "Natos y Waor", 44.21, 12.00, true, LocalDate.of(2015, 10, 13));
        Disco disco2 = new Disco("222222222", "Konbanwa", "Sticky M.A.", 29.41, 9.99, true, LocalDate.of(2020, 06, 26));
        Disco disco3 = new Disco("333333333", "Desde el Fin del Mundo", "Duki", 57.18, 9.99, true, LocalDate.of(2021, 04, 22));
        Disco disco4 = new Disco("444444444", "Súper Sangre Joven", "Duki", 25.09, 9.99, true, LocalDate.of(2019, 11, 01));
        Disco disco5 = new Disco("555555555", "Antezana 247", "YSY A", 30.13, 9.99, true, LocalDate.of(2018, 11, 11));
        
        Discos discos = new Discos();
        // Añadimos los discos a la lista de discos
         discos.getListaDiscos().add(disco1);
        discos.getListaDiscos().add(disco2);
        discos.getListaDiscos().add(disco3);
        discos.getListaDiscos().add(disco4);
        discos.getListaDiscos().add(disco5);
        
        return discos;
    }
    
}
