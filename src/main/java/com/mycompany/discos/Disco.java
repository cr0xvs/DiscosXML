package com.mycompany.discos;

import java.time.LocalDate;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlRootElement
@XmlType(propOrder={"id","tituloDisco","artista","tiempoDisco","precio","favorito","fecLanzamiento"})
public class Disco {
    // Declaración de variables
    private String id;
    private String tituloDisco;
    private String artista;
    private double tiempoDisco;
    private double precio;
    private boolean favorito;
    private LocalDate fecLanzamiento;
    
    public Disco(){
    }
    
    // Método constructor
    public Disco(String id, String tituloDisco, String artista, double tiempoDisco, double precio, boolean favorito, LocalDate fecLanzamiento){
        this.id = id;
        this.tituloDisco = tituloDisco;
        this.artista = artista;
        this.tiempoDisco = tiempoDisco;
        this.precio = precio;
        this.favorito = favorito;
        this.fecLanzamiento = fecLanzamiento;
    }
    
    // Método para obtener el id que tiene el disco
    public String getId(){
        return this.id;
    }
    
    // Método para cambiar el id del disco
    @XmlAttribute
    public void setId(String id){
        this.id = id;
    }
    
    // Método para obtener el titulo que tiene el disco
    public String getTituloDisco(){
        return this.tituloDisco;
    }
    
    // Método para cambiar el titulo del disco
    public void setTituloDisco(String tituloDisco){
        this.tituloDisco = tituloDisco;
    }
    
    // Método para obtener el artista que tiene el disco
    public String getArtista(){
        return this.artista;
    }
    
    //Método para cambiar el artista del disco
    public void setArtista(String artista){
        this.artista = artista;
    }
    
    // Método para obtener el tiempo que tiene el disco
    public double getTiempoDisco(){
        return this.tiempoDisco;
    }
    
    // Método para cambiar el tiempo del disco
    public void setTiempoDisco(double tiempoDisco){
        this.tiempoDisco = tiempoDisco;
    }
    
    // Método para obtener el precio que tiene el disco
    public double getPrecio(){
        return this.precio;
    }
    
    // Método para cambiar el precio del disco
    public void setPrecio(double precio){
        this.precio = precio;
    }
    
    // Método para saber si el disco es favorito
    public boolean getFavorito(){
        return this.favorito;
    }
    
    // Método para cambiar el estado de favorito del disco
    public void setFavorito(boolean favorito){
        this.favorito = favorito;
    }
    
    // Método que nos dice la fecha en la que se lanzó el disco
    public LocalDate getFecLanzamiento(){
        return this.fecLanzamiento;
    }
    
    // Método para cambiar la fecha de lanzamiento del disco
    @XmlJavaTypeAdapter(value = LocalDateAdapter.class)
    public void setFecLanzamiento(LocalDate fecLanzamiento){
        this.fecLanzamiento = fecLanzamiento;
    }
}