select * from tb_categoria;

INSERT INTO `bd_storegames`.`tb_categoria` (`genero`,`dimensao2D`,`dimensao3D`)
VALUES('Ação',true,false);

select * from tb_categoria;

INSERT INTO `bd_storegames`.`tb_categoria` (`genero`,`dimensao2D`,`dimensao3D`)
VALUES('RPG',true,false);

ALTER TABLE bd_storegames.tb_categoria DROP COLUMN dimensao3d;
