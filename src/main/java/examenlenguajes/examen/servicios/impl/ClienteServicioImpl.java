package examenlenguajes.examen.servicios.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import examenlenguajes.examen.modelos.Cliente;
import examenlenguajes.examen.modelos.Vehiculos;
import examenlenguajes.examen.repositorios.ClienteRepository;
import examenlenguajes.examen.repositorios.TipoClienteRepository;
import examenlenguajes.examen.servicios.ClienteServicio;

@Service
public class ClienteServicioImpl implements ClienteServicio {

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private TipoClienteRepository tipoClienteRepository;

    @Override
    public Cliente crearCliente(Cliente cliente) {
        if (cliente.getTipo() != null) {
            tipoClienteRepository.save(cliente.getTipo());
        }
        return this.clienteRepository.save(cliente);
    }

    @Override
    public List<Cliente> obtenerClientes() {
        List<Cliente> lista = new ArrayList<>();
        for (var cliente : clienteRepository.findAll()) {
            lista.add(cliente);
        }
        return lista;
    }

    @Override
    public Cliente obtenerCliente(int id) {
        if (clienteRepository.findById(id).get() != null) {
            return clienteRepository.findById(id).get();
        }
        return null;
    }

}
