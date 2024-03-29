package com.mycompany.discos;

import java.io.File;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javax.xml.bind.JAXBException;


public class App extends Application {

    @Override
    public void start(Stage stage) {
        BorderPane root = new BorderPane();
        var scene = new Scene(root, 640, 480);
        stage.setScene(scene);
        stage.show();
        
        TextArea textArea = new TextArea();
        textArea.setEditable(false);
        root.setCenter(textArea);
        
        Button buttonGenerar = new Button("Discos");
        buttonGenerar.setOnAction((t) ->{
            generarLosDiscos(textArea);
        });
        
        Button buttonAbrirFichero = new Button("Abrir archivo");
        buttonAbrirFichero.setOnAction((t) ->{
            procesarXmlFileDiscos(stage, textArea);
        });
        
        HBox panelSuperior = new HBox(buttonGenerar, buttonAbrirFichero);
        root.setTop(panelSuperior);
    }
    
    public void procesarXmlFileDiscos(Stage stage, TextArea textArea){
        try {
            FileChooser fileChooser = new FileChooser();
            fileChooser.setTitle("Abrir XML de Discos");
            File archivoSeleccionado = fileChooser.showOpenDialog(stage);
            Discos discos = UtilXML.procesarArchivosXmlDiscos(archivoSeleccionado);
            String strDiscos = "";
            for(Disco disco : discos.getListaDiscos()){
               strDiscos += disco.getTituloDisco() + "\n";
            }
            textArea.setText(strDiscos);
        } catch (JAXBException ex) {
            System.out.println(ex.toString());
            Alert alert = new Alert(AlertType.ERROR);
            alert.setHeaderText("Error al procesar el documento");
            alert.setContentText(ex.toString());
            alert.showAndWait();
        }
    }

    public void generarLosDiscos(TextArea textArea) {
        Discos discos = UtilDiscos.crear();
        try {
            String strXml = UtilXML.getXMLDiscos(discos);
            textArea.setText(strXml);
            System.out.println(strXml);
            
            UtilXML.discosToXML(discos);
            
        } catch (JAXBException ex) {
            System.out.println(ex.toString());
            Alert alert = new Alert(AlertType.ERROR);
            alert.setHeaderText("Error al generar el documento");
            alert.setContentText(ex.toString());
            alert.showAndWait();
        }
    }

    public static void main(String[] args) {
        launch();
    }

}