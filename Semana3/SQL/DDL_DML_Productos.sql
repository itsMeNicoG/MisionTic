CREATE TABLE Empresa (
    ID_Empresa INTEGER NOT NULL,
    Nombre VARCHAR(30) NOT NULL,
    NIT VARCHAR(15) NOT NULL UNIQUE,
    Fecha_Inicio DATETIME NOT NULL,
    Antiguedad INTEGER GENERATED ALWAYS AS(DATETIME("2021-01-01") - Fecha_Inicio),
    PRIMARY KEY (ID_Empresa)
);

INSERT INTO Empresa (Nombre, NIT, Fecha_Inicio) VALUES (
    "AutoCultivo Shop", 
    "123456-7", 
    "2010-05-12"
);

INSERT INTO Empresa (ID_Empresa, Nombre, NIT, Fecha_Inicio) VALUES (
    420, 
    "MalaGanjah", 
    "666942-0", 
    "2017-04-20"
);

CREATE TABLE Proveedor (
    ID_Proveedor INTEGER NOT NULL,
    Nombre VARCHAR(30) NOT NULL,
    Direccion VARCHAR(30) NOT NULL,
    NIT VARCHAR(15) NOT NULL UNIQUE,
    PRIMARY KEY (ID_Proveedor)
);

INSERT INTO Proveedor(Nombre,Direccion, NIT) VALUES (
    "LightsMaker", 
    "Avenida Siempre Viva 123", 
    "690042-0"
);

INSERT INTO Proveedor(Nombre,Direccion, NIT) VALUES (
    "DutchSeeds", 
    "Evergreen Av 420", 
    "004206-9"
);

CREATE TABLE Producto (
    ID_Producto INTEGER NOT NULL,
    Nombre VARCHAR(30) NOT NULL,
    Codigo VARCHAR(30) NOT NULL,
    Precio_Unitario INTEGER NOT NULL,
    Impuesto REAL GENERATED ALWAYS AS(Precio_Unitario * 0.19),    
    ID_Empresa INTEGER NOT NULL,
    ID_Proveedor INTEGER NOT NULL,
    PRIMARY KEY (ID_Producto),
    FOREIGN KEY (ID_Empresa) REFERENCES Empresa(ID_Empresa),
    FOREIGN KEY (ID_Proveedor) REFERENCES Proveedor(ID_Proveedor)
);

INSERT INTO Producto() VALUES (

);