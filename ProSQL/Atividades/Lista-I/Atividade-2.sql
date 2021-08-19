use e_commerce;

/*1 - Crie um banco de dados para um e commerce, onde o sistema trabalhará com as informações dos produtos deste ecommerce. */

create database e_commerce;

/*2 - Crie uma tabela produtos e utilizando a habilidade de abstração e determine 5 atributos relevantes dos produtos para se trabalhar com o serviço deste ecommerce.*/

create table tb_produto(

	id_Produto bigint(5) auto_increment primary key,
	nomeProduto varchar(40),
    qtdProduto int,
	valorProduto double,
    prodDescricao varchar(100)
	
);


select * from tb_produto;

/*3 - Popule esta tabela com até 8 dados*/

Insert into tb_produto(nomeProduto,qtdProduto,valorProduto,prodDescricao) VALUES ("Tênis Nike",10,600,"EUA|Tam:40"),
																				 ("Tênis Adidas",10,700,"EUA|Tam:40"),
                                                                                 ("Tênis Lacoste",10,900,"EUA|Tam:40"),
                                                                                 ("Tênis Oakley",10,700,"EUA|Tam:40"),
                                                                                 ("Tênis Jordan",10,1600,"EUA|Tam:40"),
                                                                                 ("Tênis Ronaldinho",8000,600,"EUA|Tam:40"),
                                                                                 ("Tênis Meteoro",10,50,"EUA|Tam:40"),
                                                                                 ("Tênis Ben10",10,200,"EUA|Tam:40");
                                                                                
/*4 - Faça um select que retorne os produtos com o valor maior do que 500.*/
Select * from tb_Produto where valorProduto > 500; 

/*5 Faça um select que retorne os produtos com o valor menor do que 500.*/
Select * from tb_Produto where valorProduto < 500; 

/*6 Ao término atualize um dado desta tabela através de uma query de atualização. */
update tb_Produto set valorProduto = 200000 where id_Produto = 6;
update tb_Produto set qtdProduto = 1 where id_Produto = 6;