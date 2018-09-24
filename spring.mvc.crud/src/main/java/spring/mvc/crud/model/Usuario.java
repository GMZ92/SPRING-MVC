package spring.mvc.crud.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Usuario")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "Nombre")
	private String Nombre;
	
	@Column(name = "Ape_Paterno")
	private String Ape_Paterno;
	
	@Column(name = "Ape_Materno")
	private String Ape_Materno;
	
	
	public Usuario() {
		super();
	}
	
	public Usuario(Integer id) {
		super();
		this.id = id;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getNombre() {
		return Nombre;
	}


	public void setNombre(String nombre) {
		Nombre = nombre;
	}


	public String getApe_Paterno() {
		return Ape_Paterno;
	}


	public void setApe_Paterno(String ape_Paterno) {
		Ape_Paterno = ape_Paterno;
	}


	public String getApe_Materno() {
		return Ape_Materno;
	}


	public void setApe_Materno(String ape_Materno) {
		Ape_Materno = ape_Materno;
	}
	
	
	
	
	
	
}
