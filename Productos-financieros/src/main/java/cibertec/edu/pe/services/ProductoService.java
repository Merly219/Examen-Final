package cibertec.edu.pe.services;

import java.util.List;

import org.springframework.stereotype.Service;

import cibertec.edu.pe.entity.Producto;
import cibertec.edu.pe.repository.ProductoRepository;

@Service
public class ProductoService{
    private final ProductoRepository productoRepository;

    public ProductoService(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    public List<Producto> obtenerProductosPorCodigoUnico(String codigoUnico) {
        return productoRepository.findByCodigoUnico(codigoUnico);
    }
    
    public Producto crearProducto(Producto producto) {
        if (producto.getCodigoUnico() == null || producto.getCodigoUnico().isEmpty()) {
            throw new IllegalArgumentException("El código único del producto es obligatorio.");
        }
        return productoRepository.save(producto);
    }
}
