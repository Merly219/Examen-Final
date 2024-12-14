package cibertec.edu.pe.services;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import cibertec.edu.pe.dto.ClienteDTO;

@FeignClient(name = "Cliente", url = "http://localhost:9007/api/clientes")
public interface ClienteServiceCliente {
    @GetMapping("/{codigoUnico}")
    ClienteDTO getClientByCodigoUnico(@PathVariable("codigoUnico") String codigoUnico);
}

