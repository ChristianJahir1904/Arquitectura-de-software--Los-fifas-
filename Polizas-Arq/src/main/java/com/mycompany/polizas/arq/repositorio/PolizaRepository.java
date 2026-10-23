package com.mycompany.polizas.arq.repositorio;

import com.mycompany.polizas.arq.modelo.Poliza;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.UUID;

@Repository
public interface PolizaRepository extends JpaRepository<Poliza, UUID> {
    // Aquí la llave primaria es el UUID automático
}