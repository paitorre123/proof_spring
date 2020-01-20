package anotaciones.java;

import org.springframework.stereotype.Component;

@Component("ComercialExperimentado")
public class ComercialExperimentado extends Empleado{

	@Override
	public String getTarea() {
		// TODO Auto-generated method stub
		return "El comercial experimentado lleva a cabo sus tareas";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
