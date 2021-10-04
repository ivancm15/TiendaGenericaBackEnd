package co.edu.unbosque.tiendavirtual.tiendavirtualbackendGr3.TiendavirtualbackendGr3.DTO;

//Aqui se originan todos los datos que se pasan por el proyecto

public class Estudiante {
	private int id;
	private String correoInstitucional;
	private String nombres;
	private String apellidos;
	private String telefonoFijo;
	private String telefonoCelular;
	private String correoPersonal;
	private String programa;
	private String fechaNacimiento;
	
	
	public Estudiante(int id, String correoInstitucional, String nombres, String apellidos, String telefonoFijo,
			String telefonoCelular, String correoPersonal, String programa, String fechaNacimiento) {
		super();
		this.id = id;
		this.correoInstitucional = correoInstitucional;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.telefonoFijo = telefonoFijo;
		this.telefonoCelular = telefonoCelular;
		this.correoPersonal = correoPersonal;
		this.programa = programa;
		this.fechaNacimiento = fechaNacimiento;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getCorreoInstitucional() {
		return correoInstitucional;
	}


	public void setCorreoInstitucional(String correoInstitucional) {
		this.correoInstitucional = correoInstitucional;
	}


	public String getNombres() {
		return nombres;
	}


	public void setNombres(String nombres) {
		this.nombres = nombres;
	}


	public String getApellidos() {
		return apellidos;
	}


	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	public String getTelefonoFijo() {
		return telefonoFijo;
	}


	public void setTelefonoFijo(String telefonoFijo) {
		this.telefonoFijo = telefonoFijo;
	}


	public String getTelefonoCelular() {
		return telefonoCelular;
	}


	public void setTelefonoCelular(String telefonoCelular) {
		this.telefonoCelular = telefonoCelular;
	}


	public String getCorreoPersonal() {
		return correoPersonal;
	}


	public void setCorreoPersonal(String correoPersonal) {
		this.correoPersonal = correoPersonal;
	}


	public String getPrograma() {
		return programa;
	}


	public void setPrograma(String programa) {
		this.programa = programa;
	}


	public String getFechaNacimiento() {
		return fechaNacimiento;
	}


	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	
}
