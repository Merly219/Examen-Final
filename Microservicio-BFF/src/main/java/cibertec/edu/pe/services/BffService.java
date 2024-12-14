package cibertec.edu.pe.services;


import org.springframework.stereotype.Service;

import cibertec.edu.pe.dto.ClienteDTO;
import cibertec.edu.pe.dto.ProductoDTO;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class BffService {
    private final ClienteServiceCliente clienteServiceCliente;
    private final ProductoServiceCliente productoServiceCliente;

    public BffService(ClienteServiceCliente clienteServiceCliente, ProductoServiceCliente productoServiceCliente) {
        this.clienteServiceCliente = clienteServiceCliente;
        this.productoServiceCliente = productoServiceCliente;
    }

    public Map<String, Object> getClientDetails(String codigoUnico) {
        ClienteDTO client = clienteServiceCliente.getClientByCodigoUnico(codigoUnico);
        List<ProductoDTO> products = productoServiceCliente.getProductsByCodigoUnico(codigoUnico);

        Map<String, Object> response = new HashMap<>();
        response.put("cliente", client);
        response.put("productos", products);

        return response;
    }
}
