package proof_spring.inversion.de.control;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleados {

	public static void main(String[] args) {
		
		
		
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Empleados e1 = contexto.getBean("generadorDeEmpleados", Empleados.class);
		
		contexto.close();
		
		System.out.println(e1.getTareas());
		System.out.println(e1.getInformes());
	}

}
