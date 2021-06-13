package com.mycompany.discos;

import java.time.LocalDate;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlRootElement
@XmlType(propOrder={"id","tituloDisco","artista","tiempoDisco","precio","favorito","fecLanzamiento"})
public class Disco {
    
    private String id;
    private String tituloDisco;
    private String artista;
    private double tiempoDisco;
    private double precio;
    private boolean favorito;
    private LocalDate fecLanzamiento;
    
    public Disco(){
    }
    
    public Disco(String id, String tituloDisco, String artista, double tiempoDisco, double precio, boolean favorito, LocalDate fecLanzamiento){
        this.id = id;
        this.tituloDisco = tituloDisco;
        this.artista = artista;
        this.tiempoDisco = tiempoDisco;
        this.precio = precio;
        this.favorito = favorito;
        this.fecLanzamiento = fecLanzamiento;
    }
    
    public String getId(){
        return this.id;
    }
    
    @XmlAttribute
    public void setId(String id){
        this.id = id;
    }
    
    public String getTituloDisco(){
        return this.tituloDisco;
    }
    
    public void setTituloDisco(String tituloDisco){
        this.tituloDisco = tituloDisco;
    }
    
    public String getArtista(){
        return this.artista;
    }
    
    public void setArtista(String artista){
        this.artista = artista;
    }
    
    public double getTiempoDisco(){
        return this.tiempoDisco;
    }
    
    public void setTiempoDisco(double tiempoDisco){
        this.tiempoDisco = tiempoDisco;
    }
    
    public double getPrecio(){
        return this.precio;
    }
    
    public void setPrecio(double precio){
        this.precio = precio;
    }
    
    public boolean getFavorito(){
        return this.favorito;
    }
    
    public void setFavorito(boolean favorito){
        this.favorito = favorito;
    }
    
    public LocalDate getFecLanzamiento(){
        return this.fecLanzamiento;
    }
    
    @XmlJavaTypeAdapter(value = LocalDateAdapter.class)
    public void setFecLanzamiento(LocalDate fecLanzamiento){
        this.fecLanzamiento = fecLanzamiento;
    }
    
    
    
    
    
    
}
