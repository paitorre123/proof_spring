package proof_spring.inversion.de.control;

import inyeccion.dependencias.ICreacionInforme;

public class DirectorEmpleado extends Empleados {
	
	
	private ICreacionInforme nuevoInforme;
	
	public DirectorEmpleado(ICreacionInforme nuevoInforme) {
		this.nuevoInforme = nuevoInforme;
	}
	
	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Director Gestiona la empresa";
	}

	@Override
	public String getInformes() {
		// TODO Auto-generated method stub
		return "Director muestra su informe: "+ this.nuevoInforme.getInforme();
	}

	public void setNuevoInforme(ICreacionInforme nuevoInforme) {
		this.nuevoInforme = nuevoInforme;
	}
	
	
}
