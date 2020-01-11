package proof_spring.inversion.de.control;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleados {

	public static void main(String[] args) {
		
		
		
		ClassPathXmlApplicationContext  contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		Empleados e1 = contexto.getBean("generadorDeEmpleadosDirector", Empleados.class);
		Empleados e2 = contexto.getBean("generadorDeEmpleadoSecretario", Empleados.class);
		
		
		
		
		System.out.println("Empleado 1");
		System.out.println(e1.getTareas());
		System.out.println(e1.getInformes());
		
		System.out.println("Empleado 2");
		System.out.println(e2.getTareas());
		System.out.println(e2.getInformes());
	
		contexto.close();
	}

}
