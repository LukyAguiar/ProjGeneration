package org.generation.blogPessoal.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tb_usuario")
public class UsuarioTest {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull(message = "O atributo nome é obrigatório")
	@Size(min = 5, max = 100, 
	message = "O atributo nome deve ter no mínimo 05 e no máximo 100 caracteres")
	private String nome; 
	
	
	@NotNull(message = "O atributo usuário é obrigatório")
	@NotNull(message = "O atributo não pode ser vazio")
	@Email(message = "O atributo usuário deve ser um email")
	private String usuario;
}
