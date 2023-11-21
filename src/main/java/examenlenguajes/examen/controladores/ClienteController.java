package examenlenguajes.examen.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import examenlenguajes.examen.modelos.Cliente;
import examenlenguajes.examen.servicios.impl.ClienteServicioImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/api/carwash")
public class ClienteController {

    @Autowired
    private ClienteServicioImpl clienteServicioImpl;

    @PostMapping("/crearCliente")
    public Cliente crearCliente(@RequestBody Cliente cliente) {
        return clienteServicioImpl.crearCliente(cliente);
    }

    @GetMapping("/obtenerCliente/{id}")
    public Cliente obtenerCliente(@PathVariable(name = "id") int id) {
        return this.clienteServicioImpl.obtenerCliente(id);
    }

    @GetMapping("/obtenerListaClientes")
    public List<Cliente> obtenerClientes() {
        return clienteServicioImpl.obtenerClientes();
    }

}
