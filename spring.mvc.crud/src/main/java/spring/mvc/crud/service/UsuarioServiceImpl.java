package spring.mvc.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.mvc.crud.dao.UsuarioDAO;
import spring.mvc.crud.model.Usuario;

@Service
public class UsuarioServiceImpl implements UsuarioService{

	UsuarioDAO usuarioDAO;
	
	@Autowired
	public void setUsuarioDAO(UsuarioDAO usuarioDAO) {
		this.usuarioDAO = usuarioDAO;
	}

	
	public List<Usuario> listAllUsuario() {
		return usuarioDAO.listAllUsuario();
	}

	public void addUsuario(Usuario usuario) {
		usuarioDAO.addUsuario(usuario);
		
	}

	public void updateUsuario(Usuario usuario) {
		usuarioDAO.updateUsuario(usuario);
		
	}

	public void deletesuario(int id) {
		usuarioDAO.deletesuario(id);
	}

	public Usuario findUsuarioById(int id) {
		return usuarioDAO.findUsuarioById(id);
	}

}
