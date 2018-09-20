package spring.mvc.crud.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import spring.mvc.crud.model.Usuario;

@Repository
public class UsuarioDAOImpl implements UsuarioDAO{

	NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	@Autowired
	public void setNamedParameterJdbcTemplate(NamedParameterJdbcTemplate namedParameterJdbcTemplate)throws DataAccessException{
		this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
	}
	
	
	public List<Usuario> listAllUsuario() {
		String sql = "SELECT Id, Nombre, Ape_Paterno, Ape_Materno FROM Usuario";
		
		List<Usuario> list = namedParameterJdbcTemplate.query(sql, getSqlParameterByModel(null), new UsuarioMapper());
		
		return list;
	}
	
	private SqlParameterSource getSqlParameterByModel(Usuario usuario) {
		
		MapSqlParameterSource paramSource = new MapSqlParameterSource();
		
		if(usuario != null) {
			paramSource.addValue("Id", usuario.getId());
			paramSource.addValue("Nombre", usuario.getNombre());
			paramSource.addValue("Ape_Paterno", usuario.getApe_Paterno());
			paramSource.addValue("Ape_Materno", usuario.getApe_Materno());
		}
		
		return paramSource;
	}
	
	
	private static final class UsuarioMapper implements RowMapper<Usuario> {
		
		public Usuario mapRow(ResultSet rs, int rowNum) throws SQLException{
			
			Usuario usuario = new Usuario();
			
			usuario.setId(rs.getInt("Id"));
			usuario.setNombre(rs.getString("Nombre"));
			usuario.setNombre(rs.getString("Ape_Paterno"));
			usuario.setNombre(rs.getString("Ape_Materno"));
			
			return usuario;
		}
	}
	
	

	public void addUsuario(Usuario usuario) {
	
		String sql = "INSERT INTO Usuario (Id, Nombre, Ape_Paterno, Ape_Materno) VALUES(:Id, :Nombre, :Ape_Paterno, :Ape_Materno)";
		
		namedParameterJdbcTemplate.update(sql, getSqlParameterByModel(usuario));
	}

	public void updateUsuario(Usuario usuario) {
		
		String sql = "UPDATE Usuario SET Nombre = :Nombre, Ape_Paterno = :Ape_Paterno, Ape_Materno = :Ape_Materno WHERE Id = :Id";
		
		namedParameterJdbcTemplate.update(sql, getSqlParameterByModel(usuario));
	}

	public void deletesuario(int id) {
		
		String sql = "DELETE FROM Usuario WHERE Id = :Id";
		
		namedParameterJdbcTemplate.update(sql, getSqlParameterByModel(new Usuario(id)));		
	}

	public Usuario findUsuarioById(int id) {
		
		String sql = "SELECT * FROM Usuario WHERE Id = :Id";
		
		return namedParameterJdbcTemplate.queryForObject(sql, getSqlParameterByModel(new Usuario(id)), new UsuarioMapper());
	}
	

}
