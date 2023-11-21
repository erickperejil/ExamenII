package examenlenguajes.examen.servicios;

import java.util.List;

import examenlenguajes.examen.modelos.Cliente;

public interface ClienteServicio {
    public Cliente crearCliente(Cliente cliente);

    public List<Cliente> obtenerClientes();

    public Cliente obtenerCliente(int id);
}
