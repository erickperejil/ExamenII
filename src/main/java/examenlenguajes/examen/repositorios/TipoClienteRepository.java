package examenlenguajes.examen.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import examenlenguajes.examen.modelos.TipoCliente;

public interface TipoClienteRepository extends JpaRepository<TipoCliente, Integer> {

}
