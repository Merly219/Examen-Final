package cibertec.edu.pe.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import cibertec.edu.pe.entity.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
    List<Producto> findByCodigoUnico(String codigoUnico);
}