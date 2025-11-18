package com.ejemplo.clinicas.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class ClinicaDTO {
    private Long identificador;
    private String nombre;
    private String direccion;
    private Integer cantidadCamas;
    private String telefono;
    private String ciudad;
    private LocalDate fechaCreacion;
}
