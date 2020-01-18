package singleton.prototype;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import proof_spring.inversion.de.control.DirectorEmpleado;
import proof_spring.inversion.de.control.SecretarioEmpleado;

public class UsoSingletonPrototype {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
		
		//::::singleton
		System.out.println(":::SINGLETON:::");
		SecretarioEmpleado se_1 = context.getBean("generadorDeEmpleadoSecretario", SecretarioEmpleado.class);
		SecretarioEmpleado se_2 = context.getBean("generadorDeEmpleadoSecretario", SecretarioEmpleado.class);
		
		//se asigna nombre a los empleados
		se_1.setNombre("Pablo");
		se_2.setNombre("David");
		
		//se muestra el nombre de los empleados
		System.out.println(se_1.getNombre());
		System.out.println(se_2.getNombre());
		
		System.out.println("Equals: "+ se_1.equals(se_2));
		
		//::::prototype
		System.out.println(":::PROTOTYPE:::");
		DirectorEmpleado de_1 = context.getBean("generadorDeEmpleadosDirector", DirectorEmpleado.class);
		DirectorEmpleado de_2 = context.getBean("generadorDeEmpleadosDirector", DirectorEmpleado.class);
		
		//se asigna nombre a los empleados
		de_1.setNombre("José");
		de_2.setNombre("Roberto");
		
		//se muestra el nombre de los empleados
		System.out.println(de_1.getNombre());
		System.out.println(de_2.getNombre());
		
		System.out.println("Equals: "+ de_1.equals(de_2));
		
		
		//END context
		context.close();
	}

}
