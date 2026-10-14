package com.draken.medicos.mapper;

import com.draken.commons.dto.medicos.MedicoRequest;
import com.draken.commons.dto.medicos.MedicoResponse;
import com.draken.commons.enums.DisponibilidadMedico;
import com.draken.commons.enums.EspecialidadMedico;
import com.draken.commons.enums.EstadoRegistro;
import com.draken.commons.mapper.CommonMapper;
import com.draken.medicos.entities.Medico;
import org.springframework.stereotype.Component;

@Component
public class MedicoMapper implements CommonMapper<MedicoRequest, MedicoResponse, Medico> {
    @Override
    public Medico requestAEntidad(MedicoRequest request) {
        return request == null ? null
                : Medico.crear(
                request.nombre(),
                request.apellidoPaterno(),
                request.apellidoMaterno(),
                request.edad(),
                request.email(),
                request.telefono(),
                request.cedulaProfesional()
        );
    }

    public Medico requestAEntidad(
            MedicoRequest request,
            EspecialidadMedico especialidadMedico
    ) {
        Medico medico = requestAEntidad(request);

        medico.asignarEspecialidadMedico(especialidadMedico);

        return medico;
    }

    @Override
    public MedicoResponse entidadAResponse(Medico medico) {
        return medico == null ? null
                : new MedicoResponse(
                        medico.getId(),
                        medico.obtenerNombreCompleto(),
                        medico.getEdad(),
                        medico.getEmail(),
                        medico.getTelefono(),
                        medico.getCedulaProfesional(),
                        medico.getEspecialidadMedico().getDescripcion(),
                        medico.getDisponibilidadMedico().getDescripcion(),
                        medico.getDisponibilidadMedico().getCodigo()
        );
    }
}
