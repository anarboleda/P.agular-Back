package co.edu.javeriana.clinicasbackend.servicios;

import co.edu.javeriana.clinicasbackend.dtos.ClinicaDTO;
import co.edu.javeriana.clinicasbackend.modelos.Clinica;
import co.edu.javeriana.clinicasbackend.repositorios.ClinicaRepositorio;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ClinicaServicio {

    private final ClinicaRepositorio clinicaRepositorio;
    private final ModelMapper modelMapper;

    public List<ClinicaDTO> listarTodas() {
        List<ClinicaDTO> resultado = new ArrayList<>();
        for (Clinica c : clinicaRepositorio.findAll()) {
            resultado.add(modelMapper.map(c, ClinicaDTO.class));
        }
        return resultado;
    }

    public ClinicaDTO crear(ClinicaDTO dto) {
        Clinica entidad = modelMapper.map(dto, Clinica.class);
        Clinica guardada = clinicaRepositorio.save(entidad);
        return modelMapper.map(guardada, ClinicaDTO.class);
    }
}
