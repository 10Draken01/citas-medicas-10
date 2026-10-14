package com.draken.citas.dto;

import com.draken.commons.dto.datos.DatosMedico;
import com.draken.commons.dto.datos.DatosPaciente;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.v3.oas.annotations.media.Schema;

import java.time.LocalDateTime;

@Schema(name = "CitasResponse", description = "Respuesta de la API para la gestión de citas")
public record CitaResponse(
        @Schema(description = "Identificador de la cita", example = "1")
        Long id,

        @Schema(description = "Datos del paciente")
        DatosPaciente paciente,

        @Schema(description = "Datos del medico")
        DatosMedico medico,

        @Schema(description = "Fecha y hora de la cita en formato dd/MM/yyyy HH:mm", example = "20/02/2026 14:30")
        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm")
        LocalDateTime fechaCita,

        @Schema(description = "Síntomas del paciente", example = "Dolor de cabeza persistente acompañado de fiebre y malestar general desde hace dos días.")
        String sintomas,

        @Schema(description = "Estado de la cita", example = "Pendiente de confirmar")
        String estadoCita
) { }