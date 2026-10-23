package com.mycompany.polizas.arq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PolizasArq {

    public static void main(String[] args) {
        // Esta líneaarranca Spring Boot (conecta la Base de Datos y lee las Entidades)
        SpringApplication.run(PolizasArq.class, args);
        
        System.out.println("=================================================");
        System.out.println("¡SISTEMA INTERMEDIARIO DE PÓLIZAS INICIADO!");
        System.out.println("Conectado a PostgreSQL y listo para usar Swing.");
        System.out.println("=================================================");
    }
}