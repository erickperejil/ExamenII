package examenlenguajes.examen.servicios.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import examenlenguajes.examen.modelos.Vehiculos;
import examenlenguajes.examen.repositorios.TipoVehiculoRepository;
import examenlenguajes.examen.repositorios.VehiculosRepository;
import examenlenguajes.examen.servicios.VehiculoServicio;

@Service
public class VehiculoServicioImpl implements VehiculoServicio {

    @Autowired
    private VehiculosRepository vehiculosRepository;
    @Autowired
    private TipoVehiculoRepository tipoVehiculoRepository;

    @Override
    public Vehiculos crearVehiculos(Vehiculos vehiculo) {
        if (vehiculo.getTipo() != null) {

            tipoVehiculoRepository.save(vehiculo.getTipo());
        }
        return this.vehiculosRepository.save(vehiculo);
    }

    @Override
    public List<Vehiculos> obtenerVehiculos() {

        List<Vehiculos> lista = new ArrayList<>();
        for (var vehiculo : vehiculosRepository.findAll()) {
            lista.add(vehiculo);
        }
        return lista;
    }

    @Override
    public Vehiculos obtenerVehiculo(int id) {
        if (vehiculosRepository.existsById(id)) {
            return vehiculosRepository.findById(id).get();
        }
        return null;
    }

}
