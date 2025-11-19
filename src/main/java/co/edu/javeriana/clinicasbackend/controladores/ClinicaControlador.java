package co.edu.javeriana.clinicasbackend.controladores;

import co.edu.javeriana.clinicasbackend.dtos.ClinicaDTO;
import co.edu.javeriana.clinicasbackend.servicios.ClinicaServicio;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clinicas")
@CrossOrigin(origins = "http://localhost:4200") // para permitir al Angular local
@RequiredArgsConstructor
public class ClinicaControlador {

    private final ClinicaServicio clinicaServicio;

    @GetMapping
    public List<ClinicaDTO> listarClinicas() {
        return clinicaServicio.listarTodas();
    }

    @PostMapping
    public ClinicaDTO crearClinica(@RequestBody ClinicaDTO clinicaDTO) {
        return clinicaServicio.crear(clinicaDTO);
    }
}
