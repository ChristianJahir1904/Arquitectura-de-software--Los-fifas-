package com.mycompany.polizas.arq.repositorio;

import com.mycompany.polizas.arq.modelo.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, String> {
    // Al heredar de JpaRepository le decimos: 
    // "Vamoe a manejar la entidad Cliente, y su Llave Primaria (CURP) es un String"
}