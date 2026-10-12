package com.draken.pacientes.services;

import com.draken.commons.dto.pacientes.PacienteRequest;
import com.draken.commons.dto.pacientes.PacienteResponse;
import com.draken.commons.services.CrudService;

public interface PacienteService extends CrudService<PacienteRequest, PacienteResponse> {
    PacienteResponse obtenerPacientePorId(Long id);
}
