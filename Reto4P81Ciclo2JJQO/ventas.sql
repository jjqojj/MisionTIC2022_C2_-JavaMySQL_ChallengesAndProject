CREATE TABLE t_ventas(
id_ventas INT AUTO_INCREMENT PRIMARY KEY,
numero_factura VARCHAR(6) NOT NULL,
cod_producto VARCHAR(8) NOT NULL,
fecha_venta DATE,
cod_vendedor VARCHAR(8),
FOREIGN KEY (cod_producto) REFERENCES t_productos (cod_productos),
FOREIGN KEY (cod_vendedor) REFERENCES t_vendedores (cod_vendedor));	


INSERT INTO t_ventas (numero_factura,cod_producto, fecha_venta,cod_vendedor)
VALUES ('FAC001','AAAAA002','2021-08-21','VEND01');

INSERT INTO t_ventas (numero_factura,cod_producto, fecha_venta,cod_vendedor)
VALUES ('FAC002','AAAAA003','2021-08-21','VEND02');

INSERT INTO t_ventas (numero_factura,cod_producto, fecha_venta,cod_vendedor)
VALUES ('FAC003','BBBBB001','2021-08-21','VEND01');

INSERT INTO t_ventas (numero_factura,cod_producto, fecha_venta,cod_vendedor)
VALUES ('FAC004','AAAAA002','2021-08-21','VEND03');

INSERT INTO t_ventas (numero_factura,cod_producto, fecha_venta,cod_vendedor)
VALUES ('FAC005','AAAAA001','2021-08-22','VEND01');

INSERT INTO t_ventas (numero_factura,cod_producto, fecha_venta,cod_vendedor)
VALUES ('FAC006','AAAAA002','2021-08-22','VEND02');