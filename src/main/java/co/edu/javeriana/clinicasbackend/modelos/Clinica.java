package co.edu.javeriana.clinicasbackend.modelos;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "clinicas")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Clinica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String direccion;
    private String telefono;
    private String ciudad;
}
