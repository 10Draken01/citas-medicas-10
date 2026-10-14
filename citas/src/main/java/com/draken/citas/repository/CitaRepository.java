package com.draken.citas.repository;

import com.draken.citas.entity.Cita;
import com.draken.citas.enums.EstadoCita;
import com.draken.commons.enums.EstadoRegistro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CitaRepository extends JpaRepository<Cita, Long> {

    // Metodo para buscar citas por estado de registro
    List<Cita> findByEstadoRegistro(EstadoRegistro estadoRegistro);

    boolean existsByIdPacienteAndEstadoRegistroAndEstadoCitaIn(
            Long idPaciente,
            EstadoRegistro estadoRegistro,
            List<EstadoCita> estadosCita
    );

    boolean existsByIdMedicoAndEstadoRegistroAndEstadoCitaIn(
            Long idMedico,
            EstadoRegistro estadoRegistro,
            List<EstadoCita> estadosCita
    );
}
