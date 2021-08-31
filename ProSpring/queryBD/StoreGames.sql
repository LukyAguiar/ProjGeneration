select * from tb_categoria;

INSERT INTO `bd_storegames`.`tb_categoria` (`genero`,`dimensao2D`,`dimensao3D`)
VALUES('Ação',true,false);

select * from tb_produto;

INSERT INTO `bd_storegames`.`tb_produto` (`descricao`,`nome`,`qtd_estoque`,`valor`,`categoria_id`)
VALUES('Desenvolvido pela Bethesda Game Studios.','The Elder Scrolls V: Skyrim',8,75.68,2);


INSERT INTO `bd_storegames`.`tb_produto` (`genero`,`dimensao2D`,`dimensao3D`)
VALUES('RPG',true,false);

ALTER TABLE bd_storegames.tb_categoria DROP COLUMN dimensao3d;
