package com.Ejercicio4.entities;


import javax.persistence.*;

@Entity
@Table(name = "laptops")
public class Laptop {

    //atributos

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String procesador;

    private Integer memRam;

    private String discoDuro;

    private Integer pulgadas;

    private Integer duracionBateria;

    private boolean tecladoCompleto;



    //constructores


    public Laptop() {
    }

    public Laptop(Long id, String procesador, Integer memRam, String discoDuro, Integer pulgadas, Integer duracionBateria, boolean tecladoCompleto) {
        id = id;
        procesador = procesador;
        memRam = memRam;
        discoDuro = discoDuro;
        pulgadas = pulgadas;
        duracionBateria = duracionBateria;
        tecladoCompleto = tecladoCompleto;
    }

    //getters y setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public Integer getMemRam() {
        return memRam;
    }

    public void setMemRam(Integer memRam) {
        this.memRam = memRam;
    }

    public String getDiscoDuro() {
        return discoDuro;
    }

    public void setDiscoDuro(String discoDuro) {
        this.discoDuro = discoDuro;
    }

    public Integer getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(Integer pulgadas) {
        this.pulgadas = pulgadas;
    }

    public Integer getDuracionBateria() {
        return duracionBateria;
    }

    public void setDuracionBateria(Integer duracionBateria) {
        this.duracionBateria = duracionBateria;
    }

    public boolean isTecladoCompleto() {
        return tecladoCompleto;
    }

    public void setTecladoCompleto(boolean tecladoCompleto) {
        this.tecladoCompleto = tecladoCompleto;
    }
}
