create database quiz_pi;

use quiz_pi;

create table tb_usuario (uname varchar(200) not null primary key, pass varchar(200) not null);

INSERT INTO tb_usuario (uname, pass) values (?, ?);

select * from tb_usuario where uname =? and pass =?;

select * from tb_usuario where uname =?;