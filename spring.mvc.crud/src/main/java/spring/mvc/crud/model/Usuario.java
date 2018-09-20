package spring.mvc.crud.model;

public class Usuario {

	private Integer id;
	private String Nombre;
	private String Ape_Paterno;
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
