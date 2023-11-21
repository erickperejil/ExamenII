package examenlenguajes.examen.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import examenlenguajes.examen.modelos.TipoVehiculo;
import examenlenguajes.examen.servicios.impl.TipoVehiculoServicioImpl;

@RestController
@RequestMapping("/api/carwash")
public class TipoVehiculoController {

    @Autowired
    private TipoVehiculoServicioImpl tipoVehiculoServicioImpl;

    @PostMapping("/crearTipoVehiculo")
    public TipoVehiculo crearTipoVehiculo(@RequestBody TipoVehiculo tipoVehiculo) {
        return this.tipoVehiculoServicioImpl.crearTipoVehiculo(tipoVehiculo);
    }
}
