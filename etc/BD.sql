create database pocromualdo;

use pocromualdo;

create table item (
	id int NOT NULL PRIMARY KEY AUTO_INCREMENT,
	variavel VARCHAR(100),
	dtype VARCHAR(100) default "Item"
);