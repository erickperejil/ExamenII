package examenlenguajes.examen.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import examenlenguajes.examen.modelos.TipoCliente;
import examenlenguajes.examen.servicios.impl.TipoClienteServicioImpl;

@RestController
@RequestMapping("/api/carwash")
public class TipoClienteController {

    @Autowired
    private TipoClienteServicioImpl tipoClienteServicioImpl;

    @PostMapping("/crearTipoCliente")
    public TipoCliente crearTipoCliente(@RequestBody TipoCliente tipoCliente) {
        return this.tipoClienteServicioImpl.crearTipoCliente(tipoCliente);
    }

}
