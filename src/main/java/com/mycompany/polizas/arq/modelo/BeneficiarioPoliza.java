package com.mycompany.polizas.arq.modelo;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "beneficiario_poliza")
@IdClass(BeneficiarioPolizaId.class) 
public class BeneficiarioPoliza {

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "clave_poliza", nullable = false)
    private Poliza poliza;

    @Id
    @Column(name = "nombres", length = 128, nullable = false)
    private String nombres;

    @Id
    @Column(name = "primer_apellido", length = 128, nullable = false)
    private String primerApellido;

    @Id
    @Column(name = "fecha_nacimiento", nullable = false)
    private LocalDate fechaNacimiento;

    @Column(name = "segundo_apellido", length = 128)
    private String segundoApellido;

    @Column(name = "porcentaje", nullable = false)
    private Integer porcentaje;

    public BeneficiarioPoliza() {}

    // Getters y Setters
    public Poliza getPoliza() { return poliza; }
    public void setPoliza(Poliza poliza) { this.poliza = poliza; }
    public String getNombres() { return nombres; }
    public void setNombres(String nombres) { this.nombres = nombres; }
    public String getPrimerApellido() { return primerApellido; }
    public void setPrimerApellido(String primerApellido) { this.primerApellido = primerApellido; }
    public String getSegundoApellido() { return segundoApellido; }
    public void setSegundoApellido(String segundoApellido) { this.segundoApellido = segundoApellido; }
    public LocalDate getFechaNacimiento() { return fechaNacimiento; }
    public void setFechaNacimiento(LocalDate fechaNacimiento) { this.fechaNacimiento = fechaNacimiento; }
    public Integer getPorcentaje() { return porcentaje; }
    public void setPorcentaje(Integer porcentaje) { this.porcentaje = porcentaje; }
}