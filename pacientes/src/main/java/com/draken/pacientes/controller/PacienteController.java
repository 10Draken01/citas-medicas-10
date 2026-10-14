package com.draken.pacientes.controller;

import com.draken.commons.controller.CrudController;
import com.draken.commons.dto.pacientes.PacienteRequest;
import com.draken.commons.dto.pacientes.PacienteResponse;
import com.draken.pacientes.services.PacienteService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.constraints.Positive;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Tag(name = "Pacientes", description = "Gestion de pacientes medicos")
public class PacienteController extends CrudController<PacienteRequest, PacienteResponse, PacienteService> {
    public PacienteController(PacienteService service) {
        super(service);
    }

    @GetMapping("/id-paciente/{id}")
    @Operation
    @ApiResponse(
            responseCode = "200",
            description = "Buscar registro"
    )
    public ResponseEntity<PacienteResponse> obtenerPorIdSinEstado(
            @PathVariable @Positive(message = "El id debe ser positivo")
            Long id
    ){
        return ResponseEntity.ok(service.obtenerPorIdSinEstado(id));
    }
}

//-- Leer Monolito vs MVC vs Microservicios, IoC, Inyeccion de dependencias,
//-- Clearn arquitectur en springboot, eureka server, reactive api gateway,
//-- faing, microservicios con springboot
