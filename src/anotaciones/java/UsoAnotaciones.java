package anotaciones.java;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UsoAnotaciones {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(AnotacionesConfig.class);
		
		Empleado ce_1 = contexto.getBean("comercialExperimentado", ComercialExperimentado.class);
		System.out.println(ce_1.getTarea());
		System.out.println(ce_1.getInforme());
		
		
		contexto.close();
	}

}
