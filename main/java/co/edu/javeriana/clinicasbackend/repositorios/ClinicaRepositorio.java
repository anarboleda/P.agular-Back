package co.edu.javeriana.clinicasbackend.repositorios;

import co.edu.javeriana.clinicasbackend.modelos.Clinica;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClinicaRepositorio extends CrudRepository<Clinica, Long> {
}
