package com.mycompany.polizas.arq.repositorio;

import com.mycompany.polizas.arq.modelo.BeneficiarioPoliza;
import com.mycompany.polizas.arq.modelo.BeneficiarioPolizaId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BeneficiarioPolizaRepository extends JpaRepository<BeneficiarioPoliza, BeneficiarioPolizaId> {
    // Aquí usamos la clase de Llave Compuesta que creamos antes
}