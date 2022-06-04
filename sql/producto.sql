
create schema producto;
use producto;
create table producto(
cod_producto int not null primary key auto_increment,
nombre varchar(30) not null,
val_compra int not null,
val_venta int not null,
cantidad int not null,
categoria varchar(30)
);