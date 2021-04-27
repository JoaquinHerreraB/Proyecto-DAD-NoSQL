

insert into `tipo_negocio` (id, nombre, descripcion) values (1,'Bodega','Productos del día a día. Diferentes tipos de producto');
insert into `tipo_negocio` (id, nombre, descripcion) values (2,'Dulcería','Productos de consumo rápido. Dulces, snacks, etc.');
insert into `tipo_negocio` (id, nombre, descripcion) values (3,'Panadería','Productos relacionados con repostería y afines.');

insert into `usuario` (tipo, id, email, password, dni,first_name, last_name) values ('C',1, 'rosa@unmsm.com','$2a$10$xBPpxqLBdUXblMGkCwadr.hsNVyJk04A3hb4Fcjn79YeYzAtYCZzC', 'kstrauss0', 'Rosa', 'Strauss');
insert into `usuario` (tipo, id, email, password, dni,first_name, last_name) values ('C',2, 'cfeldstern1@ucoz.ru', '$2a$10$xBPpxqLBdUXblMGkCwadr.hsNVyJk04A3hb4Fcjn79YeYzAtYCZzC', 'ekornel3','Elliott', 'Kornel');
insert into `usuario` (tipo, id, email, password, ruc, nombre,direccion,imagen,puntuacion,id_tipo_negocio)  values ('N',3, 'alex@listo.com','$2a$10$xBPpxqLBdUXblMGkCwadr.hsNVyJk04A3hb4Fcjn79YeYzAtYCZzC', '21604816111','Bodega Margarita', "Av Marina 123",'bdm.jpg', 76,1);
insert into `usuario` (tipo, id, email, password, ruc, nombre,direccion,imagen,puntuacion,id_tipo_negocio)  values ('N',4, 'mcastro2@utmo.com','$2a$10$xBPpxqLBdUXblMGkCwadr.hsNVyJk04A3hb4Fcjn79YeYzAtYCZzC', '11604816111','Cicala y Catita', "Calle Las Flores 33", 'ccc.jpg', 87,1);
insert into `usuario` (tipo, id, email, password, ruc, nombre,direccion,imagen,puntuacion,id_tipo_negocio)  values ('N',5, 'osstern100@bing.com','$2a$10$xBPpxqLBdUXblMGkCwadr.hsNVyJk04A3hb4Fcjn79YeYzAtYCZzC','21604812111', 'Minimarket Casimiro', "Av Marina 445" ,'mnmcasim.jpg', 98,2);
insert into `usuario` (tipo, id, email, password, ruc, nombre,direccion,imagen,puntuacion,id_tipo_negocio)  values ('N',6, 'mariciell0@bing.com','$2a$10$xBPpxqLBdUXblMGkCwadr.hsNVyJk04A3hb4Fcjn79YeYzAtYCZzC', '21654816121','Repostera Maricielo', "Av Marina 411" ,'bdmc.jpg', 67,2);


insert into `categoria` (id, nombre, descripcion) values (1,'Lacteo','Productos derivados de la leche');
insert into `categoria` (id, nombre, descripcion) values (2,'Galleta Dulce','Galletas empaquetadas de sabores dulces');
insert into `categoria` (id, nombre, descripcion) values (3,'Snack','Snacks empaquetadas, pequeños o grandes');
insert into `categoria` (id, nombre, descripcion) values (4,'Bebidas','Productos bebibles que incluye gaseosas, refrescos, etc');

insert into `producto` (id, nombre, marca,precio,puntuacion,id_categoria,id_negocio) values (1,'Tarro de Leche Gloria Azul','Gloria', 3.50, 78,1,3 );
insert into `producto` (id, nombre, marca,precio,puntuacion,id_categoria,id_negocio) values (2,'Tarro de Leche Gloria Roja','Gloria', 3.80, 75,1,3 );
insert into `producto` (id, nombre, marca,precio,puntuacion,id_categoria,id_negocio) values (3,'Empaque Queso Crema','Philadelphia', 7.50 , 68,1,3 );

insert into `producto` (id, nombre, marca,precio,puntuacion,id_categoria,id_negocio) values (4,'Tarro de Leche Gloria','Gloria', 3.50,  78,1,4 );
insert into `producto` (id, nombre, marca,precio,puntuacion,id_categoria,id_negocio) values (5,'Leche Condensada','Gloria', 5.00,  89,1,4 );

insert into `producto` (id, nombre, marca,precio,puntuacion,id_categoria,id_negocio) values (6,'Galleta Picaras Clásicas 6 u','Winters', 3.00,  87,2,3 );
insert into `producto` (id, nombre, marca,precio,puntuacion,id_categoria,id_negocio) values (7,'Galleta Picaras Extremas 6 u','Winters', 3.00,  89,2,3 );
insert into `producto` (id, nombre, marca,precio,puntuacion,id_categoria,id_negocio) values (8,'Paquete Doritos 210g','Frito-Lay', 8.40 , 78,3,3 );
insert into `producto` (id, nombre, marca,precio,puntuacion,id_categoria,id_negocio) values (9,'Paquete Cheetos 200g','Frito-Lay', 7.00 , 86,3,3 );

insert into `producto` (id, nombre, marca,precio,puntuacion,id_categoria,id_negocio) values (10,'Paquete Picaras Clásicas 6 u','Winters', 3.20,  84,2,4 );
insert into `producto` (id, nombre, marca,precio,puntuacion,id_categoria,id_negocio) values (11,'Paquete Cheetos Grande (200g)','Frito-Lay', 7.50 , 67,3,4 );
