package proof_spring.inversion.de.control;

public abstract class Empleados {
	private String nombre;
	private String email;
	private String nombreEmpresa;
	
	public abstract String getTareas();
	public abstract String getInformes();
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNombreEmpresa() {
		return nombreEmpresa;
	}
	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
