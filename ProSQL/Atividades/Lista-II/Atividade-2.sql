use db_pizzaria_legal;

/**/
create database db_pizzaria_legal; 

/*Crie uma tabela de categorias utilizando a habilidade de abstração e determine 3 atributos relevantes do tb_categoria para se trabalhar com o serviço dessa pizzaria.*/
create table tb_categoria(
	id_categoria bigint(5) not null auto_increment primary key,
    catBebidas varchar(20) not null,
    precoBebidas float not null,
    catSalgado varchar(20) not null,
    precoSalgado float not null,
    catLanche varchar(20) not null,
    precoSalgado float not null
);

/*Crie uma tabela de categorias utilizando a habilidade de abstração e determine 3 atributos relevantes do tb_categoria para se trabalhar com o serviço dessa pizzaria.*/
create table tb_pizza(
	id_pizza bigint(5) not null auto_increment primary key, 
    nomePizza varchar(80) not null,
    tipoPizza varchar(80) not null,
    precoPizza int not null,
	tamanhoPizza char not null,
    
    foreign key (id_pizza) references tb_categoria(id_categoria) 
);

/*Popule esta tabela Categoria com até 5 dados.*/
insert into tb_categoria(catBebidas,precoBebidas,catSalgado,precoSalgado,catLanche,precoSalgado) 
VALUES 
("Coca-Cola",5.00,"Coxinha",3.00,"Sanduba",5.00),
("Guarana",6.00,"Bauru",4.00,"Misto-Quente",5.00),
("Pepsi",4.00,"Rolinho-Primavera",5.00,"X-Tudo",9.00),
("Tubaina",6.00,"Kibe",3.00,"X-Bacon",6.00),
("Dolly",4.00,"Esfiha",5.00,"X-Salada",6.50);

/*Popule esta tabela pizza com até 8 dados.*/
insert into tb_pizza(nomePizza,tipoPizza,precoPizza,tamanhoPizza)
Values
("Calabresa","muçarela, calabresa, cebola e azeitonas",38.90,"G|M|P"),
("Marguerita","molho, muçarela, tomate e manjericão",38.90,"G|M|P"),
("Frango com catupiry","muçarela, frango desfiado, catupiry e azeitonas",38.90,"G|M|P"),
("Mussarela","muçarela, rodelas de tomate e azeitonas",38.90,"G|M|P"),
("Napolitana","muçarela, presunto, tomate, catupiry e azeitona",43.90,"G|M|P"),
("Brigadeiro","chocolate e granulado",38.90,"G|M|P"),
("Romeu e Julieta","mussarela e goiabada",38.90,"G|M|P"),
("Alho Poró","muçarela, alho poró, cream cheese, bacon e azeitonas", 43.90,"G|M|P");

/*Faça um select que retorne os Produtos com o valor maior do que 45 reais.*/




/*Faça um select trazendo  os Produtos com valor entre 29 e 60 reais.*/



/*Faça um select  utilizando LIKE buscando os Produtos com a letra C.*/



/*Faça um um select com Inner join entre  tabela categoria e pizza.*/



/*Faça um select onde traga todos os Produtos de uma categoria específica (exemplo todos os produtos que são pizza doce).*/


