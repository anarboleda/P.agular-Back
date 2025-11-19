package co.edu.javeriana.clinicasbackend.dtos;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClinicaDTO {

    private Long id;
    private String nombre;
    private String direccion;
    private String telefono;
    private String ciudad;
}
