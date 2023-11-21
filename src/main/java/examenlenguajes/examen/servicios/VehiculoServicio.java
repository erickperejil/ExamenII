package examenlenguajes.examen.servicios;

import java.util.List;

import examenlenguajes.examen.modelos.Vehiculos;

public interface VehiculoServicio {
    public Vehiculos crearVehiculos(Vehiculos vehiculo);

    public List<Vehiculos> obtenerVehiculos();

    public Vehiculos obtenerVehiculo(int id);

}
