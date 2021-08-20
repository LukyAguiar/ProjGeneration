


/*create Database = (Criando Banco de dados) | Drop Database = (Exclui um) */

use db_estoque;

Create table tb_marcas(
id Bigint(5) auto_increment, -- Bigint(5) equivale até 5 Caracteres (exemplo: 99999)
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
delete from tb_marcas where id = 3;

/*Like*/
Select * from tb_marcas where nome like "%Fa%";
Select * from tb_marcas where ativo = true;

/*Criando Tabelas Produtos*/
create table tb_produtos(

	id_produto bigint auto_increment not null primary key, 
    nomeProduto varchar(30) not null,
    precoProduto decimal(10,2) not null, -- (10,2)    10 = Antes da virgula pode ter 10 digitos --- 2 = Depois da virgula pode vir apenas 2 digitos
	marca_id bigint not null,
    
    -- Colocando Chave Estrangeira na tabela Produtos
    foreign key (marca_id) references tb_marcas(id)
);

/*Inserindo informações na tabela produtos e ligando a FK marca_id ao id da Tabela Marca*/
insert into tb_produtos(nomeProduto,precoProduto,marca_id)
	VALUES ("Camisa Lacoste",80.90,2);
    
insert into tb_produtos(nomeProduto,precoProduto,marca_id)
	VALUES ("Camisa Tommy",50.00, 4);

/*Buscando com LIKE*/
Select * from tb_produtos where nomeProduto like "%La%"; -- Utilizando La
/*Buscando com Condicional = */
Select * from tb_produtos where nomeProduto = "Camisa Lacoste"; -- Nome completo do item no nomeProduto = "Camisa Lacoste", para encontrar o item
/*Buscando PrecoProduto com Condicional = */
Select * from tb_produtos where precoProduto = "80.90";