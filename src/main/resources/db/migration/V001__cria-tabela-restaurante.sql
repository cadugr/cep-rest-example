create table restaurante (
	id bigint not null auto_increment,
	nome varchar(80) not null,
	taxa_frete decimal(10,2) not null,
	data_atualizacao datetime not null,
	data_cadastro datetime not null,
	
	endereco_cep varchar(9),
	endereco_logradouro varchar(100),
	endereco_uf varchar(10),
	endereco_complemento varchar(60),
	endereco_bairro varchar(60),
	endereco_localidade varchar(100),
	
	primary key (id)
) engine=InnoDB default charset=utf8;
