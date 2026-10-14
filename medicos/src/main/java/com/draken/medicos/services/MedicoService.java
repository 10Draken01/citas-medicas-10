package com.draken.medicos.services;

import com.draken.commons.dto.medicos.MedicoRequest;
import com.draken.commons.dto.medicos.MedicoResponse;
import com.draken.commons.services.CrudService;

public interface MedicoService extends CrudService<MedicoRequest, MedicoResponse> {
    MedicoResponse obtenerMedicoPorIdSinEstado(Long id);

    void actualizarDisponibilidadMedico(Long id, Long idDisponibilidad);

    void actualizarDisponibilidadPorCita(Long id, Long idDisponibilidad);
}
