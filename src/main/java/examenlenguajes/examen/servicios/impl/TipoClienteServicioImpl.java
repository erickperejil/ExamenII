package examenlenguajes.examen.servicios.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import examenlenguajes.examen.modelos.TipoCliente;
import examenlenguajes.examen.repositorios.TipoClienteRepository;
import examenlenguajes.examen.servicios.TipoClienteServicio;

@Service
public class TipoClienteServicioImpl implements TipoClienteServicio {

    @Autowired
    private TipoClienteRepository tipoClienteRepository;

    @Override
    public TipoCliente crearTipoCliente(TipoCliente tipoCliente) {
        return tipoClienteRepository.save(tipoCliente);
    }

}
