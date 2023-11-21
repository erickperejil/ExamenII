package examenlenguajes.examen.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import examenlenguajes.examen.modelos.Vehiculos;
import examenlenguajes.examen.servicios.impl.VehiculoServicioImpl;

@RestController
@RequestMapping("/api/carwash")
public class VehiculoController {

    @Autowired
    private VehiculoServicioImpl vehiculoServicioImpl;

    @PostMapping("/crearVehiculo")
    public Vehiculos crearVehiculo(@RequestBody Vehiculos vehiculos) {
        return vehiculoServicioImpl.crearVehiculos(vehiculos);
    }

    @GetMapping("/obtenerListaVehiculos")
    public List<Vehiculos> obtenerVehiculos() {
        return vehiculoServicioImpl.obtenerVehiculos();
    }

    @GetMapping("/obtenerVehiculo/{id}")
    public Vehiculos obtenerVehiculo(@PathVariable(name = "id") int id) {
        return this.vehiculoServicioImpl.obtenerVehiculo(id);
    }

}
