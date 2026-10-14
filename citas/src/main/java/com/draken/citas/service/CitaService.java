package com.draken.citas.service;

import com.draken.citas.dto.CitaRequest;
import com.draken.citas.dto.CitaResponse;
import com.draken.commons.services.CrudService;

public interface CitaService extends CrudService<CitaRequest, CitaResponse> {
    void actualizarEstadoCita(Long id, Long idEstado);

    void pacienteTieneCitaActiva(Long idPaciente);

    void medicoTieneCitaActiva(Long idMedico);
}
