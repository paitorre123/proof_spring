package anotaciones.java;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnotaciones {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContextJA4.xml");
		
		Empleado ce_1 = contexto.getBean("ComercialExperimentado", ComercialExperimentado.class);
		System.out.println(ce_1.getTarea());;
		
		
		contexto.close();
	}

}
