use RH;
/*1 - Crie um banco de dados para um serviço de RH de uma empresa, onde o sistema trabalhará com as informações dos funcionaries desta empresa. */
Create Database RH;

/*2 - Crie um banco de dados para um serviço de RH de uma empresa, onde o sistema trabalhará com as informações dos funcionaries desta empresa. */
Create Table tb_Funcionario(
	id_func bigint(5) auto_increment not null,
    tercerizado boolean,
    nome varchar(50),
    cpf bigint(20),
    telefone varchar(15),
    salario int,
    primary key(id_func)
);

/*3 - Teste mostrando Tabela*/
select * from tb_Funcionario;

/*4 - Popule esta tabela com até 5 dados;*/
Insert Into tb_Funcionario(tercerizado,nome,cpf,salario,telefone) VALUES (true,"Lucas",45748525450,2500,11848-8894),
																		 (true,"Gabriel",4574851452,2000,11988-8784),
                                                                         (true,"Samuel",45756525524,1200,11818-8884),
                                                                         (true,"Heron",45748154175,3200,11838-4884),
                                                                         (true,"Ronaldinha Gaucho",45748545589,1500,11788-8684);
																
                                                                
/*5 - Faça um select que retorne os funcionaries com o salário maior do que 2000.*/
Select * from tb_Funcionario where salario > 2000; 

/*6 - Faça um select que retorne os funcionaries com o salário menor do que 2000.*/
Select * from tb_Funcionario where salario < 2000;

/*7 - Ao término atualize um dado desta tabela através de uma query de atualização. */
update tb_Funcionario set tercerizado = false where id_func = 1;