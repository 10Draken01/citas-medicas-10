package com.draken.pacientes.mapper;

import com.draken.commons.dto.pacientes.PacienteRequest;
import com.draken.commons.dto.pacientes.PacienteResponse;
import com.draken.commons.enums.EstadoRegistro;
import com.draken.commons.mapper.CommonMapper;
import com.draken.pacientes.entities.Paciente;
import org.springframework.stereotype.Component;

@Component
public class PacienteMapper implements CommonMapper<PacienteRequest, PacienteResponse, Paciente> {
    @Override
    public Paciente requestAEntidad(PacienteRequest request) {
        return request == null ? null
                : Paciente.crear(
                request.nombre(),
                request.apellidoPaterno(),
                request.apellidoMaterno(),
                request.edad(),
                request.peso(),
                request.estatura(),
                request.email(),
                request.telefono(),
                request.direccion()
        );
    }

    @Override
    public PacienteResponse entidadAResponse(Paciente paciente) {
        return paciente == null ? null
                : new PacienteResponse(
                        paciente.getId(),
                        paciente.obtenerNombreCompleto(),
                        paciente.getEdad(),
                        paciente.getPeso(),
                        paciente.getEstatura(),
                        paciente.getImc(),
                        paciente.getEmail(),
                        paciente.getTelefono(),
                        paciente.getDireccion(),
                        paciente.getNumExpediente()
        );
    }
}
