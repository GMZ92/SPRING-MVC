package spring.mvc.crud.service;

import java.util.List;

import spring.mvc.crud.model.Usuario;

public interface UsuarioService {

	public List<Usuario> listAllUsuario();
	
	public void addUsuario(Usuario usuario);
	
	public void updateUsuario(Usuario usuario);
	
	public void deletesuario(int id);
	
	public Usuario findUsuarioById(int id);
	
}
