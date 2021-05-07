package com.mycompany.discos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;


public class App extends Application {

    @Override
    public void start(Stage stage) throws JAXBException {
        var scene = new Scene(new StackPane(), 640, 480);
        stage.setScene(scene);
        stage.show();
        
        

        Discos discos = UtilDiscos.crear();
        UtilXML.getXmlDisco(discos);
        
        
    }

    public static void main(String[] args) {
        launch();
    }

}