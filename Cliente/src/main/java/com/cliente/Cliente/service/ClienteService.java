package com.cliente.Cliente.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cliente.Cliente.model.Cliente;
import com.cliente.Cliente.repository.ClienteRepository;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente obtenerPorCodigoUnico(String codigoUnico) {
        return clienteRepository.findByCodigoUnico(codigoUnico);
    }
    
    public Cliente crearCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }
}

