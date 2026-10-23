package com.mycompany.polizas.arq.modelo;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;
import java.util.UUID;

public class BeneficiarioPolizaId implements Serializable {
    private UUID poliza;
    private String nombres;
    private String primerApellido;
    private LocalDate fechaNacimiento;

    public BeneficiarioPolizaId() {}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BeneficiarioPolizaId that = (BeneficiarioPolizaId) o;
        return Objects.equals(poliza, that.poliza) &&
               Objects.equals(nombres, that.nombres) &&
               Objects.equals(primerApellido, that.primerApellido) &&
               Objects.equals(fechaNacimiento, that.fechaNacimiento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(poliza, nombres, primerApellido, fechaNacimiento);
    }
}