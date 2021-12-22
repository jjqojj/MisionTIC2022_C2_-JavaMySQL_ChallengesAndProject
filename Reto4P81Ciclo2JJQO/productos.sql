CREATE TABLE t_productos(
cod_producto VARCHAR(8) PRIMARY KEY,
nombre_producto VARCHAR(30) NOT NULL,
descripcion_producto VARCHAR(60),
precio_producto FLOAT);


INSERT INTO t_productos (cod_producto,nombre_producto,descripcion_producto,precio_producto)
 VALUES ('AAAAA001','PILA DOBLE AA','BATERIAS',9000);

INSERT INTO t_productos (cod_producto,nombre_producto,descripcion_producto,precio_producto)
VALUES ('AAAAA002','PILA TRIPLE AAAA','BATERIAS',7000);

INSERT INTO t_productos (cod_producto,nombre_producto,descripcion_producto,precio_producto)
VALUES ('AAAAA003','PILA GRUESA 9V','BATERIAS',12000);

INSERT INTO t_productos (cod_producto,nombre_producto,descripcion_producto,precio_producto)
VALUES ('BBBBB001','UPS 1KVA','BATERIAS',160000);

INSERT INTO t_productos (cod_producto,nombre_producto,descripcion_producto,precio_producto)
VALUES ('BBBBB002','UPS 5KVA','BATERIAS',2500000);