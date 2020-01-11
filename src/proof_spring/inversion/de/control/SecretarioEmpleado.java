package proof_spring.inversion.de.control;

import inyeccion.dependencias.ICreacionInforme;

public class SecretarioEmpleado extends Empleados {
	
	
	private ICreacionInforme nuevoInforme;
	
	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Secretario Gestiona agenda de jefes";
	}

	@Override
	public String getInformes() {
		// TODO Auto-generated method stub
		return "Secretario muestra su informe: "+ this.nuevoInforme.getInforme();
	}

	public void setNuevoInforme(ICreacionInforme nuevoInforme) {
		this.nuevoInforme = nuevoInforme;
	}
	
	
}
