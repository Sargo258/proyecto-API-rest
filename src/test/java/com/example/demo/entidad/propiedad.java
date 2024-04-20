package com.example.demo.entidad;

import com.sun.istack.NotNull;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
//@Entity para que sprint sepa que es una entidada
@Entity
public class propiedad {
    //Atributos de la entidad
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(unique = true)
    @NotBlank(message = "El nombre no puede estar vacio")
    private String nombre;
    @NotNull
    @Positive(message = "EL precio debe ser mayor a cero")
    private Double precio;
    @NotBlank(message = "La ubicacion no puede estar vacio")

    private String ubicacion;
    @NotBlank(message = "La ubicacion no puede estar vacio")

    private Boolean disponibilidad;
    @NotBlank(message = "El campo no puede estar vacio")

    private String urlImage;
    @NotNull

    private LocalDateTime FehaDecreacion;

    //contador vacio

    public propiedad() {
    }

    //contador con todas las propiedades de la entidad

    public propiedad(Long id, String nombre, Double precio, String ubicacion, Boolean disponibilidad, String urlImage, LocalDateTime fehaDecreacion) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.ubicacion = ubicacion;
        this.disponibilidad = disponibilidad;
        this.urlImage = urlImage;
        FehaDecreacion = fehaDecreacion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Boolean getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(Boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }

    public LocalDateTime getFehaDecreacion() {
        return FehaDecreacion;
    }

    public void setFehaDecreacion(LocalDateTime fehaDecreacion) {
        FehaDecreacion = fehaDecreacion;
    }
}
