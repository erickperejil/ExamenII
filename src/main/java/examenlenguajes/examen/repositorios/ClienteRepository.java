package examenlenguajes.examen.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import examenlenguajes.examen.modelos.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}