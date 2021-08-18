 /*create Database = (Criando Banco de dados) | Drop Database = (Exclui um) */

Create table tb_marcas(
id Bigint(5) auto_increment,
nome varchar(20) not null,
ativo boolean,
primary key(id)
);

/**/
Select * from tb_marcas;

/**/
insert into tb_marcas(nome, ativo) Values ("Nike",True);
insert into tb_marcas(nome, ativo) Values ("fatal Surf",false);

/**/
update tb_marcas set nome = "Fatal Surf", ativo = true where id = 2;

/*Operadores Lógicos*/
Select * from tb_marcas where id = 2; /*Igual a 2 */
Select * from tb_marcas where id < 2; /*Menor que 2*/
Select * from tb_marcas where id > 2; /*Maior que 2*/
Select * from tb_marcas where id >= 2; /*Maior ou Igual a 2*/
Select * from tb_marcas where id = 2; /*Igual a 2*/
Select * from tb_marcas where id <> 2; /*Diferente de 2*/

/*Selects Precisos*/
Select * from tb_marcas; /* "*" signica todas as colunas */
Select nome from tb_marcas; /*Especificando a Coluna Nomes */
Select ativo from tb_marcas; /*Especificando a Coluna Ativo */
Select nome, ativo from tb_marcas; /*Especificando duas Colunas |Ativo|Nome| */

/*Deletando um item na coluna*/
delete from tb_marcas where id = 1;