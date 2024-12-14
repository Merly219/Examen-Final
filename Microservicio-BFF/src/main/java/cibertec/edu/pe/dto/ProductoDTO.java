package cibertec.edu.pe.dto;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;



@Getter
@Setter
public class ProductoDTO {

    private String nombreProducto;

    private String tipoProducto;

    private String estado = "Activo"; 

    private double saldo;

    private LocalDateTime fecha = LocalDateTime.now();
}
