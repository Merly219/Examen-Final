package cibertec.edu.pe.services;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import cibertec.edu.pe.dto.ProductoDTO;

@FeignClient(name = "Productos-financieros", url = "http://localhost:9090/api/productos")
public interface ProductoServiceCliente {
    @GetMapping("/{codigoUnico}")
    List<ProductoDTO> getProductsByCodigoUnico(@PathVariable("codigoUnico") String codigoUnico);
}

