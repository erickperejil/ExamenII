package examenlenguajes.examen.servicios.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import examenlenguajes.examen.modelos.TipoVehiculo;
import examenlenguajes.examen.repositorios.TipoVehiculoRepository;
import examenlenguajes.examen.servicios.TipoVehiculoServicio;

@Service
public class TipoVehiculoServicioImpl implements TipoVehiculoServicio {

    @Autowired
    private TipoVehiculoRepository tipoVehiculoRepository;

    @Override
    public TipoVehiculo crearTipoVehiculo(TipoVehiculo tipoVehiculo) {
        return this.tipoVehiculoRepository.save(tipoVehiculo);
    }

}
