-- 1. Tabla: cliente
CREATE TABLE cliente (
    curp CHAR(18) NOT NULL,
    nombres VARCHAR(128) NOT NULL,
    primer_apellido VARCHAR(128) NOT NULL,
    segundo_apellido VARCHAR(128),
    direccion VARCHAR(512) NOT NULL,
    fecha_nacimiento DATE NOT NULL,
    CONSTRAINT pk_cliente PRIMARY KEY (curp),
    CONSTRAINT chk_curp_formato CHECK (length(curp) = 18)
);

-- 2. Tabla: poliza
CREATE TABLE poliza (
    clave UUID NOT NULL,
    tipo INTEGER NOT NULL,
    monto NUMERIC(9,2) NOT NULL,
    descripcion TEXT NOT NULL,
    curp_cliente CHAR(18) NOT NULL,
    CONSTRAINT pk_poliza PRIMARY KEY (clave),
    CONSTRAINT fk_poliza_cliente FOREIGN KEY (curp_cliente)
        REFERENCES cliente (curp)
        ON UPDATE CASCADE
        ON DELETE RESTRICT,
    CONSTRAINT chk_poliza_tipo CHECK (tipo IN (0, 1, 2)),
    CONSTRAINT chk_poliza_monto CHECK (monto >= 0)
);

-- 3. Tabla: beneficiario_poliza
CREATE TABLE beneficiario_poliza (
    clave_poliza UUID NOT NULL,
    nombres VARCHAR(128) NOT NULL,
    primer_apellido VARCHAR(128) NOT NULL,
    segundo_apellido VARCHAR(128),
    fecha_nacimiento DATE NOT NULL,
    porcentaje INTEGER NOT NULL,
    CONSTRAINT pk_beneficiario_poliza PRIMARY KEY (clave_poliza, fecha_nacimiento, nombres, primer_apellido),
    CONSTRAINT fk_beneficiario_poliza FOREIGN KEY (clave_poliza)
        REFERENCES poliza (clave)
        ON UPDATE CASCADE
        ON DELETE CASCADE,
    CONSTRAINT chk_porcentaje_rango CHECK (porcentaje > 0 AND porcentaje <= 100)
);

-- Datos iniciales para que el equipo pueda hacer pruebas
INSERT INTO cliente (curp, nombres, primer_apellido, segundo_apellido, direccion, fecha_nacimiento)
VALUES ('GAVC010101HDFRRN01', 'Christian Jahir', 'García', 'Vázquez', 'Av. San Lorenzo Tezonco 123, Iztapalapa, CDMX', '2001-01-01');

INSERT INTO poliza (clave, tipo, monto, descripcion, curp_cliente)
VALUES ('a0eebc99-9c0b-4ef8-bb6d-6bb9bd380a11', 0, 14500.00, 'Seguro automotriz cobertura amplia', 'GAVC010101HDFRRN01');

INSERT INTO beneficiario_poliza (clave_poliza, nombres, primer_apellido, segundo_apellido, fecha_nacimiento, porcentaje)
VALUES ('a0eebc99-9c0b-4ef8-bb6d-6bb9bd380a11', 'Paola', 'Hernández', NULL, '2002-05-14', 100);

