package cibertec.edu.pe.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cibertec.edu.pe.services.BffService;

import java.util.Map;

@RestController
@RequestMapping("/api/detalles")
public class BffController {
    private final BffService bffService;

    public BffController(BffService bffService) {
        this.bffService = bffService;
    }

    @GetMapping("/{codigoUnico}")
    public ResponseEntity<Map<String, Object>> getDetails(@PathVariable String codigoUnico) {
        Map<String, Object> details = bffService.getClientDetails(codigoUnico);
        return ResponseEntity.ok(details);
    }
}
