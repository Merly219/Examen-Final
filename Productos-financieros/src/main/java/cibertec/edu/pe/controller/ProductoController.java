package cibertec.edu.pe.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import cibertec.edu.pe.entity.Producto;
import cibertec.edu.pe.services.ProductoService;

import java.util.List;

@RestController
@RequestMapping("/api/productos")
public class ProductoController {
    private final ProductoService productoService;

    public ProductoController(ProductoService productoService) {
        this.productoService = productoService;
    }

    @GetMapping("/{codigoUnico}")
    public ResponseEntity<?> obtenerProductos(@PathVariable String codigoUnico) {
        List<Producto> productos = productoService.obtenerProductosPorCodigoUnico(codigoUnico);
        if (productos.isEmpty()) {
            return ResponseEntity.status(404).body("No se encontraron productos para el cliente.");
        }
        return ResponseEntity.ok(productos);
    }
    
    @PostMapping("/crearProducto")
    public ResponseEntity<Producto> crearProducto(@RequestBody Producto producto) {
        Producto nuevoProducto = productoService.crearProducto(producto);
        return ResponseEntity.status(HttpStatus.CREATED).body(nuevoProducto);
    }
}
