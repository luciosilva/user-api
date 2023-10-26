create schema if not exists userapi-db;

create table user-api-db.user (
    id bigserial primary key,
    nome varchar(100) not null,
    cpf varchar(100) not null,
    endereco varchar(100) not null,
	email varchar(100) not null,
	telefone varchar(100) not null,
    data_cadastro timestamp not null
);