package com.draken.commons.dto.datos;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(name = "DatosMedico", description = "Datos del médico")
public record DatosMedico(

        @Schema(description = "Nombre del medico", example = "Juan")
        String nombre,

        @Schema(description = "Cedula profesional del medico. Debe contener exactamente 12 caracteres",
                example = "123456789012", minLength = 12, maxLength = 12
        )
        String cedulaProfesional,

        @Schema(description = "La especialidad del medico", example = "9191011001")
        String especialidad
) { }