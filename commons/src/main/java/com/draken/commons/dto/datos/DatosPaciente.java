package com.draken.commons.dto.datos;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(name = "DatosPaciente", description = "Datos del paciente")
public record DatosPaciente(

        @Schema(description = "Nombre del paciente", example = "Juan")
        String nombre,

        @Schema(description = "Numero de expediente del paciente", example = "12345678901234567890")
        String numExpediente,

        @Schema(description = "La edad del paciente", example = "20")
        String edad,

        @Schema(description = "Peso del paciente", example = "70.5")
        String peso,

        @Schema(description = "Estatura del paciente", example = "1.8")
        String estatura,

        @Schema(description = "Indice de masa corporal del paciente", example = "20.5")
        String imc,

        @Schema(description = "El telefono del paciente", example = "9191011001")
        String telefono
) { }