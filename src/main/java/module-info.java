module com.mycompany.discos {
    requires javafx.controls;
    requires java.xml.bind;
    requires jakarta.activation;
    requires java.activation;
    opens com.mycompany.discos to java.xml.bind;
    exports com.mycompany.discos;
}
