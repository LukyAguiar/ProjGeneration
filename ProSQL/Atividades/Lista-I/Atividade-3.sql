use escola;

/*Crie um banco de dados para um registro de uma escola, onde o sistema trabalhará com as informações dos estudantes deste registro dessa escola. */
create database escola;

/*Crie uma tabela estudantes e utilizando a habilidade de abstração e determine 5 atributos relevantes dos estudantes para se trabalhar com o serviço dessa escola.*/
create table tb_estudante(

	id_matricula bigint(5) auto_increment not null primary key,
    nomeAluno varchar(50),
    notaAluno double,
    telefoneAluno int,
    enderecoAluno varchar(100),
    sexoAluno char
);

select id_matricula,nomeAluno,notaAluno from tb_estudante;

/*Popule esta tabela com até 8 dados;*/ 
insert into tb_estudante(nomeAluno,notaAluno,telefoneAluno,enderecoAluno,sexoAluno) VALUES ("Lucas",10.00,1197854-4512,"Potuvera","M"),
																						("Gabrielle",8.00,1194864-4312,"Itapecerica","F"),
                                                                                        ("Jessica",6.00,1197854-4512,"Aldeinha","F"),
                                                                                        ("Samuel",7.00,1197854-4512,"Alto Potuvera","M"),
                                                                                        ("Gabriel",3.00,1197854-4512,"Esquilos","M"),
                                                                                        ("Cassia",6.00,1197854-4512,"Mobança","F"),
                                                                                        ("Camille",8.50,1197854-4512,"Taboão da Serra","F"),
                                                                                        ("Vanessa",9.00,1197854-4512,"São Lourenço","F");
															
/*Faça um select que retorne o/as estudantes  com a nota maior do que 7.*/
select nomeAluno, notaAluno from tb_estudante where notaAluno > 7; 

/*Faça um select que retorne o/as estudantes  com a nota menor do que 7.*/
select nomeAluno, notaAluno from tb_estudante where notaAluno < 7; 

/*Ao término atualize um dado desta tabela através de uma query de atualização.*/
update tb_estudante set notaAluno = 7.00 where id_matricula = 5;